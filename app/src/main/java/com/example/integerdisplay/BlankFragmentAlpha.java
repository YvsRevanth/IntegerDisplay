package com.example.integerdisplay;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class BlankFragmentAlpha extends Fragment {
    View view;
    Royal r;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank_alpha, container, false);
        return view;
    }

    public void setInterface(Royal r) {
        this.r = r;
    }

    @Override
    public void onResume() {
        super.onResume();
        Button colorChangeButton = view.findViewById(R.id.color_change_button);
        colorChangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r.sendCode(Math.random());
            }
        });
    }

    public void dislpayData(String someString) {
        Button colorChangeButton = view.findViewById(R.id.color_change_button);
        colorChangeButton.setVisibility(View.GONE);
        EditText color_change_et = view.findViewById(R.id.color_change_et);
        color_change_et.setVisibility(View.VISIBLE);
        color_change_et.setText(someString + "");
    }

    public interface Royal {
        void sendCode(double data);
    }
}