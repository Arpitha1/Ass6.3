package com.example.abhi.frag;

import android.graphics.drawable.Drawable;

/**
 * Created by Abhi on 23-06-2017.
 */

public class ListViewItem {
    public final Drawable icon;       // the drawable for the ListView item ImageView
    public final String title;        // the text for the ListView item title
    public final String description;  // the text for the ListView item description

    public ListViewItem(Drawable icon, String title, String description) {
        this.icon = icon;
        this.title = title;
        this.description = description;
    }
}

