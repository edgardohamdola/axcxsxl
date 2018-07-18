package wsid.acsl.cv_pjshift;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import wsid.acsl.R;

/**
 * Created by edg on 6/28/2017.
 */

public class PjshiftmoreAdapter extends RecyclerView.Adapter<PjshiftmoreAdapter.PjViewHolder> {

    private List<Pjshiftmore> pjshiftmore;
    private Context context;

    public PjshiftmoreAdapter(List<Pjshiftmore> pjshiftmore, Context context) {
        this.pjshiftmore = pjshiftmore;
        this.context=context;
    }

    public class PjViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView name_tv;
        private TextView shift_tv;
        private TextView nohp_tv;
        private ImageView pic_iv;

        public PjViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv_pjmore);
            name_tv = (TextView) itemView.findViewById(R.id.txt_nama_pj);
            shift_tv= (TextView) itemView.findViewById(R.id.txt_shift_pj);
            nohp_tv = (TextView) itemView.findViewById(R.id.txt_nohp_pj);
            pic_iv = (ImageView) itemView.findViewById(R.id.profile_pic);



        }
    }
    @Override
    public void onBindViewHolder(PjViewHolder pjshiftViewHolder, int i) {
        pjshiftViewHolder.name_tv.setText(pjshiftmore.get(i).getNama());
        pjshiftViewHolder.shift_tv.setText(pjshiftmore.get(i).getShift());
        pjshiftViewHolder.nohp_tv.setText(pjshiftmore.get(i).getNohp());
        pjshiftViewHolder.pic_iv.setImageResource(pjshiftmore.get(i).getPhotoID());

        final int pos=i;


    }
    @Override
    public PjViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_pjshiftmore, viewGroup, false);
        PjViewHolder pjshiftViewHolder = new PjViewHolder(view);
        return pjshiftViewHolder;
    }

    @Override
    public int getItemCount() {
        return pjshiftmore.size();
    }
}

