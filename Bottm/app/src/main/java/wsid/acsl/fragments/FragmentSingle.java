package wsid.acsl.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import wsid.acsl.modul.Fpga;
import wsid.acsl.modul.Jkd;
import wsid.acsl.modul.Jkl;
import wsid.acsl.modul.Mcs;
import wsid.acsl.R;
import wsid.acsl.adapter.SingleListAdapter;
import wsid.acsl.model.Single;
import wsid.acsl.widgets.GridMarginDecoration;

public class FragmentSingle extends Fragment implements SingleListAdapter.OnGridItemSelectedListener{


    private RecyclerView lvSingle;
    private GridLayoutManager gridLayoutManager;
    private SingleListAdapter singleListAdapter;

    private Context context;

    public static FragmentSingle newInstance() {
        return new FragmentSingle();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_single, container, false);

        lvSingle = (RecyclerView) rootView.findViewById(R.id.lvSingle);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        singleListAdapter = new SingleListAdapter(this);
        gridLayoutManager = new GridLayoutManager(context, 2);

        lvSingle.setLayoutManager(gridLayoutManager);
        lvSingle.addItemDecoration(new GridMarginDecoration(context, 2, 2, 2, 2));
        lvSingle.setAdapter(singleListAdapter);

        loadData();
    }
    private void loadData(){
        List<Single> singleList = new ArrayList<>();
        Single single;

        int img[] = {R.drawable.mdlfpga,R.drawable.mdljkd,R.drawable.mdljkl,R.drawable.mdlmcs};

        String title[] = {"Field Programmable Gate Array", "Jaringan Komputer Dasar",
                "Jaringan Komputer Lanjut", "Mobile Computing System"};

        for (int i = 0; i < img.length; i++){
            single = new Single();

            single.setImg(img[i]);
            single.setTitle(title[i]);

            singleList.add(single);
        }

        singleListAdapter.addAll(singleList);
    }

    @Override
    public boolean onGridItemClick(View v, int position) {
        switch (position) {
            case 0:
                Intent fpga = new Intent(context, Fpga.class);
                startActivity(fpga);
                break;
            case 1:
                Intent jkd = new Intent(context, Jkd.class);
                startActivity(jkd);
                break;
            case 2:
                Intent jkl = new Intent(context, Jkl.class);
                startActivity(jkl);
                break;
            case 3:
                Intent mcs = new Intent(context, Mcs.class);
                startActivity(mcs);
                break;
        }
        return false;
    }




}
