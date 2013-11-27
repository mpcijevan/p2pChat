package com.mpci.p2pchat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class UserProfile extends Activity{
	
	Button mSave;
	Button mLogOut;
	EditText mProfile;
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.user_profile);
	        
	        mProfile = (EditText)findViewById(R.id.edit_profile);
	        
	        mSave = (Button)findViewById(R.id.save);
	        mLogOut = (Button)findViewById(R.id.logout);
	        
	        mSave.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
				}
			});
	        
	        mLogOut.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
				}
			});
	  }
}
