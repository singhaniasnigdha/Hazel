package uk.ac.cam.km662.hazel;

/**
 * Created by sisimac on 11/03/2017.
 */

public class ProfilePull {
    private void getFriendsList() {
        new GraphRequest(
                AccessToken.getCurrentAccessToken(),
                "/{friend-list-id}",
                null,
                HttpMethod.GET,
                new GraphRequest.Callback() {
                    public void onCompleted(GraphResponse response) {
            /* handle the result */
                    }
                }
        ).executeAsync();
    }
}
