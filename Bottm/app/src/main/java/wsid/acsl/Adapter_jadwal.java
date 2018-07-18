package wsid.acsl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by edg on 7/16/2017.
 */

public class Adapter_jadwal extends BaseAdapter {

    private Context mContext;
    private List<item_jadwal> mItemFaq;

    public Adapter_jadwal(Context mContext, List<item_jadwal> mItemFaq) {
        this.mContext = mContext;
        this.mItemFaq = mItemFaq;
    }

    @Override
    public int getCount() {
        return mItemFaq.size();
    }

    @Override
    public Object getItem(int position) {
        return mItemFaq.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_jadwal, null);
        TextView tv_shift = (TextView)v.findViewById(R.id.tv_shift);
        TextView tv_time = (TextView)v.findViewById(R.id.tv_time);
        TextView tv_pjshift = (TextView)v.findViewById(R.id.tv_pjshift);
        TextView tv_ruangan = (TextView)v.findViewById(R.id.tv_ruangan);

        tv_shift.setText(mItemFaq.get(position).getShift());
        tv_time.setText(mItemFaq.get(position).getTime());
        tv_pjshift.setText(mItemFaq.get(position).getPj_shift());
        tv_ruangan.setText(mItemFaq.get(position).getRuangan());

        v.setTag(mItemFaq.get(position).getId());
        return v;
    }
}
