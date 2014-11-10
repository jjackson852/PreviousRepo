package com.parse.package1;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class ConnectaTechActivity1 extends Activity {
    int i = 0;
    EditText mEdit;

	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpened(getIntent());


        Button mButton;

        mButton = (Button)findViewById(R.id.button1);
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit   = (EditText)findViewById(R.id.editText);

                ParseObject customer = new ParseObject("Customer");
                customer.put("firstName", mEdit.getText().toString());
                customer.put("lastName", "Jackson" + i);

                customer.saveInBackground();
                i++;

            }
        });

	}
}
