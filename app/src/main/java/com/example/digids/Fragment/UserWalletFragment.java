package com.example.digids.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.digids.RecyclerViewAdapter.HomeCardFragmentAdapter;
import com.example.digids.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserWalletFragment extends Fragment {
    private View fragmentView ;

    public UserWalletFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentView = inflater.inflate(R.layout.fragment_id_card, container, false);

        RecyclerView recyclerView = (RecyclerView)fragmentView.findViewById(R.id.home_wallet_card_rv);
        RecyclerView.Adapter adapter = new HomeCardFragmentAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapter);
        return fragmentView;
    }

}
