package spotify.factories;

import com.google.gson.*;
import spotify.models.episodes.EpisodeFull;
import spotify.models.generic.AbstractPlayableObject;
import spotify.models.tracks.TrackFull;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

class AbstractPlayableObjectDeserializer implements JsonDeserializer<AbstractPlayableObject> {

    public static Map<String, Boolean> coverageCheck;
    static{
        coverageCheck = new HashMap<>();
        coverageCheck.put("NullTest", false);
    }

    @Override
    public AbstractPlayableObject deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement jsonElement = jsonObject.get("type");

        String objectType = jsonElement.getAsString();

        AbstractPlayableObject childClass = null;

        if (objectType.equals("track")) {
            childClass = jsonDeserializationContext.deserialize(json, TrackFull.class);
        } else if (objectType.equals("episode")) {
            coverageCheck.put("NullTest", true);
            childClass = jsonDeserializationContext.deserialize(json, EpisodeFull.class);
        }

        System.out.println(coverageCheck.get("NullTest"));
        return childClass;
    }
}
