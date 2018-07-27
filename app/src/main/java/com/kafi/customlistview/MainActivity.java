package com.kafi.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] countryNames;

    int[] flags = {R.drawable.bangladesh,R.drawable.argentina,R.drawable.brazil};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);
        countryNames =getResources().getStringArray(R.array.country_name);

        CustomAdapter adapter = new CustomAdapter(MainActivity.this,countryNames,flags);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = countryNames[i];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
