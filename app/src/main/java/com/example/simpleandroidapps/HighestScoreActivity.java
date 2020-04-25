package com.example.simpleandroidapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class HighestScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score);

        TextView txtScore = (TextView) findViewById(R.id.textscore);
        TextView textHighScore = (TextView)findViewById(R.id.highscore);

        Intent intent = getIntent();

        int score = intent.getIntExtra("score", 0);
        txtScore.setText("Your Score :" + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore", 0);
        if (highscore >= score){
            textHighScore.setText("High Score : " + highscore);
        }
        else {
            textHighScore.setText("New Highscore : " +  score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.commit();
        }


    }
}
