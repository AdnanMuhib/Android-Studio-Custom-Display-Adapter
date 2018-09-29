package com.example.hinakhalid.cart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView mListView;

    String[] countryNames = {"Australia", "Brazil", "China", "France", "Germany", "India", "Ireland", "Italy"
            , "Mexico", "Poland", "Russia", "Spain", "US"};
    int[] countryFlags = {R.drawable.flag_australia,
            R.drawable.flag_brazil,
            R.drawable.flag_china,
            R.drawable.flag_france,
            R.drawable.flag_germany,
            R.drawable.flag_india,
            R.drawable.flag_ireland,
            R.drawable.flag_italy,
            R.drawable.flag_maxico,
            R.drawable.flag_poland,
            R.drawable.flag_russia,
            R.drawable.flag_spain,
            R.drawable.flag_us};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listView);


        FlagAdapter myAdapter = new FlagAdapter(MainActivity.this, countryNames, countryFlags);
        mListView.setAdapter(myAdapter);

        /*ArrayAdapter<String> adapter =new ArrayAdapter<String>(
              this,android.R.layout.simple_list_item_1, countryNames);
        mListView.setAdapter(adapter);*/



        // Create a message handling object as an anonymous class.



        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int i, long id) {
                // Do something in response to the click
                Intent detail=new Intent(MainActivity.this,display.class);
                detail.putExtra("Name", countryNames[i]);
              //  System.out.println(countryFlags[i]);
                detail.putExtra("Flag", countryFlags[i]);
                startActivity(detail);
            }
        });

    }
}
