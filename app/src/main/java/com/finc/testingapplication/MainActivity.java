package com.finc.testingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num_1);
        num2 = (EditText) findViewById(R.id.num_2);
        resultView = (TextView) findViewById(R.id.result);
    }

    public void calculate(View v) {
        String x = num1.getText().toString();
        String y = num2.getText().toString();

        resultView.setText(Adder.func(x, y));
    }
}
