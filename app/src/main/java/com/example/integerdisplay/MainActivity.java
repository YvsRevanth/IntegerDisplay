package com.example.integerdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragmentAlpha.Royal, BlankFragmentBeta.Slave {
    BlankFragmentAlpha blankFragmentAlpha = new BlankFragmentAlpha();
    BlankFragmentBeta blankFragmentBeta = new BlankFragmentBeta();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportFragmentManager().beginTransaction().add(R.id.frag_one, blankFragmentAlpha).commit();
        blankFragmentAlpha.setInterface(this);
        getSupportFragmentManager().beginTransaction().add(R.id.frag_two, blankFragmentBeta).commit();
        blankFragmentBeta.setInterface(this);
    }

    @Override
    public void sendCode(double data) {
        blankFragmentBeta.setRandomData(data);
    }

    @Override
    public void getCode(String SomeData) {
        blankFragmentAlpha.dislpayData(SomeData);
    }
}