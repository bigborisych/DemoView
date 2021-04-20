package com.vladborisov.demoview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityMain extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.demo_card_view_button) {
            Intent intent = new Intent(this, DemoCardView.class);
            startActivity(intent);
        } else if (view.getId() == R.id.text_input_layout_button) {
            Intent intent = new Intent(this, TextInputLayout.class);
            startActivity(intent);
        }
    }
}
