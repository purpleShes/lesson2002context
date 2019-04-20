package com.example.lesson2002context;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import at.grabner.circleprogress.CircleProgressView;


public class CircleViewActivity extends AppCompatActivity {

    /**
     * The log tag.
     */
    private final static String TAG = "MainActivity";

    CircleProgressView mCircleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle_view);

        mCircleView = findViewById(R.id.circleViewYellow);
        mCircleView.setValue(67);

    }


}


