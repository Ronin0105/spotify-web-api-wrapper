package spotify.models;

import org.junit.jupiter.api.Test;
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

}