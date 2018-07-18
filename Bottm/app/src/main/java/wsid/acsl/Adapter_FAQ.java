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

public class Adapter_FAQ extends BaseAdapter {

    private Context mContext;
    private List<item_faq>mItemFaq;

    public Adapter_FAQ(Context mContext, List<item_faq> mItemFaq) {
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
        View v = View.inflate(mContext, R.layout.item_faq, null);
        TextView tv_question = (TextView)v.findViewById(R.id.tv_question);
        TextView tv_answer = (TextView)v.findViewById(R.id.tv_answer);

        tv_question.setText(mItemFaq.get(position).getQuestion());
        tv_answer.setText(mItemFaq.get(position).getAnswer());

        v.setTag(mItemFaq.get(position).getId());
        return v;
    }
}
