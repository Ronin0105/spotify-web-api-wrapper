package spotify.utils;

import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Response;
import spotify.api.enums.HttpStatusCode;
import spotify.api.impl.PlaylistApiRetrofit;
import spotify.exceptions.SpotifyActionFailedException;
import spotify.models.errors.SpotifyError;

class ResponseCheckerTest {
    @Test
    void throwIfRequestHasNotBeenFulfilledCorrectlyTestWithDifferentStatusCode() {

        // Create a response object that signifies an error in the client side.
        Response<String> response = Response.error(400, ResponseBody.create(MediaType.parse("application/json"), ""));
        // Check the corresponding exception is thrown. It is likely that line 56 will be covered
        // because if there is a client error and we pass 200 (HTTP.OK) as the expected status code,
        // we can get the assertThrows method to throw an exception.
        Assertions.assertThrows(SpotifyActionFailedException.class, () -> {
            ResponseChecker.throwIfRequestHasNotBeenFulfilledCorrectly(response, HttpStatusCode.OK);
        });
    }


}