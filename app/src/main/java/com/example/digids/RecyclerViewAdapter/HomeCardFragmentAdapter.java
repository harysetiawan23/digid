package com.example.digids.RecyclerViewAdapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digids.R;
import com.example.digids.WalletDetailCategory;

public class HomeCardFragmentAdapter extends RecyclerView.Adapter<HomeCardFragmentAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_wallet, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (position == 0) {
            holder.setCardImageView1(R.drawable.id_card_2);
            holder.setCardImageView2(R.drawable.id_card_1);
            holder.cardImageView3.setVisibility(View.GONE);
            holder.setCardTitle("Passport");
        } else if (position == 1) {
            holder.setCardImageView1(R.drawable.kip);
            holder.setCardImageView2(R.drawable.kks_1);
            holder.cardImageView3.setVisibility(View.GONE);
            holder.setCardTitle("Insurance");
        } else if (position == 2) {
            holder.setCardImageView1(R.drawable.member_2);
            holder.setCardImageView2(R.drawable.member_1);
            holder.setCardImageView3(R.drawable.starbuck_member);
            holder.setCardTitle("Member Card");
        } else if (position == 3) {
            holder.setCardImageView1(R.drawable.kip_2);
            holder.setCardImageView2(R.drawable.bpjs_1);
            holder.cardImageView3.setVisibility(View.GONE);
            holder.setCardTitle("National Programs");
        }


        holder.cardLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(),WalletDetailCategory.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView cardImageView1;
        public ImageView cardImageView2;
        public ImageView cardImageView3;

        private TextView cardTitleTextView;
        public LinearLayout cardLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardImageView1 = (ImageView) itemView.findViewById(R.id.cardImageView1);
            cardImageView2 = (ImageView) itemView.findViewById(R.id.cardImageView2);
            cardImageView3 = (ImageView) itemView.findViewById(R.id.cardImageView3);

            cardTitleTextView = (TextView) itemView.findViewById(R.id.cardTitleTextView);

            cardLayout = (LinearLayout)itemView.findViewById(R.id.cardLayout);
        }


        public void setCardImageView1(int cardImage) {
            this.cardImageView1.setImageDrawable(ContextCompat.getDrawable(itemView.getContext(), cardImage));
        }

        public void setCardImageView2(int cardImage) {
            this.cardImageView2.setImageDrawable(ContextCompat.getDrawable(itemView.getContext(), cardImage));
        }

        public void setCardImageView3(int cardImage) {
            this.cardImageView3.setImageDrawable(ContextCompat.getDrawable(itemView.getContext(), cardImage));
        }

        public void setCardTitle(String title) {
            this.cardTitleTextView.setText(title);
        }



    }
}
