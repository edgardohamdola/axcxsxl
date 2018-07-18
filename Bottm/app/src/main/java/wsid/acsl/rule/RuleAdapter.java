package wsid.acsl.rule;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import wsid.acsl.R;

/**
 * Created by edg on 6/28/2017.
 */

public class RuleAdapter extends RecyclerView.Adapter<RuleAdapter.RuleViewHolder> {

    private List<rule> rule;
    private Context context;

    public RuleAdapter(List<rule> rule, Context context) {
        this.rule = rule;
        this.context=context;
    }

    public class RuleViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView point_tv;
        private TextView desc_tv;

        public RuleViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv_rule);
            point_tv = (TextView) itemView.findViewById(R.id.txt_rulepoint);
            desc_tv= (TextView) itemView.findViewById(R.id.txt_ruledesc);



        }
    }
    @Override
    public void onBindViewHolder(RuleViewHolder ruleViewHolder, int i) {
        ruleViewHolder.point_tv.setText(rule.get(i).getrulepoint());
        ruleViewHolder.desc_tv.setText(rule.get(i).getruledesc());

        final int pos=i;


    }
    @Override
    public RuleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_rule, viewGroup, false);
        RuleViewHolder ruleViewHolder = new RuleViewHolder(view);
        return ruleViewHolder;
    }

    @Override
    public int getItemCount() {
        return rule.size();
    }
}

