package com.jj.dryfirepractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class DryFirePracticeMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry_fire_practice_main);

        Spinner spinMinute = (Spinner) findViewById(R.id.spinnerMinute);
        Spinner spinSecond = (Spinner) findViewById(R.id.spinnerSecond);

        ArrayList<Integer> timeNumberList = new ArrayList<Integer>();
        for (int i = 0; i < 60; i++) timeNumberList.add(i);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, timeNumberList);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinMinute.setAdapter(aa);
        spinSecond.setAdapter(aa);
    }
}
