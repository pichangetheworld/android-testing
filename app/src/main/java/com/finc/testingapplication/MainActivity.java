package com.finc.testingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v) {
        EditText num1 = (EditText) findViewById(R.id.num_1);
        EditText num2 = (EditText) findViewById(R.id.num_2);

        String x = num1.getText().toString();
        String y = num2.getText().toString();

        Adder adder = new Adder();

        TextView resultView = (TextView) findViewById(R.id.result);
        resultView.setText(adder.func(x, y));
    }
}
