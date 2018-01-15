package io.oisin.gaascorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // These are my variables for scores
    int goalsTeamA = 0, pointsTeamA = 0, goalsTeamB = 0, pointsTeamB = 0;
    TextView scoreViewA, scoreViewB, pointsViewA, pointsViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewA = (TextView) findViewById(R.id.team_a_score);
        pointsViewA = (TextView) findViewById(R.id.team_a_scoreInPoints);
        scoreViewB = (TextView) findViewById(R.id.team_b_score);
        pointsViewB = (TextView) findViewById(R.id.team_b_scoreInPoints);
    }

    /**
     * Sets the scores to 0 and displays the new score
     */
    public void resetScore(View view) {
        goalsTeamA = 0;
        pointsTeamA = 0;
        goalsTeamB = 0;
        pointsTeamB = 0;

        displayForTeamA(goalsTeamA, pointsTeamA);
        displayForTeamB(goalsTeamB, pointsTeamB);
    }

    /**
     * Adds a point for Team A
     */
    public void pointForTeamA(View view) {
        pointsTeamA = pointsTeamA + 1;
        displayForTeamA(goalsTeamA, pointsTeamA);
    }

    /**
     * Adds a goal for Team A
     */
    public void goalForTeamA(View view) {
        goalsTeamA = goalsTeamA + 1;
        displayForTeamA(goalsTeamA, pointsTeamA);
    }

    /**
     * Adds a point for Team B
     */
    public void pointForTeamB(View view) {
        pointsTeamB = pointsTeamB + 1;
        displayForTeamB(goalsTeamB, pointsTeamB);
    }

    /**
     * Adds a goal for Team B
     */
    public void goalForTeamB(View view) {
        goalsTeamB = goalsTeamB + 1;
        displayForTeamB(goalsTeamB, pointsTeamB);
    }

    /**
     * Displays the given score for Team A.
     *
     * @param goals  the number of goals to display
     * @param points the number of points to display
     */
    public void displayForTeamA(int goals, int points) {
//        scoreViewA = (TextView) findViewById(R.id.team_a_score);
//        pointsViewA = (TextView) findViewById(R.id.team_a_scoreInPoints);
        scoreViewA.setText(String.valueOf(goals) + " - " + String.valueOf(points));
        pointsViewA.setText("(" + (String.valueOf(goals * 3 + points)) + " points)");
    }

    /**
     * Displays the given score for Team B.
     *
     * @param goals  the number of goals to display
     * @param points the number of points to display
     */
    public void displayForTeamB(int goals, int points) {
//        scoreViewB = (TextView) findViewById(R.id.team_b_score);
//        pointsViewB = (TextView) findViewById(R.id.team_b_scoreInPoints);
        scoreViewB.setText(String.valueOf(goals) + " - " + String.valueOf(points));
        pointsViewB.setText("(" + (String.valueOf(goals * 3 + points)) + " points)");
    }
}
