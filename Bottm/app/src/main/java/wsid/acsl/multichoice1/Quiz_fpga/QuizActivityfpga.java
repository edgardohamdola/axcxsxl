package wsid.acsl.multichoice1.Quiz_fpga;

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

public class QuizActivityfpga extends AppCompatActivity {

    private QuestionBankfpga mQuestionLibrary = new QuestionBankfpga();
    private TextView mScoreViewfpga;   // view for current total score
    private TextView mQuestionViewfpga;  //current question to answer
    private Button mButtonChoice1fpga; // multiple choice 1 for mQuestionView
    private Button mButtonChoice2fpga; // multiple choice 2 for mQuestionView
    private Button mButtonChoice3fpga; // multiple choice 3 for mQuestionView
    private Button mButtonChoice4fpga; // multiple choice 4 for mQuestionView

    private String mAnswerfpga;  // correct answer for question in mQuestionView
    private int mScorefpga = 0;  // current total score
    private int mQuestionNumberfpga = 0; // current question number


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizfpga);
        setTitle("Quiz FPGA");
        // setup screen for the first question with four alternative to answer
        mScoreViewfpga = (TextView)findViewById(R.id.scorefpga);
        mQuestionViewfpga = (TextView)findViewById(R.id.questionfpga);
        mButtonChoice1fpga = (Button)findViewById(R.id.choice1fpga);
        mButtonChoice2fpga = (Button)findViewById(R.id.choice2fpga);
        mButtonChoice3fpga = (Button)findViewById(R.id.choice3fpga);
        mButtonChoice4fpga = (Button)findViewById(R.id.choice4fpga);
        updateQuestion();
        // show current total score for the user
        updateScore(mScorefpga);
    }
    private void updateQuestion(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumberfpga<mQuestionLibrary.getLength() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionViewfpga.setText(mQuestionLibrary.getQuestion(mQuestionNumberfpga));
            mButtonChoice1fpga.setText(mQuestionLibrary.getChoice(mQuestionNumberfpga, 1));
            mButtonChoice2fpga.setText(mQuestionLibrary.getChoice(mQuestionNumberfpga, 2));
            mButtonChoice3fpga.setText(mQuestionLibrary.getChoice(mQuestionNumberfpga, 3));
            mButtonChoice4fpga.setText(mQuestionLibrary.getChoice(mQuestionNumberfpga,4));
            mAnswerfpga = mQuestionLibrary.getCorrectAnswer(mQuestionNumberfpga);
            mQuestionNumberfpga++;
        }
        else {
            LayoutInflater inflater = getLayoutInflater();
            View toastLayout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(toastLayout);
            toast.show();
            Intent intent = new Intent(QuizActivityfpga.this, HighestScoreActivityfpga.class);
            intent.putExtra("score", mScorefpga); // pass the current score to the second screen
            startActivity(intent);
        }
    }
    // show current total score for the user
    private void updateScore(int point) {
        mScoreViewfpga.setText("" + mScorefpga+"/"+mQuestionLibrary.getLength());
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswerfpga){
            mScorefpga = mScorefpga + 1;
            Snackbar snackbar = Snackbar.make(view, "Jawaban Benar", Snackbar.LENGTH_LONG);// Snackbar message
            snackbar.setDuration(300);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.parseColor("#21ab29")); // snackbar background color
            TextView tv = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
            tv.setTextColor(Color.WHITE);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            snackbar.show();

            // show current total score for the user
            updateScore(mScorefpga);
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
            updateScore(mScorefpga);
            // once user answer the question, we move on to the next one, if any
            updateQuestion();
        }
    }
}
