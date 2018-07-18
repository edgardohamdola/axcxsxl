package wsid.acsl.multichoice1.Quiz_jkd;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import wsid.acsl.MainActivity;
import wsid.acsl.R;

public class HighestScoreActivityjkd extends AppCompatActivity {

    Button buttonhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score_jkd);
        setTitle("Result Quiz JKD");
        TextView txtScore = (TextView) findViewById(R.id.textScorejkd);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScorejkd);
        buttonhome = (Button) findViewById(R.id.buttonhome);


        // receive the score from last activity by Intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        // display current score
        txtScore.setText("Your score: " + score);

        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("High score: \n "+highscore);
        else
        {
            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore ", score);
            editor.commit();
        }
    }


    public void onClick(View view) {
        Intent intent = new Intent(HighestScoreActivityjkd.this, QuizActivityjkd.class);
        startActivity(intent);
        finish();
    }

    public void onClick1(View view) {
        Intent intent1 = new Intent(HighestScoreActivityjkd.this, MainActivity.class);
        startActivity(intent1);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(HighestScoreActivityjkd.this, MainActivity.class);
        startActivity(intent);
        finish();
    }


}