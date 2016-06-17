package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void done(View v){
        EditText text1= (EditText) findViewById(R.id.first_Team);
        EditText text2= (EditText) findViewById(R.id.second_Team);
        String s1= text1.getText().toString();
        String s2= text2.getText().toString();

        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("team1",s1);
        i.putExtra("team2", s2);
        startActivity(i);
    }

}
