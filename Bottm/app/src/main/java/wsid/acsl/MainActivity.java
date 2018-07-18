package wsid.acsl;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import wsid.acsl.cv_pjshift.Pjshift;
import wsid.acsl.cv_pjshift.PjshiftAdapter;
import wsid.acsl.cv_pjshift.Pjshiftmore_Activity;
import wsid.acsl.konsekuensi.Konsekuensi_Activity;
import wsid.acsl.rule.Rule_Activity;


public class MainActivity extends AppCompatActivity {
    TextView tvpj,tv_rule,tv_konsekuensi;
    ImageView imgfpga,imgjkd,imgjkl,imgmcs;

    ViewPager viewPager;
    LinearLayout Sliderdots;
    private int dotscount;
    private ImageView[] dots;

    //cardviewpjshift
    private RecyclerView recyclerview;
    private String[] nama;
    private String[] shift;
    private String[] nohp;
    private TypedArray profile_pics;
    private List<Pjshift> pjlist;
    //cardviewpjshift


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    break;
                case R.id.navigation_ptkn:
                    Intent intent1 = new Intent(MainActivity.this, Praktikan.class );
                    startActivity(intent1);
                    break;
                case R.id.navigation_jdw:
                    Intent intent2 = new Intent(MainActivity.this, Jadprak_pta.class );
                    startActivity(intent2);
                    break;
                case R.id.navigation_lpla:
                    Intent intent3 = new Intent(MainActivity.this, LpaActivity.class );
                    startActivity(intent3);
                    break;
                case R.id.navigation_modul:
                    Intent intent4 = new Intent(MainActivity.this, ActivityMdl.class );
                    startActivity(intent4);
                    break;
            }
            return false;
        }

    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cv_pjshift

        nama = getResources().getStringArray(R.array.nama);
        shift = getResources().getStringArray(R.array.shift);
        nohp = getResources().getStringArray(R.array.nohp);
        profile_pics = getResources().obtainTypedArray(R.array.profile_pics);

        pjlist=new ArrayList<Pjshift>();
        for (int i = 0; i < nama.length; i++) {
            Pjshift pjshift = new Pjshift(nama[i],shift[i],nohp[i],profile_pics.getResourceId(i, -1));
            pjlist.add(pjshift);
        }
        recyclerview = (RecyclerView) findViewById(R.id.rv_pjshift);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL, false);
        recyclerview.setLayoutManager(layoutManager);
        PjshiftAdapter adapter = new PjshiftAdapter(pjlist,MainActivity.this);
        recyclerview.setAdapter(adapter);


        tvpj = (TextView) findViewById(R.id.all_pj);

        tvpj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Pjshiftmore_Activity.class);
                startActivity(intent);
            }
        });


        //cv_pjshift

        tv_konsekuensi = (TextView) findViewById(R.id.tv_konsekuensi);
        tv_konsekuensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Konsekuensi_Activity.class);
                startActivity(intent);
            }
        });

        tv_rule = (TextView) findViewById(R.id.tv_rule);
        tv_rule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Rule_Activity.class);
                startActivity(intent);
            }
        });

        //button slider main
        imgfpga = (ImageView) findViewById(R.id.imgfpga);
        imgfpga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Homequiz_fpga.class);
                startActivity(intent);
            }
        });

        imgjkd = (ImageView) findViewById(R.id.imgjkd);
        imgjkd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Homequiz_jkd.class);
                startActivity(intent);
            }
        });

        imgjkl = (ImageView) findViewById(R.id.imgjkl);
        imgjkl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Homequiz_jkl.class);
                startActivity(intent);
            }
        });

        imgmcs = (ImageView) findViewById(R.id.imgmcs);
        imgmcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Homequiz_mcs.class);
                startActivity(intent);
            }
        });


        //button slider main



        Sliderdots = (LinearLayout) findViewById(R.id.Sliderdots);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),4000,2000 );

        final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for (int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(4, 0, 4, 0);

            Sliderdots.addView(dots[i], params);
        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        Timer timer1 = new Timer();
        timer1.scheduleAtFixedRate(new MyTimerTask(),4000,2000);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if (id==R.id.id_abt){
            Intent intentabt = new Intent(MainActivity.this, About.class);
            startActivity(intentabt);
            return  true;
        }
        if (id==R.id.id_faq){
            Intent intentfaq = new Intent(MainActivity.this, Faq.class);
            startActivity(intentfaq);
            return true;
        }
        return true;
    }


    private class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {


                    if (viewPager.getCurrentItem()==0){
                        viewPager.setCurrentItem(1);
                    }else if(viewPager.getCurrentItem() ==1){
                        viewPager.setCurrentItem(2);
                    }else if(viewPager.getCurrentItem() ==2){
                        viewPager.setCurrentItem(3);
                    }else if(viewPager.getCurrentItem() ==3){
                        viewPager.setCurrentItem(4);
                    }else{
                        viewPager.setCurrentItem(0);
                    }


                }
            });
        }
    }

}
