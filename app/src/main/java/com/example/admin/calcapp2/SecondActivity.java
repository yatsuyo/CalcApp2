package com.example.admin.calcapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double data1 = intent.getDoubleExtra("VALUE1", 0.0);
        //double data1 = intent.getIntExtra("VALUE1", 0.0);
        double data2 = intent.getDoubleExtra("VALUE2", 1.0);
        //double data2 = intent.getIntExtra("VALUE2", 1.0);
        int type = intent.getIntExtra("TYPE", 1);

        TextView textView = (TextView) findViewById(R.id.textView);

        //public void onClick(View v) {
        //if (view.getId() == R.id.button1) {
        if (type == 1) {
            textView.setText(String.valueOf(data1 + data2));
        } else if (type == 2) {
            textView.setText(String.valueOf(data1 - data2));
        } else if (type == 3) {
            textView.setText(String.valueOf(data1 * data2));
        } else if (type == 4)
            textView.setText(String.valueOf(data1 / data2));

    }
}