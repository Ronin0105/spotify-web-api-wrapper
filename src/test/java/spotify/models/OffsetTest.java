package spotify.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import spotify.exceptions.HttpRequestFailedException;
import spotify.models.players.Offset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OffsetTest {

    @Test
    void setPositionTest() {
        Offset offset = new Offset();
        String position = "5";
        offset.setPosition(position);
        assertEquals(position, offset.getPosition());
    }

    @Test
    void setUriTest() {
        Offset offset = new Offset();
        String uri = "uri";
        offset.setUri(uri);
        assertEquals(uri, offset.getUri());
    }

    @Test
    void setPositionExisting() {
        Offset offset = new Offset();
        String uri = "sampletext";
        String pos = "5";

        offset.setUri(uri);

        Assertions.assertThrows(IllegalStateException.class, () -> offset.setPosition(pos));
    }

    @Test
    void setUriExisting() {
        Offset offset = new Offset();
        String uri = "sampletext";
        String pos = "5";

        offset.setPosition(pos);

        Assertions.assertThrows(IllegalStateException.class, () -> offset.setUri(uri));
    }

}