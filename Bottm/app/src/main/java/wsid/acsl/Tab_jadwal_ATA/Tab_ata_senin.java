package wsid.acsl.Tab_jadwal_ATA;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import wsid.acsl.Adapter_jadwal;
import wsid.acsl.R;
import wsid.acsl.item_jadwal;

/**
 * Created by User on 2/28/2017.
 */

public class Tab_ata_senin extends Fragment {
    private static final String TAG = "Tab1Fragment";
    private ListView lv_faq;
    private Adapter_jadwal adapter;
    private List<item_jadwal> mItemFaq;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.jdw_pta_senin,container,false);


        lv_faq = (ListView) view.findViewById(R.id.lv_faq);
        mItemFaq = new ArrayList<>();
        mItemFaq.add(new item_jadwal(1, "SHIFT JKD-J","07.30-10.30","Fiesta Wahyudiar","D125"));
        mItemFaq.add(new item_jadwal(2, "SHIFT JKD-M","10.30-13.30","Rahayu Susanti","D125"));
        mItemFaq.add(new item_jadwal(3, "SHIFT JKD-O","13.30-15.30","Rahayu Susanti","D125"));
        mItemFaq.add(new item_jadwal(4, "SHIFT JKD-V","15.30-17.30","Fitri Novita Yani","D125"));

        mItemFaq.add(new item_jadwal(5, "SHIFT MCS-E","07.30-10.30","M Rizqi Ariadi","D121"));
        mItemFaq.add(new item_jadwal(6, "SHIFT MCS-K","10.30-13.30","Fiesta Wahyudiar","D121"));
        mItemFaq.add(new item_jadwal(7, "SHIFT MCS-W","13.30-15.30","Fitri Novita Yani","D121"));
        mItemFaq.add(new item_jadwal(8, "SHIFT MCS-Q","15.30-17.30","Putri Melani","D121"));





        adapter = new Adapter_jadwal(getContext(),mItemFaq);
        lv_faq.setAdapter(adapter);


        return view;
    }

}
