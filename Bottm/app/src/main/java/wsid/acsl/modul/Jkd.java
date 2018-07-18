package wsid.acsl.modul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import wsid.acsl.R;

public class Jkd extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdl_jkd);

        pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("jkd.pdf").load();
    }
}
