package com.litto.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private Button bHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        findViews();
    }

    private void findViews() {
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
        bHelp = findViewById(R.id.b_hellp);
        bHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("HAHA")
                        .setMessage("jhjwjwjwjw")
                        .show();
            }
        });
    }

    public void bmi(View view){
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height*height);
        new AlertDialog.Builder(this)
                .setTitle("My Title")
                .setMessage("BMI is " + bmi)
                .show();
//        AlertDialog.Builder builder =  new AlertDialog.Builder(this);
//        builder.setTitle("My Title");
//        builder.setMessage("BMI is " + bmi);
//        AlertDialog dialog = builder.create();
//        dialog.show();


//        Log.d("MainActivity", "bmi: " + bmi);
//        Toast.makeText(this, "BMI is:" + bmi,
//                Toast.LENGTH_LONG).show();
    }
}


