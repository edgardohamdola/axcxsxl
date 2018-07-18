package wsid.acsl.multichoice1.Quiz_jkl;

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
public class QuizActivityjkl extends AppCompatActivity {

    private QuestionBankjkl mQuestionLibrary = new QuestionBankjkl();
    private TextView mScoreViewjkl;   // view for current total score
    private TextView mQuestionViewjkl;  //current question to answer
    private Button mButtonChoice1jkl; // multiple choice 1 for mQuestionView
    private Button mButtonChoice2jkl; // multiple choice 2 for mQuestionView
    private Button mButtonChoice3jkl; // multiple choice 3 for mQuestionView
    private Button mButtonChoice4jkl; // multiple choice 4 for mQuestionView

    private String mAnswerjkl;  // correct answer for question in mQuestionView
    private int mScorejkl = 0;  // current total score
    private int mQuestionNumberjkl = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizjkl);
        setTitle("Quiz JKL");

        // setup screen for the first question with four alternative to answer
        mScoreViewjkl = (TextView)findViewById(R.id.scorejkl);
        mQuestionViewjkl = (TextView)findViewById(R.id.questionjkl);
        mButtonChoice1jkl = (Button)findViewById(R.id.choice1jkl);
        mButtonChoice2jkl = (Button)findViewById(R.id.choice2jkl);
        mButtonChoice3jkl = (Button)findViewById(R.id.choice3jkl);
        mButtonChoice4jkl = (Button)findViewById(R.id.choice4jkl);
        updateQuestion();
        // show current total score for the user
        updateScore(mScorejkl);
        
    }
    private void updateQuestion(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumberjkl<mQuestionLibrary.getLength() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionViewjkl.setText(mQuestionLibrary.getQuestion(mQuestionNumberjkl));
            mButtonChoice1jkl.setText(mQuestionLibrary.getChoice(mQuestionNumberjkl, 1));
            mButtonChoice2jkl.setText(mQuestionLibrary.getChoice(mQuestionNumberjkl, 2));
            mButtonChoice3jkl.setText(mQuestionLibrary.getChoice(mQuestionNumberjkl, 3));
            mButtonChoice4jkl.setText(mQuestionLibrary.getChoice(mQuestionNumberjkl,4));
            mAnswerjkl = mQuestionLibrary.getCorrectAnswer(mQuestionNumberjkl);
            mQuestionNumberjkl++;
        }
        else {
            LayoutInflater inflater = getLayoutInflater();
            View toastLayout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(toastLayout);
            toast.show();
            Intent intent = new Intent(QuizActivityjkl.this, HighestScoreActivityjkl.class);
            intent.putExtra("score", mScorejkl); // pass the current score to the second screen
            startActivity(intent);
        }
    }
    // show current total score for the user
    private void updateScore(int point) {
        mScoreViewjkl.setText("" + mScorejkl+"/"+mQuestionLibrary.getLength());
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswerjkl){
            mScorejkl = mScorejkl + 1;
            Snackbar snackbar = Snackbar.make(view, "Jawaban Benar", Snackbar.LENGTH_LONG);// Snackbar message
            snackbar.setDuration(300);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.parseColor("#21ab29")); // snackbar background color
            TextView tv = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
            tv.setTextColor(Color.WHITE);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            snackbar.show();

            // show current total score for the user
            updateScore(mScorejkl);
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
            updateScore(mScorejkl);
            // once user answer the question, we move on to the next one, if any
            updateQuestion();
        }
    }
}
