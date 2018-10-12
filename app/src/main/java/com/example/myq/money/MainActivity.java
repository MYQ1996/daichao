package com.example.myq.money;

import android.content.ClipData;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.myq.money.fragment.IndexFragment;
import com.example.myq.money.fragment.SecondFragment;


public class MainActivity extends AppCompatActivity{

    Fragment thisFragment = null;
    TextView mTextMessage = null;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            mTextMessage = (TextView) findViewById(R.id.title);

            resetToDefaultIcon();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    thisFragment = new IndexFragment();
                    mTextMessage.setText("贷款超市");
                    this.tiao(thisFragment);
                    item.setIcon(R.mipmap.path_two);
                    item.set
                    return true;
                case R.id.navigation_dashboard:
                    thisFragment = new SecondFragment();
                    mTextMessage.setText("推荐");
                    this.tiao(thisFragment);
                    return true;
                case R.id.navigation_notifications:
                    this.tiao(thisFragment);
                    mTextMessage.setText("个人中心");
                    return true;
            }

            return false;
        }

        public void tiao(Fragment thisFragment){
            Fragment indexFragment = null;
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (indexFragment != null){
                transaction.remove(indexFragment);
            }
            transaction.replace(R.id.main_fragment_container,thisFragment);
            transaction.commit();
            indexFragment = thisFragment;
        }

        private void resetToDefaultIcon() {
            BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
            MenuItem home =  navigation.getMenu().findItem(R.id.navigation_home);
            MenuItem dashboard =  navigation.getMenu().findItem(R.id.navigation_dashboard);
            MenuItem notifications =  navigation.getMenu().findItem(R.id.navigation_notifications);
            home.setIcon(R.mipmap.path);
            dashboard.setIcon(R.mipmap.combined_shape);
            notifications.setIcon(R.mipmap.shape);

        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(navigation.getMenu().getItem(0).getItemId());//默认选中
    }





}
