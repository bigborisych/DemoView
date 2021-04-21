package com.vladborisov.demoview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DemoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_view);
        Intent intent = getIntent();
        ViewGroup container = findViewById(R.id.container);
        int viewNum = intent.getIntExtra("View", 0);
        View view;
        switch (viewNum) {
            case 1:
                view = LayoutInflater.from(this).inflate(R.layout.activity_demo_card_view, container, false);
                container.addView(view);
                break;
            case 2:
                view = LayoutInflater.from(this).inflate(R.layout.activity_text_input_layout, container, false);
                container.addView(view);
                break;
        }
    }
}