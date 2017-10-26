package com.litto.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        float bmi = getIntent()
                .getFloatExtra("EXTRA_BMI", 0);
        TextView tvBmi = findViewById(R.id.tv_bmi);
        tvBmi.setText(String.valueOf(bmi));
    }
}
