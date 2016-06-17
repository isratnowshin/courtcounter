package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA= 0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView info1= (TextView) findViewById(R.id.teamA);
        TextView info2=(TextView) findViewById(R.id.teamB);
        Intent intent1 = getIntent();
        String sentData=intent1.getStringExtra("team1");
        String sentData2=intent1.getStringExtra("team2");
        info1.setText(sentData);
        info2.setText(sentData2);
    }
    public void teamA3(View v){
    scoreA= scoreA+3;
        displayForTeamA(scoreA);
    }
    public void teamA2(View v){
        scoreA= scoreA+2;
        displayForTeamA(scoreA);
    }
    public void teamAfree(View v){
        scoreA= scoreA+1;
        displayForTeamA(scoreA);
    }
    public void reset(View v){
        scoreA=0;
        displayForTeamA(scoreA);
        scoreB=0;
        displayForTeamB(scoreB);

    }
    public void displayForTeamA(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void teamB3(View v){
        scoreB= scoreB+3;
        displayForTeamB(scoreB);
    }
    public void teamB2(View v){
        scoreB= scoreB+2;
        displayForTeamB(scoreB);
    }
    public void teamBfree(View v){
        scoreB= scoreB+1;
        displayForTeamB(scoreB);
    }

    public void displayForTeamB(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
