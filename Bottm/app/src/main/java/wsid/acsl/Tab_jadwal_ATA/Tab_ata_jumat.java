package wsid.acsl.Tab_jadwal_ATA;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import wsid.acsl.Adapter_jadwal;
import wsid.acsl.R;
import wsid.acsl.item_jadwal;

/**
 * Created by User on 2/28/2017.
 */

public class Tab_ata_jumat extends Fragment {
    private ListView lv_faq;
    private Adapter_jadwal adapter;
    private List<item_jadwal> mItemFaq;
    private static final String TAG = "Tab5Fragment";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.jdw_pta_jumat,container,false);

        lv_faq = (ListView) view.findViewById(R.id.lv_faq);
        mItemFaq = new ArrayList<>();
        mItemFaq.add(new item_jadwal(1, "SHIFT JKD-B","07.30-10.30","Edgardo Hamdola","D125"));
        mItemFaq.add(new item_jadwal(2, "SHIFT JKD-F","10.30-13.30","M Rizqi Ariadi","D125"));
        mItemFaq.add(new item_jadwal(3, "SHIFT JKD-G","13.30-15.30","Thomi Alghani","D125"));
        mItemFaq.add(new item_jadwal(4, "SHIFT JKD-Q","15.30-17.30","Putri Melani","D125"));

        mItemFaq.add(new item_jadwal(5, "SHIFT MCS-C","07.30-10.30","Edgardo Hamdola","D121"));
        mItemFaq.add(new item_jadwal(6, "SHIFT MCS-I","10.30-13.30","Thomi Alghani","D121"));
        mItemFaq.add(new item_jadwal(7, "SHIFT MCS-O","13.30-15.30","Rahayu Susanti","D121"));
        mItemFaq.add(new item_jadwal(8, "SHIFT MCS-U","15.30-17.30","Muharam Tri Putra","D121"));


        adapter = new Adapter_jadwal(getContext(),mItemFaq);
        lv_faq.setAdapter(adapter);


        return view;
    }
}
