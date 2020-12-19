package com.example.android.miwok;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        populateList();
    }

    // populate using ListView and ArrayAdapter
    private void populateList() {

        // DS - data store
        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

//        code to check memory usage in Profiler, comment out the bare-bones array above
//        ArrayList<String> numbers = new ArrayList<>();
//        for (Integer i = 0; i < 10000; i++)
//            numbers.add(i + "");

        // ArrayAdapter - concrete class, displays using getView. Have to specify type of content
        // constructor - context, listitem_view, content array
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.listitem_view, numbers);

        // ListView takes the array as adapter
        ListView lv = (ListView) findViewById(R.id.numbers_list); // this is the listview
        lv.setAdapter(arrayAdapter);
    }
}