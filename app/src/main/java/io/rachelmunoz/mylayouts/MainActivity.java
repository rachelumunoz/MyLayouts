package io.rachelmunoz.mylayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.rachelmunoz.mylayouts.inbox.InboxActivity;
import io.rachelmunoz.mylayouts.login_signup.LoginSignUpActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void gotoLogin(View view) {
		Intent i = new Intent(this, LoginSignUpActivity.class);
		startActivity(i);
	}

	public void gotoInbox(View view) {
		Intent i = new Intent(this, InboxActivity.class);
		startActivity(i);
	}
}
