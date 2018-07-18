package wsid.acsl.multichoice1.Quiz_mcs;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import wsid.acsl.R;

public class QuizActivitymcs extends AppCompatActivity {



    private QuestionBankmcs mQuestionLibrary = new QuestionBankmcs();
    private TextView mScoreViewmcs;   // view for current total score
    private TextView mQuestionViewmcs;  //current question to answer
    private Button mButtonChoice1mcs; // multiple choice 1 for mQuestionView
    private Button mButtonChoice2mcs; // multiple choice 2 for mQuestionView
    private Button mButtonChoice3mcs; // multiple choice 3 for mQuestionView
    private Button mButtonChoice4mcs; // multiple choice 4 for mQuestionView

    private String mAnswermcs;  // correct answer for question in mQuestionView
    private int mScoremcs = 0;  // current total score
    private int mQuestionNumbermcs = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizmcs);
        setTitle("Quiz MCS");

        // setup screen for the first question with four alternative to answer
        mScoreViewmcs = (TextView)findViewById(R.id.scoremcs);
        mQuestionViewmcs = (TextView)findViewById(R.id.questionmcs);
        mButtonChoice1mcs = (Button)findViewById(R.id.choice1mcs);
        mButtonChoice2mcs = (Button)findViewById(R.id.choice2mcs);
        mButtonChoice3mcs = (Button)findViewById(R.id.choice3mcs);
        mButtonChoice4mcs = (Button)findViewById(R.id.choice4mcs);
        updateQuestion();
        // show current total score for the user
        updateScore(mScoremcs);
        
    }
    private void updateQuestion(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumbermcs<mQuestionLibrary.getLength() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionViewmcs.setText(mQuestionLibrary.getQuestion(mQuestionNumbermcs));
            mButtonChoice1mcs.setText(mQuestionLibrary.getChoice(mQuestionNumbermcs, 1));
            mButtonChoice2mcs.setText(mQuestionLibrary.getChoice(mQuestionNumbermcs, 2));
            mButtonChoice3mcs.setText(mQuestionLibrary.getChoice(mQuestionNumbermcs, 3));
            mButtonChoice4mcs.setText(mQuestionLibrary.getChoice(mQuestionNumbermcs,4));
            mAnswermcs = mQuestionLibrary.getCorrectAnswer(mQuestionNumbermcs);
            mQuestionNumbermcs++;
        }
        else {
            LayoutInflater inflater = getLayoutInflater();
            View toastLayout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(toastLayout);
            toast.show();
            Intent intent = new Intent(QuizActivitymcs.this, HighestScoreActivitymcs.class);
            intent.putExtra("score", mScoremcs); // pass the current score to the second screen
            startActivity(intent);
        }
    }
    // show current total score for the user
    private void updateScore(int point) {
        mScoreViewmcs.setText("" + mScoremcs+"/"+mQuestionLibrary.getLength());
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswermcs){
            mScoremcs = mScoremcs + 1;
            Snackbar snackbar = Snackbar.make(view, "Jawaban Benar", Snackbar.LENGTH_LONG);// Snackbar message
            snackbar.setDuration(300);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.parseColor("#21ab29")); // snackbar background color
            TextView tv = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
            tv.setTextColor(Color.WHITE);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            snackbar.show();

            // show current total score for the user
            updateScore(mScoremcs);
            // once user answer the question, we move on to the next one, if any
            updateQuestion();

        }else {
            Snackbar snackbar = Snackbar.make(view, "Jawaban Salah", Snackbar.LENGTH_LONG);// Snackbar message
            snackbar.setDuration(300);

            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.parseColor("#ab212a")); // snackbar background color
            TextView tv = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
            tv.setTextColor(Color.WHITE);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            snackbar.show();

            // show current total score for the user
            updateScore(mScoremcs);
            // once user answer the question, we move on to the next one, if any
            updateQuestion();
        }
    }
}
