package com.parse.package1;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class ConnectaTechActivity1 extends Activity {
    int i = 0;
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpened(getIntent());


        Button mButton;
        mButton = (Button)findViewById(R.id.button1);
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ParseObject customer = new ParseObject("Customer");
                customer.put("firstName", "James");
                customer.put("lastName", "Jackson" + i);
                customer.saveInBackground();
                i++;

            }
        });

	}
}
