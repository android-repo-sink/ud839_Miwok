package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

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
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));
        System.out.println(23);
        // ArrayAdapter - concrete class, displays using getView. Have to specify type of content
        // constructor - context, listitem_view, content array
        WordAdapter arrayAdapter = new WordAdapter(this, R.layout.list_item, words, R.color.category_phrases);

        // ListView takes the array as adapter
        ListView lv = (ListView) findViewById(R.id.word_list);

        // attach adapter to ListView
        lv.setAdapter(arrayAdapter);
    }
}