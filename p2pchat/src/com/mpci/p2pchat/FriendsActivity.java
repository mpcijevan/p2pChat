package com.mpci.p2pchat;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
 
public class FriendsActivity extends Activity {
    ListView list;
    String[] web = {
    		"friend1",
            "friend2",
            "friend3",
            "serine",
            "hovik",
            "roza",
            "artush",
            "artak",
            "lilit",
    } ;
    Integer[] imageId = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
    };
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.users);
 
        CustomList adapter = new CustomList(FriendsActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
 
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(FriendsActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
 
                    }
                });
 
    }
 
}