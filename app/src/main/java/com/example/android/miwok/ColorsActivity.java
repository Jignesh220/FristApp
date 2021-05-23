package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<word> color=new ArrayList<word>();
        color.add(new word("red", "weṭeṭṭi"));
        color.add(new word("mustard yellow", "chiwiiṭә"));
        color.add(new word("dusty yellow", "ṭopiisә"));
        color.add(new word("green", "chokokki"));
        color.add(new word("brown", "ṭakaakki"));
        color.add(new word("gray", "ṭopoppi"));
        color.add(new word("black", "kululli"));
        color.add(new word("white", "kelelli"));

        WordAdapter adapter=new WordAdapter(this,color);
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}