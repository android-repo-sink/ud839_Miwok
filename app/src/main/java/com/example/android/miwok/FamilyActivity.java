package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        populateList();
    }

    // populate using ListView and ArrayAdapter
    private void populateList() {

        // DS - data store
        // list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "әpә"));
        words.add(new Word("mother", "әṭa"));
        words.add(new Word("son", "angsi"));
        words.add(new Word("daughter", "tune"));
        words.add(new Word("older brother", "taachi"));
        words.add(new Word("younger brother", "chalitti"));
        words.add(new Word("older sister", "teṭe"));
        words.add(new Word("younger sister", "kolliti"));
        words.add(new Word("grandmother", "ama"));
        words.add(new Word("grandfather", "paapa"));
        // ArrayAdapter - concrete class, displays using getView. Have to specify type of content
        // constructor - context, listitem_view, content array
        WordAdapter arrayAdapter = new WordAdapter(this, R.layout.list_item, words);

        // ListView takes the array as adapter
        ListView lv = (ListView) findViewById(R.id.word_list);

        // attach adapter to ListView
        lv.setAdapter(arrayAdapter);
    }
}