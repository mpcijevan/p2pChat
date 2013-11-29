package com.mpci.actionBar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;

public class UserProfile extends Fragment {
	Button mLogin;
	Button mSave;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        View view = inflater.inflate(R.layout.user_profile, null);
	        mLogin = (Button)view.findViewById(R.id.log_out);
	        mSave = (Button)view.findViewById(R.id.save);
	        
	        mLogin.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					System.exit(0);
				}
			});
	        mSave.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
				}
			});
	        return view;
}
}
