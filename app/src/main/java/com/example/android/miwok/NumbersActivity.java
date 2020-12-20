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
        // list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));
        // ArrayAdapter - concrete class, displays using getView. Have to specify type of content
        // constructor - context, listitem_view, content array
        ArrayAdapter<Word> arrayAdapter = new ArrayAdapter<>(this, R.layout.list_item, words);

        // ListView takes the array as adapter
        ListView lv = (ListView) findViewById(R.id.numbers_list);

        // attach adapter to ListView
        lv.setAdapter(arrayAdapter);
    }
}