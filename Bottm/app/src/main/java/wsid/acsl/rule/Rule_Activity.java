package wsid.acsl.rule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import wsid.acsl.R;

public class Rule_Activity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private String[] rule_point;
    private String[] desc_rule;
    private List<rule> rulelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Peraturan Praktikum");
        setContentView(R.layout.activity_rule);




        //cv_pjshift

        rule_point = getResources().getStringArray(R.array.rule_point);
        desc_rule = getResources().getStringArray(R.array.desc_rule);

       rulelist=new ArrayList<rule>();
        for (int i = 0; i < rule_point.length; i++) {
            rule rule = new rule(rule_point[i],desc_rule[i]);
            rulelist.add(rule);
        }
        recyclerview = (RecyclerView) findViewById(R.id.rv_rule);
        LinearLayoutManager layoutManager = new LinearLayoutManager(Rule_Activity.this,LinearLayoutManager.VERTICAL, false);
        recyclerview.setLayoutManager(layoutManager);
        RuleAdapter adapter = new RuleAdapter(rulelist,Rule_Activity.this);
        recyclerview.setAdapter(adapter);

        //cv_pjshift

    }

}
