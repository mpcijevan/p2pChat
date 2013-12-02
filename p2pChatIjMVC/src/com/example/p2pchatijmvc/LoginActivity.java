package com.example.p2pchatijmvc;

import com.actionbarsherlock.app.SherlockFragmentActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends SherlockFragmentActivity {

		Button mLogin;
		EditText mNick;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_login);
			
			mLogin = (Button)findViewById(R.id.login);
			mNick = (EditText)findViewById(R.id.edit_nickname);
			
			mLogin.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					final String nickName = mNick.getText().toString();
					Intent intent = new Intent(LoginActivity.this, MainActivity.class);
					startActivity(intent);
				}
			});
		}

}
