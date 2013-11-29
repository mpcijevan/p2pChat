package com.mpci.actionBar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;

public class OnlineFriends extends Fragment {

	private String arry[] = { "Lilit", "Hovik", "Serine", "Roza",
			"Artak", "Artush","Lilit", "Hovik", "Serine", "Roza",
			"Artak", "Artush", "Lilit", "Hovik", "Serine", "Roza",
			"Artak", "Artush", "Lilit", "Hovik", "Serine", "Roza",
			"Artak", "Artush"};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		ListView listView = new ListView(getActivity());
		ArrayAdapter<String> array = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1);
		for (String str : arry)
			array.add(str);
		listView.setAdapter(array);
		return listView;
	}
}
