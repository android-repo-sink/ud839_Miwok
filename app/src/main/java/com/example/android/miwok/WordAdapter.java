package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.LayoutInflaterCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public WordAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public WordAdapter(@NonNull Context context, int resource, @NonNull Word[] objects) {
        super(context, resource, objects);
    }

    public WordAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Word[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public WordAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects) {
        super(context, resource, objects);
    }

    public WordAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Word> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // We just need to change content for the convertView
        // 'parent' is the ListView item

        // convertView - the view being recycled. It is our list_item.xml view.
        LinearLayout list_item_view = (LinearLayout) convertView; // casting a null - NOT A PROBLEM in Java

        // Fresh views - created screen is not full of list_views
        if (convertView == null) {
            // The adapter needs to create list_item views from our XML file, because it maintains the scrap pile.
            // This is done by using LayoutInflater class - it notifies the adapter about new objects.
            list_item_view = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Log.d("CustomAdapter", "Reycling started");

        // get the relevant content
        Word wordObject = getItem(position);

        // change content of the viewe
        ((TextView) list_item_view.getChildAt(0)).setText(wordObject.getDefaultTranslation());
        ((TextView) list_item_view.getChildAt(1)).setText(wordObject.getMiwokTranslation());
        Log.d("CustomAdapter", "Reycling finished");

        // return the list_item view
        return list_item_view;
    }
}
