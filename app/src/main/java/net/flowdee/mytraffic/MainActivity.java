package net.flowdee.mytraffic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyData myData;
    private String[] titleStrings, detailStrings;
    private int[] ints;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get value for MyData
        getValueMyData();

        //Create listview
        createListView();

    } // method main

    private void createListView() {

        //Initial View
        listView = (ListView) findViewById(R.id.livTraffic);
        MyAdapter myAdapter = new MyAdapter(this, titleStrings, detailStrings, ints);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Title", titleStrings[position]);
                intent.putExtra("Detail",detailStrings[position]);
                intent.putExtra("Image", ints[position]);
                startActivity(intent);

            }
        });


    }

    private void getValueMyData() {
        myData = new MyData();
        titleStrings = myData.getTitleStrings();
        detailStrings = myData.getDetailString();
        ints = myData.getInts();

        // check value
        String tag = "21MayV1";
        String tag1 = "21MayV2";
        for (int i = 0; i < titleStrings.length; i++) {
            Log.d(tag, "titleString(" + i + ") ==> " + titleStrings[i]);
            Log.d(tag1, "detailString(" + i + ") ==> " + detailStrings[i]);
        }

    }


} // main class
