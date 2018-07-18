package wsid.acsl;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import wsid.acsl.Mhs.MhsFPGA;
import wsid.acsl.Mhs.MhsJKD;
import wsid.acsl.Mhs.MhsJKL;
import wsid.acsl.Mhs.MhsMCS;


public class Praktikan extends AppCompatActivity {

    ListView listItemView;

    // Define string array.
    String[] listItemsValue = new String[] {"Praktikan FPGA","Praktikan JKD",
            "Praktikan JKL","Praktikan MCS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.praktikan_activity);

        listItemView = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2,
                android.R.id.text1, listItemsValue);

        listItemView.setAdapter(adapter);

        // ListView setOnItemClickListener function apply here.

        listItemView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                if(position==0){
                    Intent fpga = new Intent(Praktikan.this, MhsFPGA.class);
                    startActivity(fpga);
                }
                if(position==1){
                    Intent jkd=new Intent(Praktikan.this,MhsJKD.class);
                    startActivity(jkd);
                }
                if(position==2){
                    Intent jkl=new Intent(Praktikan.this,MhsJKL.class);
                    startActivity(jkl);
                }
                if(position==3){
                    Intent mcs=new Intent(Praktikan.this,MhsMCS.class);
                    startActivity(mcs);
                }
            }
        });


        BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent0 = new Intent(Praktikan.this, MainActivity.class );
                        startActivity(intent0);
                        break;
                    case R.id.navigation_ptkn:
                        break;
                    case R.id.navigation_jdw:
                        Intent intent2 = new Intent(Praktikan.this, Jadprak_pta.class );
                        startActivity(intent2);
                        break;
                    case R.id.navigation_lpla:
                        Intent intent3 = new Intent(Praktikan.this, LpaActivity.class );
                        startActivity(intent3);
                        break;
                    case R.id.navigation_modul:
                        Intent intent4 = new Intent(Praktikan.this, LpaActivity.class );
                        startActivity(intent4);
                        break;
                }
                return false;
            }

        };

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }


}
