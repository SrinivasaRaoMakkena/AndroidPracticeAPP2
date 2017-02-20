package com.nwmissouri.gesturespractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {
    private  String[] list = {"GestureActivity","FragmentActivity","SQLiteActivity","","","",""};
    private ListView listOfActivities;
    private ArrayAdapter myArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listOfActivities = (ListView) findViewById(R.id.listOfAllActivities);
        myArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);

        if (listOfActivities!=null){
            listOfActivities.setAdapter(myArrayAdapter);
        }

        listOfActivities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),list[i],Toast.LENGTH_SHORT);
                Log.v("Activity",list[i]);
            }
        });


    }
}
