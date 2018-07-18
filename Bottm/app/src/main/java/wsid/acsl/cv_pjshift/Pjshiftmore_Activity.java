package wsid.acsl.cv_pjshift;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import wsid.acsl.R;

public class Pjshiftmore_Activity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private String[] namapjmore;
    private String[] shiftpjmore;
    private String[] nohppjmore;
    private TypedArray profile_picspjmore;
    private List<Pjshiftmore> pjlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pjshiftmore);
        setTitle("PJ Shift/Asisten");

        //cv_pjshift

        namapjmore = getResources().getStringArray(R.array.namapjmore);
        shiftpjmore = getResources().getStringArray(R.array.shiftpjmore);
        nohppjmore = getResources().getStringArray(R.array.nohppjmore);
        profile_picspjmore = getResources().obtainTypedArray(R.array.profile_picspjmore);

       pjlist=new ArrayList<Pjshiftmore>();
        for (int i = 0; i < namapjmore.length; i++) {
            Pjshiftmore pjshiftmore = new Pjshiftmore(namapjmore[i],shiftpjmore[i],nohppjmore[i],
                    profile_picspjmore.getResourceId(i, -1));
            pjlist.add(pjshiftmore);
        }
        recyclerview = (RecyclerView) findViewById(R.id.rv_pjshiftmore);
        LinearLayoutManager layoutManager = new LinearLayoutManager(Pjshiftmore_Activity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerview.setLayoutManager(layoutManager);
        PjshiftmoreAdapter adapter = new PjshiftmoreAdapter(pjlist,Pjshiftmore_Activity.this);
        recyclerview.setAdapter(adapter);

        //cv_pjshift

    }

}
