package com.example.nickb.simplecalc;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v)
    {
        TextView e1 = (TextView)findViewById(R.id.Result);
        EditText n1 = (EditText) findViewById(R.id.FirstNumber);
        EditText n2 = (EditText)findViewById(R.id.SecondNumber);
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int sum = num1 + num2;
        e1.setText(Integer.toString(sum));
    }



}
