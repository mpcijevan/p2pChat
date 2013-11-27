package com.mpci.p2pchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	Button mLogin;
	EditText mNick;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mNick = (EditText)findViewById(R.id.edit_nickname);
		
		mLogin = (Button)findViewById(R.id.login);
		mLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				final String nickName;
				nickName = mNick.getText().toString();
				Log.i("nick",nickName);
				Intent intent = new Intent(MainActivity.this, HomeActivity.class);
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
