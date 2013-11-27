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

<<<<<<< HEAD
	
		TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
=======
		setupTabHost();
		mTabHost.getTabWidget();

		setupTab(new TextView(this), getResources().getString(R.string.tab_online));
		setupTab(new TextView(this), getResources().getString(R.string.tab_friends));
		setupTab(new TextView(this), getResources().getString(R.string.tab_profile));
		
	}
>>>>>>> 12427e3aff254e864580ee23f04dda91b2c1ba62

		TabSpec tab1 = tabHost.newTabSpec("First Tab");
		TabSpec tab2 = tabHost.newTabSpec("Second Tab");
		TabSpec tab3 = tabHost.newTabSpec("Third tab");

		
		tab1.setIndicator("Users");
		tab1.setContent(new Intent(this, UsersActivity.class));

<<<<<<< HEAD
		tab2.setIndicator("Friends");
		tab2.setContent(new Intent(this, FriendsActivity.class));

		tab3.setIndicator("Profile");
		tab3.setContent(new Intent(this, UserProfile.class));

		
		tabHost.addTab(tab1);
		tabHost.addTab(tab2);
		tabHost.addTab(tab3);
=======
		TabSpec setContent = mTabHost.newTabSpec(tag).setIndicator(tabview);
		setContent.setContent(new TabContentFactory() {
			public View createTabContent(String tag) {return view;}
		});
		mTabHost.addTab(setContent);


	}
>>>>>>> b01e43fe1259d385b4ffbf4d89bd65c3417487e2

	}
<<<<<<< HEAD
}
=======
	
	
}
>>>>>>> b01e43fe1259d385b4ffbf4d89bd65c3417487e2
