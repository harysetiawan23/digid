package com.example.digids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.digids.FragmentAdapter.WalletContentAdapterFragmentAdapter;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class WalletDetailCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet_detail_category);
        Toolbar toolbar  = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Insurance");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = (ViewPager)findViewById(R.id.wallet_detail_category);
        viewPager.setAdapter(new WalletContentAdapterFragmentAdapter(getSupportFragmentManager()));

        DotsIndicator dotsIndicator = (DotsIndicator) findViewById(R.id.dots_indicator);
        dotsIndicator.setViewPager(viewPager);

    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
