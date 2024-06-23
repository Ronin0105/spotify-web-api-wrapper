package spotify.utils;

import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.Gson;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Response;
import spotify.api.enums.HttpStatusCode;
import spotify.api.impl.PlaylistApiRetrofit;
import spotify.exceptions.SpotifyActionFailedException;
import spotify.models.errors.SpotifyError;

class ResponseCheckerTest {
    private PlaylistApiRetrofit sut;
    @Test
    void checkErrorBodyTest(){
        ResponseBody temp;

    }

}