package acm_aka_the_best.barhopper;

import com.uber.sdk.android.core.UberSdk;
import com.uber.sdk.core.auth.Scope;
import com.uber.sdk.rides.client.SessionConfiguration;

/**
 * Created by Evan on 10/28/2017.
 */

private class UberSdk implements barhopper {
    public UberSdk(SessionConfiguration config) {
        this.config = config;
    }

    SessionConfiguration config = new SessionConfiguration.Builder()
            // mandatory
            .setClientId("HLD_GUi2LB9TnJbALAjQqYBnGL_qp9C7")
            // required for enhanced button features
            .setServerToken("X5KdrYbRlAeLBY51895qu-elOmrDneRWzilEFbx5")
            // required for implicit grant authentication
            //.setRedirectUri("<REDIRECT_URI>")
            // required scope for Ride Request Widget features
            //.setScopes(Arrays.asList(Scope.RIDE_WIDGETS))
            // optional: set sandbox as operating environment
            //.setEnvironment(SessionConfiguration.Environment.SANDBOX)
            .build();
// initialize the SDK with the config object:
    UberSdk.initialize(config);
}
