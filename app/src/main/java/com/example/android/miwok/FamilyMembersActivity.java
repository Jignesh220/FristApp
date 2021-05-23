package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<word> family = new ArrayList<word>();
        family.add(new word("father", "әpә"));
        family.add(new word("mother", "әṭa"));
        family.add(new word("son", "angsi"));
        family.add(new word("daughter", "tune"));
        family.add(new word("older brother", "taachi"));
        family.add(new word("younger brother", "chalitti"));
        family.add(new word("older sister", "teṭe"));
        family.add(new word("younger sister", "kolliti"));
        family.add(new word("grandmother ", "ama"));
        family.add(new word("grandfather", "paapa"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}