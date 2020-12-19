package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        populateList();
    }

    private void populateList() {
        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        LinearLayout numbers_list = (LinearLayout) findViewById(R.id.numbers_list);
        for (String number : numbers) {
            TextView number_item = new TextView(this);
            number_item.setTextSize(24);
            number_item.setText((number.charAt(0) + "").toUpperCase() + number.substring(1));
            if (numbers_list != null)
                numbers_list.addView(number_item);
        }
    }
}