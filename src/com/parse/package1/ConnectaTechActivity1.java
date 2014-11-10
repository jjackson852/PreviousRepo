package com.parse.package1;

import android.app.Activity;
import android.os.Bundle;

import com.parse.package1.ConnectaTechApp;import com.parse.ParseAnalytics;
import com.parse.ParseObject;import com.parse.package1.R;

public class ConnectaTechActivity1 extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpened(getIntent());

        ParseObject customer = new ParseObject("Customer");
        customer.put("First Name", "Adam");
        customer.put("Last Name", "Jacobs");
        customer.saveInBackground();


	}
}
