package com.nanodegree.fehr.football.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int pointsTeamA = 0;
    private int pointsTeamB = 0;
    private int foulsTeamA = 0;
    private int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        savedInstanceState.putInt("pointsTeamA", pointsTeamA);
        savedInstanceState.putInt("pointsTeamB", pointsTeamB);
        savedInstanceState.putInt("foulsTeamA", foulsTeamA);
        savedInstanceState.putInt("foulsTeamB", foulsTeamB);
        super.onSaveInstanceState(savedInstanceState);
    }
    //onRestoreInstanceState
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        pointsTeamA = savedInstanceState.getInt("pointsTeamA");
        pointsTeamB = savedInstanceState.getInt("pointsTeamA");
        foulsTeamA = savedInstanceState.getInt("foulsTeamA");
        foulsTeamB = savedInstanceState.getInt("foulsTeamB");
        displayPointsForTeamA(pointsTeamA);
        displayPointsForTeamB(pointsTeamB);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
    }

    public void addOnePointForTeamA(View view) {
        pointsTeamA++;
        displayPointsForTeamA(pointsTeamA);
    }

    public void addOnePointForTeamB(View view) {
        pointsTeamB++;
        displayPointsForTeamB(pointsTeamB);
    }

    public void addOneFoulForTeamA(View view) {
        foulsTeamA++;
        displayFoulsForTeamA(foulsTeamA);
    }

    public void addOneFoulForTeamB(View view) {
        foulsTeamB++;
        displayFoulsForTeamB(foulsTeamB);
    }

    public void resetScore(View view) {
        pointsTeamA = 0;
        pointsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayPointsForTeamA(pointsTeamA);
        displayPointsForTeamB(pointsTeamB);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
    }

    public void displayPointsForTeamA(int points) {
        TextView pointsView = (TextView) findViewById(R.id.team_a_score);
        pointsView.setText(String.valueOf(points));
    }

    public void displayPointsForTeamB(int points) {
        TextView pointsView = (TextView) findViewById(R.id.team_b_score);
        pointsView.setText(String.valueOf(points));
    }

    public void displayFoulsForTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    public void displayFoulsForTeamB(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(fouls));
    }
}
