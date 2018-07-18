package wsid.acsl.Tab_jadwal_PTA;

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

public class Tab_pta_selasa extends Fragment {
    private static final String TAG = "Tab2Fragment";
    private ListView lv_faq;
    private Adapter_jadwal adapter;
    private List<item_jadwal> mItemFaq;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.jdw_pta_selasa,container,false);



        lv_faq = (ListView) view.findViewById(R.id.lv_faq);
        mItemFaq = new ArrayList<>();
        mItemFaq.add(new item_jadwal(1, "SHIFT FPGA-B","07.30-10.30","Edgardo Hamdola","D121"));
        mItemFaq.add(new item_jadwal(2, "SHIFT FPGA-H","10.30-13.30","Thomi Alghani","D121"));
        mItemFaq.add(new item_jadwal(3, "SHIFT FPGA-N","13.30-15.30","Rahayu Susanti","D121"));
        mItemFaq.add(new item_jadwal(4, "SHIFT FPGA-T","15.30-17.30","Muharam Tri Putra","D121"));

        mItemFaq.add(new item_jadwal(5, "SHIFT JKL-T","07.30-10.30","Muharam Tri Putra","D125"));
        mItemFaq.add(new item_jadwal(6, "SHIFT JKL-N","10.30-13.30","Rahayu Susanti","D125"));
        mItemFaq.add(new item_jadwal(7, "SHIFT JKL-H","13.30-15.30","Thomi Alghani","D125"));
        mItemFaq.add(new item_jadwal(8, "SHIFT JKL-B","15.30-17.30","Edgardo Hamdola","D125"));


        adapter = new Adapter_jadwal(getContext(),mItemFaq);
        lv_faq.setAdapter(adapter);

        return view;
    }
}
