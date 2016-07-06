package com.vic.calculator;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnMultiplication;
    private Button btnDivision;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1= Double.parseDouble(operand1.getText().toString());
                double oper2= Double.parseDouble(operand2.getText().toString());
                double result = oper1 + oper2;
                txtResult.setText(Double.toString(result));
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1= Double.parseDouble(operand1.getText().toString());
                double oper2= Double.parseDouble(operand2.getText().toString());
                double result = oper1 - oper2;
                txtResult.setText(Double.toString(result));
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1= Double.parseDouble(operand1.getText().toString());
                double oper2= Double.parseDouble(operand2.getText().toString());
                double result = oper1 * oper2;
                txtResult.setText(Double.toString(result));
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1= Double.parseDouble(operand1.getText().toString());
                double oper2= Double.parseDouble(operand2.getText().toString());
                double result = oper1 / oper2;
                txtResult.setText(Double.toString(result));
            }
        });
    }
}
