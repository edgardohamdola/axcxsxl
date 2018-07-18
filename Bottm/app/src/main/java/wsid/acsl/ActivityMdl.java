package wsid.acsl;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import wsid.acsl.fragments.FragmentSingle;

/**
 * Created by edg on 6/11/2017.
 */

public class ActivityMdl extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdl);


        Fragment fragment = getSupportFragmentManager().findFragmentById(android.R.id.content);
        if(fragment == null){
            fragment = FragmentSingle.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(android.R.id.content, fragment, "")
                    .commit();

        } else {
            getSupportFragmentManager()
                    .beginTransaction()
                    .attach(fragment)
                    .commit();
        }

        BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent0 = new Intent(ActivityMdl.this, MainActivity.class );
                        startActivity(intent0);
                        break;
                    case R.id.navigation_ptkn:
                        Intent intent1 = new Intent(ActivityMdl.this, Praktikan.class );
                        startActivity(intent1);
                        break;
                    case R.id.navigation_jdw:
                        Intent intent2 = new Intent(ActivityMdl.this, Jadprak_pta.class );
                        startActivity(intent2);
                        break;
                    case R.id.navigation_lpla:
                        Intent intent3 = new Intent(ActivityMdl.this, LpaActivity.class );
                        startActivity(intent3);
                        break;
                    case R.id.navigation_modul:
                        break;
                }
                return false;
            }

        };

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
