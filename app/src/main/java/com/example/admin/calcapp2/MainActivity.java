package com.example.admin.calcapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //EditText mEditText1;
    EditText mEditText1;
    EditText mEditText2;

    double data1 = 0.0;
    double data2 = 0.0;

    int type = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        //textView.setText("VALUE1");

        mEditText2 = (EditText) findViewById(R.id.editText2);
        mEditText2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        //textView.setText("VALUE2");


        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){

        if( mEditText1.getText().toString().length() > 0)
        {
            data1 = Double.parseDouble(mEditText1.getText().toString());
        }
        if( mEditText2.getText().toString().length() > 0)
        {
            data2 = Double.parseDouble(mEditText2.getText().toString());
        }

        if (v.getId() == R.id.button1) {
            type = 1;
        } else if (v.getId() == R.id.button2) {
            type = 2;
        }  else if (v.getId() == R.id.button3) {
            type = 3;
        }  else if (v.getId() == R.id.button4) {
            type = 4;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", data1);
        intent.putExtra("VALUE2", data2);
        intent.putExtra("TYPE", type);

        startActivity(intent);
    }
}