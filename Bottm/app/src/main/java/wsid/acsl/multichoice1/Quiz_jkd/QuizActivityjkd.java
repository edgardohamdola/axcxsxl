package wsid.acsl.multichoice1.Quiz_jkd;

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

public class QuizActivityjkd extends AppCompatActivity {

    private QuestionBankjkd mQuestionLibrary = new QuestionBankjkd();
    private TextView mScoreViewjkd;   // view for current total score
    private TextView mQuestionViewjkd;  //current question to answer
    private Button mButtonChoice1jkd; // multiple choice 1 for mQuestionView
    private Button mButtonChoice2jkd; // multiple choice 2 for mQuestionView
    private Button mButtonChoice3jkd; // multiple choice 3 for mQuestionView
    private Button mButtonChoice4jkd; // multiple choice 4 for mQuestionView

    private String mAnswerjkd;  // correct answer for question in mQuestionView
    private int mScorejkd = 0;  // current total score
    private int mQuestionNumberjkd = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizjkd);
        setTitle("Quiz JKD");
        // setup screen for the first question with four alternative to answer
        mScoreViewjkd = (TextView)findViewById(R.id.scorejkd);
        mQuestionViewjkd = (TextView)findViewById(R.id.questionjkd);
        mButtonChoice1jkd = (Button)findViewById(R.id.choice1jkd);
        mButtonChoice2jkd = (Button)findViewById(R.id.choice2jkd);
        mButtonChoice3jkd = (Button)findViewById(R.id.choice3jkd);
        mButtonChoice4jkd = (Button)findViewById(R.id.choice4jkd);
        updateQuestion();
        // show current total score for the user
        updateScore(mScorejkd);
        
    }
    private void updateQuestion(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumberjkd<mQuestionLibrary.getLength() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionViewjkd.setText(mQuestionLibrary.getQuestion(mQuestionNumberjkd));
            mButtonChoice1jkd.setText(mQuestionLibrary.getChoice(mQuestionNumberjkd, 1));
            mButtonChoice2jkd.setText(mQuestionLibrary.getChoice(mQuestionNumberjkd, 2));
            mButtonChoice3jkd.setText(mQuestionLibrary.getChoice(mQuestionNumberjkd, 3));
            mButtonChoice4jkd.setText(mQuestionLibrary.getChoice(mQuestionNumberjkd,4));
            mAnswerjkd = mQuestionLibrary.getCorrectAnswer(mQuestionNumberjkd);
            mQuestionNumberjkd++;
        }
        else {
            LayoutInflater inflater = getLayoutInflater();
            View toastLayout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(toastLayout);
            toast.show();
            Intent intent = new Intent(QuizActivityjkd.this, HighestScoreActivityjkd.class);
            intent.putExtra("score", mScorejkd); // pass the current score to the second screen
            startActivity(intent);
        }
    }
    // show current total score for the user
    private void updateScore(int point) {
        mScoreViewjkd.setText("" + mScorejkd+"/"+mQuestionLibrary.getLength());
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswerjkd){
            mScorejkd = mScorejkd + 1;
            Snackbar snackbar = Snackbar.make(view, "Jawaban Benar", Snackbar.LENGTH_LONG);// Snackbar message
            snackbar.setDuration(300);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.parseColor("#21ab29")); // snackbar background color
            TextView tv = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
            tv.setTextColor(Color.WHITE);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            snackbar.show();

            // show current total score for the user
            updateScore(mScorejkd);
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
            updateScore(mScorejkd);
            // once user answer the question, we move on to the next one, if any
            updateQuestion();
        }
    }
}
