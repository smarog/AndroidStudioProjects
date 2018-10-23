package com.example.user.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button0 = (Button) findViewById(R.id.button0);
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button buttonDivision = (Button) findViewById(R.id.buttonDivision);
        Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        Button buttonBackSpace = (Button) findViewById(R.id.buttonBackSpace);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        Button buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

    }
}
