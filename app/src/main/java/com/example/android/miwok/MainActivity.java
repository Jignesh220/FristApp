package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number = (TextView)findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,NumberActivity.class);
                startActivity(i);
                Toast.makeText(v.getContext(),"open the list of number",Toast.LENGTH_SHORT).show();
            }
        });

        TextView color =(TextView)findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(j);
                Toast.makeText(v.getContext(),"open the list of color",Toast.LENGTH_SHORT).show();
            }
        });

        TextView family =(TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(k);
                Toast.makeText(v.getContext(),"open the list of family",Toast.LENGTH_SHORT).show();
            }
        });

        TextView phrases =(TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(MainActivity.this,Phrases.class);
                startActivity(l);
                Toast.makeText(v.getContext(),"open the list of phrases",Toast.LENGTH_SHORT).show();
            }
        });
    }
}