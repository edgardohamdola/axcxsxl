package wsid.acsl.konsekuensi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import wsid.acsl.R;

public class Konsekuensi_Activity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private String[] konsekuensi_point;
    private String[] desc_konsekuensi;
    private List<Konsekuensi> konsekuensilist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Konsekuensi");
        setContentView(R.layout.activity_konsekuensi);




        //cv_pjshift

        konsekuensi_point = getResources().getStringArray(R.array.konsekuensi_point);
        desc_konsekuensi = getResources().getStringArray(R.array.desc_konsekuensi);

       konsekuensilist=new ArrayList<Konsekuensi>();
        for (int i = 0; i < konsekuensi_point.length; i++) {
            Konsekuensi Konsekuensi = new Konsekuensi(konsekuensi_point[i],desc_konsekuensi[i]);
            konsekuensilist.add(Konsekuensi);
        }
        recyclerview = (RecyclerView) findViewById(R.id.rv_konsekuensi);
        LinearLayoutManager layoutManager = new LinearLayoutManager(Konsekuensi_Activity.this,LinearLayoutManager.VERTICAL, false);
        recyclerview.setLayoutManager(layoutManager);
        KonsekuensiAdapter adapter = new KonsekuensiAdapter(konsekuensilist,Konsekuensi_Activity.this);
        recyclerview.setAdapter(adapter);

        //cv_pjshift

    }

}
