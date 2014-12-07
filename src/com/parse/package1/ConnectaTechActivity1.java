package com.parse.package1;


import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import java.text.ParseException;

public class ConnectaTechActivity1 extends Activity {
    //int i = 0;
    EditText firstNameText;
    EditText lastNameText;
    EditText emailText;
    EditText userNameText;
    EditText passwordText;
    EditText phoneText;
    EditText altPhoneText;

	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpened(getIntent());

        Button custCreationSub;

        custCreationSub = (Button)findViewById(R.id.button3);
        custCreationSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                firstNameText = (EditText) findViewById(R.id.editText);
                lastNameText = (EditText) findViewById(R.id.editText3);
                emailText = (EditText) findViewById(R.id.editText4);
                userNameText = (EditText) findViewById(R.id.editText6);
                passwordText = (EditText) findViewById(R.id.editText8);
                phoneText = (EditText) findViewById(R.id.editText2);
                altPhoneText = (EditText) findViewById(R.id.editText5);

                ParseUser user = new ParseUser();
                user.setUsername(String.valueOf(userNameText.getText()));
                user.setPassword(String.valueOf(passwordText.getText()));
                user.setEmail(String.valueOf(emailText.getText()));
                user.put("Phone", String.valueOf(phoneText.getText()));
                user.put("altPhone", String.valueOf(altPhoneText.getText()));
                user.put("firstName", String.valueOf(firstNameText.getText()));
                user.put("lastName", String.valueOf(lastNameText.getText()));

                user.signUpInBackground(new SignUpCallback() {

                    public void done(com.parse.ParseException e) {
                        if (e == null) {
                            // Hooray! Let them use the app now.
                        } else {
                            // Sign up didn't succeed. Look at the ParseException
                            // to figure out what went wrong
                        }
                    }

                });







                //ParseObject customer = new ParseObject("Customer");
                //customer.put("firstName", mEdit.getText().toString());
                //customer.put("lastName", "Jackson" + i);

                //setContentView(R.layout.maintest);

                //customer.saveInBackground();
                //i++;

            }
        });



	}
}
