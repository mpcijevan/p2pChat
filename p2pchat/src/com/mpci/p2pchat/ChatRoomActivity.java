package com.mpci.p2pchat;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ChatRoomActivity extends ListActivity {
	
	Button mSend;
	EditText mMessage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chat_room);
		
		mMessage = (EditText)findViewById(R.id.edit_message);
		mSend = (Button)findViewById(R.id.send);
		
		mSend.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
								
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chat_room, menu);
		return true;
	}

}
