package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int usaScore = 0;
    int frenchScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayUSA(0);
        displayFrance(0);
    }
     // Decrease the score for USA by 1 point.
    public void decpointUSA(View v) {
        usaScore = usaScore - 1;
        displayUSA(usaScore);
    }
     //Increases the score for USA by 1 point.
    public void incpointUSA(View v) {
        usaScore = usaScore + 1;
        displayUSA(usaScore);
    }

     // Displays the given score for USA.
    public void displayUSA(int score) {
        TextView scoreView = findViewById(R.id.usaScore);
        scoreView.setText(String.valueOf(score));
    }
     // Displays the given score for France.
    public void displayFrance(int score) {
        TextView scoreView = findViewById(R.id.frenchScore);
        scoreView.setText(String.valueOf(score));
    }

     // Decrease the score for France by 1 point.
    public void decpointFR(View v) {
        frenchScore = frenchScore - 1;
        displayFrance(frenchScore);
    }
     // Increase the score for France by 1 point.

    public void incpointFR(View v) {
        frenchScore = frenchScore + 1;
        displayFrance(frenchScore);

    }
     // RESET scores
    public void resetScore(View v) {
        usaScore = 0;
        frenchScore = 0;
        displayUSA(usaScore);
        displayFrance(frenchScore);
    }
}