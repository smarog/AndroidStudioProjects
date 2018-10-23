package com.example.user.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class CalculatorActivity extends AppCompatActivity
{

    public double calculateResult(String expression){
        double result;
        DoubleEvaluator evaluator=new DoubleEvaluator();
        result=evaluator.evaluate(expression);
        return result;
    }
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

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"3");
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                resultTextView.setText(resultTextView.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                resultTextView.setText(resultTextView.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                resultTextView.setText(resultTextView.getText()+"9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"+");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                resultTextView.setText(resultTextView.getText()+"*");
            }
        });

        buttonBackSpace.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(resultTextView.getText().length()>0)
                {
                    String bksp;
                    bksp = resultTextView.getText().toString();
                    bksp=bksp.substring(0,bksp.length()-1);
                    resultTextView.setText(bksp);
                }
            }
        });


    }
}
