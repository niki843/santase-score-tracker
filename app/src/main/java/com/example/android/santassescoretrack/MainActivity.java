package com.example.android.santassescoretrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showScorePlayer1 (int playerScore){
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(playerScore));
    }

    public void showScorePlayer2 (int playerScore){
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(playerScore));
    }

    public void clearScorePlayer1(View view){
        scorePlayer1 = 0;
        showScorePlayer1(scorePlayer1);
    }

    public void clearScorePlayer2(View view){
        scorePlayer2 = 0;
        showScorePlayer2(scorePlayer2);
    }

    public void addAcePlayer1 (View view){
        scorePlayer1 += 11;
        showScorePlayer1(scorePlayer1);
    }

    public void addKingPlayer1 (View view){
        scorePlayer1 += 4;
        showScorePlayer1(scorePlayer1);
    }

    public void addQueenPlayer1 (View view){
        scorePlayer1 += 3;
        showScorePlayer1(scorePlayer1);
    }

    public void addJokerPlayer1 (View view){
        scorePlayer1 += 2;
        showScorePlayer1(scorePlayer1);
    }

    public void addTenPlayer1 (View view){
        scorePlayer1 += 10;
        showScorePlayer1(scorePlayer1);
    }

    public void addNinePlayer1 (View view){
        scorePlayer1 += 0;
        showScorePlayer1(scorePlayer1);
    }

    public void addTwentyPlayer1 (View view){
        scorePlayer1 += 20;
        showScorePlayer1(scorePlayer1);
    }

    public void addFourtyPlayer1 (View view){
        scorePlayer1 += 40;
        showScorePlayer1(scorePlayer1);
    }

    public void addAcePlayer2 (View view){
        scorePlayer2 += 11;
        showScorePlayer2(scorePlayer2);
    }

    public void addKingPlayer2 (View view){
        scorePlayer2 += 4;
        showScorePlayer2(scorePlayer2);
    }

    public void addQueenPlayer2 (View view){
        scorePlayer2 += 3;
        showScorePlayer2(scorePlayer2);
    }

    public void addJokerPlayer2 (View view){
        scorePlayer2 += 2;
        showScorePlayer2(scorePlayer2);
    }

    public void addTenPlayer2 (View view){
        scorePlayer2 += 10;
        showScorePlayer2(scorePlayer2);
    }

    public void addNinePlayer2 (View view){
        scorePlayer2 += 0;
        showScorePlayer2(scorePlayer2);
    }

    public void addTwentyPlayer2 (View view){
        scorePlayer2 += 20;
        showScorePlayer2(scorePlayer2);
    }

    public void addFourtyPlayer2 (View view){
        scorePlayer2 += 40;
        showScorePlayer2(scorePlayer2);
    }



}
