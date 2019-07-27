package com.example.digids;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.example.digids.Fragment.NotificationFragment;
import com.example.digids.Fragment.UserProfilFragment;
import com.example.digids.Fragment.UserWalletFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private Toolbar toolbar;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Wallet");
        title = (TextView)findViewById(R.id.title);
        setSupportActionBar(toolbar);
        loadFragment(new UserWalletFragment());

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.buttom_navbar);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.wallet:
                toolbar.setTitle("Wallet");
                loadFragment(new UserWalletFragment());
                break;
            case R.id.notification:
                toolbar.setTitle("Notification");
                loadFragment(new NotificationFragment());
                break;
            case R.id.profile:
                toolbar.setTitle("Profile");
                loadFragment(new UserProfilFragment());
                break;
        }
        return true;
    }



    // method untuk load fragment yang sesuai
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_cointainer, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
