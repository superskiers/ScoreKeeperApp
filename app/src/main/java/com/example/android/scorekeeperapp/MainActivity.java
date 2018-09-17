package com.example.android.scorekeeperapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declare variables
    private int usaScore = 0;
    private int frenchScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inflate the layout
        setContentView(R.layout.activity_main);
        //Initialize variables
        displayUSA(0);
        displayFrance(0);
    }

    // Decrease the score for USA by 1 point.
    public void decpointUSA(View v) {
        usaScore = usaScore - 1;
        if (usaScore < 0) {
            usaScore = 0;
        }
        displayUSA(usaScore);
    }

    //Increases the score for USA by 1 point.
    public void incpointUSA(View v) {
        usaScore = usaScore + 1;
        displayUSA(usaScore);
        //if statement creates an intent to TheWinnerIs activity
        if (usaScore >= 11) {
            displayUSA(11);
            Intent usaWins = new Intent(this, TheWinnerIs.class);
            usaWins.putExtra("USA WON", "USA WINS");
            startActivity(usaWins);
        }
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
        if (frenchScore < 0) {
            frenchScore = 0;
        }
        displayFrance(frenchScore);
    }

    // Increase the score for France by 1 point.
    public void incpointFR(View v) {
        frenchScore = frenchScore + 1;
        displayFrance(frenchScore);
        //if statement creates an intent to TheWinnerIs activity
        if (frenchScore >= 11) {
            displayFrance(11);
            Intent franceWins = new Intent(this, TheWinnerIs.class);
            franceWins.putExtra("FRANCE WON", "FRANCE WINS");
            startActivity(franceWins);
        }
    }
    // RESET scores
    public void resetScore(View v) {
        usaScore = 0;
        frenchScore = 0;
        displayUSA(usaScore);
        displayFrance(frenchScore);
    }
}