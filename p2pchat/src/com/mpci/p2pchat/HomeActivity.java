package com.mpci.p2pchat;

import com.mpci.p2pchat.R;

import android.app.ActionBar;
import android.app.TabActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class HomeActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

	
		TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

		TabSpec tab1 = tabHost.newTabSpec("First Tab");
		TabSpec tab2 = tabHost.newTabSpec("Second Tab");
		TabSpec tab3 = tabHost.newTabSpec("Third tab");

		
		tab1.setIndicator("Users");
		tab1.setContent(new Intent(this, UsersActivity.class));

		tab2.setIndicator("Friends");
		tab2.setContent(new Intent(this, FriendsActivity.class));

		tab3.setIndicator("Profile");
		tab3.setContent(new Intent(this, UserProfile.class));

		
		tabHost.addTab(tab1);
		tabHost.addTab(tab2);
		tabHost.addTab(tab3);

	}
}
