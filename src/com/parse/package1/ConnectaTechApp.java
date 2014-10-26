package com.parse.package1;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class ConnectaTechApp extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Add your initialization code here
    Parse.initialize(this, "KDRvsx2RMM1vqjlfCOgTd825x82kjWwhaazQRtbm", "7C6CUyoUxT0mv2f0IKQqrafVB2AZXjaSdAtvv8oe");


    ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
      
    // If you would like all objects to be private by default, remove this line.
    defaultACL.setPublicReadAccess(true);
    
    ParseACL.setDefaultACL(defaultACL, true);
      //Testing Push
  }
}
