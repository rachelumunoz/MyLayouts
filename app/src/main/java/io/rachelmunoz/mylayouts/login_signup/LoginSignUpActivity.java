package io.rachelmunoz.mylayouts.login_signup;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.rachelmunoz.mylayouts.R;

public class LoginSignUpActivity extends AppCompatActivity {

	private static final String TAG = "SignupDialog";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_signup);
	}

	public void showSignupDialog(View view) {
		FragmentManager fm = getSupportFragmentManager();
		SignupDialogFragment dialog = new SignupDialogFragment();
		dialog.show(fm, TAG);
	}
}
