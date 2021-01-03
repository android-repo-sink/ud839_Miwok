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
import android.widget.ImageView;
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

        // get the relevant content
        Word wordObject = getItem(position);

        // change content of the view
        ((TextView) list_item_view.findViewById(R.id.defaultTranslation)).setText(wordObject.getDefaultTranslation());
        ((TextView) list_item_view.findViewById(R.id.miwokTranslation)).setText(wordObject.getMiwokTranslation());

        // change the image
        Integer content_image_id = wordObject.getmImageResourceId();
        ImageView content_imageView = (ImageView) list_item_view.findViewById(R.id.list_item_content_image);
        if (content_image_id == null) // we are dealing with phrases which don't have an image
            content_imageView.setVisibility(View.GONE);
        else
            content_imageView.setImageResource(content_image_id);
        return list_item_view;
    }
}