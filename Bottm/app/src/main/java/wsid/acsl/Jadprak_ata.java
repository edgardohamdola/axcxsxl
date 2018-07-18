package wsid.acsl;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import wsid.acsl.Tab_jadwal_ATA.Tab_ata_jumat;
import wsid.acsl.Tab_jadwal_ATA.Tab_ata_kamis;
import wsid.acsl.Tab_jadwal_ATA.Tab_ata_rabu;
import wsid.acsl.Tab_jadwal_ATA.Tab_ata_sabtu;
import wsid.acsl.Tab_jadwal_ATA.Tab_ata_selasa;
import wsid.acsl.Tab_jadwal_ATA.Tab_ata_senin;
import wsid.acsl.Tab_jadwal_PTA.Tab_pta_jumat;
import wsid.acsl.Tab_jadwal_PTA.Tab_pta_kamis;
import wsid.acsl.Tab_jadwal_PTA.Tab_pta_rabu;
import wsid.acsl.Tab_jadwal_PTA.Tab_pta_sabtu;
import wsid.acsl.Tab_jadwal_PTA.Tab_pta_selasa;
import wsid.acsl.Tab_jadwal_PTA.Tab_pta_senin;


public class Jadprak_ata extends AppCompatActivity {

    Spinner spinner;

    private Jadwal_SectionsPageAdapter mJadwalSectionsPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadprak_ata);


        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getResources().getString(R.string.title_jadprak));
        toolbar.setSubtitle("Jadwal Praktikum");

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(Jadprak_ata.this,
                R.layout.custom_spinner_item, getResources().getStringArray(R.array.ata));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myadapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent;
                switch(position) {
                    case 0:
                        Toast.makeText(Jadprak_ata.this,"Jadwal Praktikum Semester Genap (ATA)",

                                Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        intent = new Intent(Jadprak_ata.this, Jadprak_pta.class);
                        startActivity(intent);
                        Toast.makeText(Jadprak_ata.this,"Jadwal Praktikum Semester Ganjil (PTA)",
                                Toast.LENGTH_SHORT).show();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });


        mJadwalSectionsPageAdapter = new Jadwal_SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
        Jadwal_SectionsPageAdapter adapter = new Jadwal_SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab_ata_senin(), "Senin");
        adapter.addFragment(new Tab_ata_selasa(), "Selasa");
        adapter.addFragment(new Tab_ata_rabu(), "Rabu");
        adapter.addFragment(new Tab_ata_kamis(), "Kamis");
        adapter.addFragment(new Tab_ata_jumat(), "Jumat");
        adapter.addFragment(new Tab_ata_sabtu(), "Sabtu");
        viewPager.setAdapter(adapter);

        BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent0 = new Intent(Jadprak_ata.this, MainActivity.class );
                        startActivity(intent0);
                        break;
                    case R.id.navigation_ptkn:
                        Intent intent1 = new Intent(Jadprak_ata.this, Praktikan.class );
                        startActivity(intent1);
                        break;
                    case R.id.navigation_jdw:
                        break;
                    case R.id.navigation_lpla:
                        Intent intent3 = new Intent(Jadprak_ata.this, LpaActivity.class );
                        startActivity(intent3);
                        break;
                    case R.id.navigation_modul:
                        Intent intent4 = new Intent(Jadprak_ata.this, LpaActivity.class );
                        startActivity(intent4);
                        break;
                }
                return false;
            }

        };

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }



}