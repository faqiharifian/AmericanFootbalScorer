package com.arifian.udacity.americanfootbalscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView teamAScoreTextView, teamBScoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScoreTextView = (TextView) findViewById(R.id.text_team_a_score);
        teamBScoreTextView = (TextView) findViewById(R.id.text_team_b_score);
    }

    public void clickSafety(View view){
        switch (view.getId()){
            case R.id.button_team_a_safety:
                scored(teamAScoreTextView, 2);
                break;
            case R.id.button_team_b_safety:
                scored(teamBScoreTextView, 2);
                break;
        }
    }

    public void clickFieldGoal(View view){
        switch (view.getId()){
            case R.id.button_team_a_field_goal:
                scored(teamAScoreTextView, 3);
                break;
            case R.id.button_team_b_field_goal:
                scored(teamBScoreTextView, 3);
                break;
        }
    }

    public void clickTouchdown(View view){
        switch (view.getId()){
            case R.id.button_team_a_touchdown:
                scored(teamAScoreTextView, 6);
                break;
            case R.id.button_team_b_touchdown:
                scored(teamBScoreTextView, 6);
                break;
        }
    }

    public void resetScore(View view){
        teamAScoreTextView.setText("0");
        teamBScoreTextView.setText("0");
    }

    private void scored(TextView tv, int score){
        int oldScore = Integer.valueOf(tv.getText().toString());
        tv.setText(String.valueOf(oldScore+score));
    }
}
