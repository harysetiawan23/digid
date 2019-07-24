package com.example.digids.FragmentAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.digids.Fragment.WalletDetailFragment;

public class WalletContentAdapterFragmentAdapter extends FragmentStatePagerAdapter {

    public WalletContentAdapterFragmentAdapter(@NonNull FragmentManager fm) {

        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        for (int i = 0; i < 3; i++) {
            fragment = new WalletDetailFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

}
