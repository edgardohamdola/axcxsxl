package wsid.acsl.konsekuensi;

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

public class KonsekuensiAdapter extends RecyclerView.Adapter<KonsekuensiAdapter.KonsekuensiViewHolder> {

    private List<Konsekuensi> Konsekuensi;
    private Context context;

    public KonsekuensiAdapter(List<Konsekuensi> Konsekuensi, Context context) {
        this.Konsekuensi = Konsekuensi;
        this.context=context;
    }

    public class KonsekuensiViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView point_tv;
        private TextView desc_tv;

        public KonsekuensiViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv_konsekuensi);
            point_tv = (TextView) itemView.findViewById(R.id.txt_konsekuensipoint);
            desc_tv= (TextView) itemView.findViewById(R.id.txt_konsekuensidesc);



        }
    }
    @Override
    public void onBindViewHolder(KonsekuensiViewHolder konsekuensiViewHolder, int i) {
        konsekuensiViewHolder.point_tv.setText(Konsekuensi.get(i).getkonsekuensipoint());
        konsekuensiViewHolder.desc_tv.setText(Konsekuensi.get(i).getkonsekuensidesc());

        final int pos=i;


    }
    @Override
    public KonsekuensiViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_konsekuensi, viewGroup, false);
        KonsekuensiViewHolder konsekuensiViewHolder = new KonsekuensiViewHolder(view);
        return konsekuensiViewHolder;
    }

    @Override
    public int getItemCount() {
        return Konsekuensi.size();
    }
}

