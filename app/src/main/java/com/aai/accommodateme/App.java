package com.aai.accommodateme;
import android.app.Application;
import com.parse.ParseObject;
import com.parse.Parse;

/**
 * Created by AbdulMuhsin on 9/12/2015.
 */
public class App extends Application {
    @Override public void onCreate(){
        super.onCreate();
        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(User.class);
        ParseObject.registerSubclass(Accommodation.class);
        ParseObject.registerSubclass(Image.class);
        ParseObject.registerSubclass(Location.class);
        ParseObject.registerSubclass(Review.class);
        Parse.initialize(this, "oUmTzxazClh34AbYgxXGr8TOLAodaOg72oXUU2JO", "OaCuX1LCNPGyrjFSumF167tXsuxdUolrZ0mCBXH1");
    }
}
