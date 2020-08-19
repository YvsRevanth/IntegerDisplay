package com.example.integerdisplay;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BlankFragmentBeta extends Fragment {
    View view;
    Slave s;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank_beta, container, false);
        return view;
    }

    public void setInterface(Slave s) {
        this.s = s;
    }

    @Override
    public void onResume() {
        super.onResume();
        TextView editText = view.findViewById(R.id.secret_code_tv);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s.getCode("Tinku is god");
            }
        });
    }

    public void setRandomData(double code) {
        TextView k = view.findViewById(R.id.secret_code_tv);
        k.setText(code + "");
    }

    public interface Slave {
        void getCode(String SomeName);
    }
}