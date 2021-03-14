package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    //initializes parse SDK as soon as application is created.
    @Override
    public void onCreate() {
        super.onCreate();
        // Register parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("dxkhuC84nwcSn6txTyq9xfcuFbbuiz7d6hR3rYDQ")
                .clientKey("oH7EoyM33Q6FQYg5MxraxfXIFjcLHy4BAckJitvK")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
