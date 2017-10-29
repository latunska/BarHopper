package acm_aka_the_best.barhopper;

/**
 * Created by Evan on 10/28/2017.
 */
import com.uber.sdk.android.core.UberSdk;
import com.uber.sdk.core.auth.Scope;
import com.uber.sdk.rides.client.SessionConfiguration;
import com.uber.sdk.core.auth.Authenticator;
import com.uber.sdk.core.auth.internal.OAuth2Service;
import com.uber.sdk.android.core.BuildConfig;
import com.uber.sdk.rides.client.services.RidesService;
import com.uber.sdk.rides.client.*;
import com.uber.sdk.core.*; // This I THINK imports everything starting with that import line. -E
import com.uber.sdk.android.core.UberButton;

// More imports needed.############### Use this process to get the missing bits https://developer.uber.com/docs/riders/ride-requests/tutorials/button/android

 class UberSdk {
    SessionConfiguration config = new SessionConfiguration.Builder()
            .setClientId("HLD_GUi2LB9TnJbALAjQqYBnGL_qp9C7") //This is necessary
            .setServerToken("X5KdrYbRlAeLBY51895qu-elOmrDneRWzilEFbx5")
            //.setRedirectUri("") //This is necessary if you'll be using implicit grant
           // .setEnvironment(Environment.SANDBOX) //Useful for testing your app in the sandbox environment
           // .setScopes(Arrays.asList(Scope.PROFILE, Scope.RIDE_WIDGETS)) //Your scopes for authentication here
            .build();
}
