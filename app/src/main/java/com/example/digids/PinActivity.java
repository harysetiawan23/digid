package com.example.digids;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.numpad.NumPad;
import com.example.numpad.NumPadClick;
import com.example.numpad.numPadClickListener;
import com.goodiebag.pinview.Pinview;

import java.util.ArrayList;

public class PinActivity extends AppCompatActivity {
    private String numKeyValue = "";

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        final Pinview pin = (Pinview) findViewById(R.id.pinview);

        pin.setOutlineAmbientShadowColor(ContextCompat.getColor(getApplicationContext(),R.color.colorStandardWhite));
        pin.setOutlineSpotShadowColor(ContextCompat.getColor(getApplicationContext(),R.color.colorStandardWhite));
        pin.setTextSize(36);
        pin.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean fromUser) {
                if(pinview.getValue().length()==4){
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                }
            }
        });

        NumPad numPad = findViewById(R.id.numpad_key);


        numPad.setOnNumPadClickListener(new NumPadClick(new numPadClickListener() {
            @Override
            public void onNumpadClicked(ArrayList<Integer> nums) {

                try {
                    numKeyValue += nums.get(nums.size() - 1).toString();
                    pin.setValue(numKeyValue);

                    Toast.makeText(getApplicationContext(), numKeyValue, Toast.LENGTH_SHORT).show();

                    if (nums.size() == 4) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                } catch (Exception e) {

                }


            }
        }));


    }
}
