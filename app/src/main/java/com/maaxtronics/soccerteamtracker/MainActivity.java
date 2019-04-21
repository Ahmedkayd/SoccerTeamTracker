package com.maaxtronics.soccerteamtracker;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int FoulForTeamA = 0;
    int scoreTeamB = 0;
    int FoulForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.soccerTeam));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
       //***********************************************
        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.soccerTeam));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter1);
        //***********************************************
        Spinner mySpinnerA = (Spinner) findViewById(R.id.spinnerA);
        ArrayAdapter<String> myAdapterA = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.teamName));
        myAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinnerA.setAdapter(myAdapterA);
        //***********************************************
        Spinner mySpinnerB = (Spinner) findViewById(R.id.spinnerB);
        ArrayAdapter<String> myAdapterB = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.teamName));
        myAdapterB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinnerB.setAdapter(myAdapterB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        FoulForTeamA = 0;
        FoulForTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayFoulForA(FoulForTeamA);
        displayFoulForB(FoulForTeamB);


    }
        /**

         * Displays the given score for Team A.

         */
            public void addfoulForTeamA(View view){
            FoulForTeamA = FoulForTeamA + 1;
            displayFoulForA(FoulForTeamA);

        }
        public void addOneForTeamA(View view){
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
        }

        public void displayForTeamA(int score) {

            TextView scoreView = (TextView) findViewById(R.id.team_a_score);

            scoreView.setText(String.valueOf("Goal: " +score));

        }
        public void displayFoulForA(int foul){
            TextView foulView = (TextView) findViewById(R.id.team_a_faul);
            foulView.setText(String.valueOf("Foul: "+foul));
        }
        //##################################################### TEAM B####################################################
        public void addOneForTeamB(View view){
            scoreTeamB = scoreTeamB +1;
            displayForTeamB(scoreTeamB);
        }
        public void AddFoulForTeamB(View view){
            FoulForTeamB = FoulForTeamB +1;
            displayFoulForB(FoulForTeamB);
        }

        public void displayForTeamB(int score1) {

            TextView scoreView = (TextView) findViewById(R.id.team_b_score);

            scoreView.setText(String.valueOf("Goal: "+score1));

        }
    public void displayFoulForB(int faul1){
        TextView faulView = (TextView) findViewById(R.id.team_b_faul);
        faulView.setText(String.valueOf("Foul: " +faul1));
    }
    }




