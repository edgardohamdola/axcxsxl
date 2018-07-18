package wsid.acsl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import wsid.acsl.modul.Fpga;
import wsid.acsl.multichoice1.Quiz_fpga.QuizActivityfpga;

public class Homequiz_fpga extends AppCompatActivity {

    Button btn_mulai,btn_mdl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homequiz_fpga);

        btn_mulai = (Button) findViewById(R.id.btn_mulai);
        btn_mdl= (Button) findViewById(R.id.btn_mdl);

        btn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homequiz_fpga.this, QuizActivityfpga.class);
                startActivity(intent);
            }
        });

        btn_mdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homequiz_fpga.this, Fpga.class);
                startActivity(intent);
            }
        });

    }
}
