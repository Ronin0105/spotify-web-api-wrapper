package spotify.models.players;
import java.util.HashMap;
import java.util.Map;

/**
 * Offset indicates from where in the context playback should start. Only one of the two attributes can be set at the same time.
 *
 * @author Jiankai Zheng
 */

public class Offset {
    private String position;
    private String uri;

    public static Map<String, Boolean> coverageCheck;
    static{
        coverageCheck = new HashMap<>();
        coverageCheck.put("SetPos", false);
        coverageCheck.put("SetURI", false);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (uri != null && !uri.isEmpty()) {
            coverageCheck.put("SetPos", true);
            throw new IllegalStateException("Position can not be set because uri already has a value.");
        }

        this.position = position;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        if (position != null && !position.isEmpty()) {
            coverageCheck.put("SetURI", true);
            System.out.println("SetURI " + coverageCheck.get("SetURI"));
            throw new IllegalStateException("Uri can not be set because position already has a value.");
        }

        System.out.println("SetURI " + coverageCheck.get("SetURI"));
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "Offset{" +
                "position='" + position + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}
