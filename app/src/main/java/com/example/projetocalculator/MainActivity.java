package com.example.projetocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonNumZero, buttonNumOne, buttonNumTwo, buttonNumThree, buttonNumFour, buttonNumFive, buttonNumSix, buttonNumSeven, buttonNumEight, buttonNumNine;
    Button buttonOpSum, buttonOpSub, buttonOpMul, buttonOpDiv, buttonOpComma, buttonOpEqual, buttonOpClear, buttonOpHistory;

    TextView outputResult;

    float firstInput = 0, secondInput = 0;

    String op = "";
    boolean decimalPoint = false;
    boolean resultExist = false;

    List<History> historyList = new ArrayList<History>();

    View.OnClickListener buttonNumZeroListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(!outputResult.getText().equals("0")){
                outputResult.setText(outputResult.getText() + "0");
            }
        }
    };

    View.OnClickListener buttonNumOneListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(outputResult.getText().equals("0")||resultExist){
                outputResult.setText("1");
                resultExist = false;
            } else {
                outputResult.setText(outputResult.getText() + "1");
            }
        }
    };

    View.OnClickListener buttonNumTwoListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(outputResult.getText().equals("0")||resultExist){
                outputResult.setText("2");
                resultExist = false;
            } else {
                outputResult.setText(outputResult.getText() + "2");
            }
        }
    };

    View.OnClickListener buttonNumThreeListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(outputResult.getText().equals("0")||resultExist){
                outputResult.setText("3");
                resultExist = false;
            } else {
                outputResult.setText(outputResult.getText() + "3");
            }
        }
    };

    View.OnClickListener buttonNumFourListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(outputResult.getText().equals("0")||resultExist){
                outputResult.setText("4");
                resultExist = false;
            } else {
                outputResult.setText(outputResult.getText() + "4");
            }
        }
    };

    View.OnClickListener buttonNumFiveListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(outputResult.getText().equals("0")||resultExist){
                outputResult.setText("5");
                resultExist = false;
            } else {
                outputResult.setText(outputResult.getText() + "5");
            }
        }
    };

    View.OnClickListener buttonNumSixListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(outputResult.getText().equals("0")||resultExist){
                outputResult.setText("6");
                resultExist = false;
            } else {
                outputResult.setText(outputResult.getText() + "6");
            }
        }
    };

    View.OnClickListener buttonNumSevenListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(outputResult.getText().equals("0")||resultExist){
                outputResult.setText("7");
                resultExist = false;
            } else {
                outputResult.setText(outputResult.getText() + "7");
            }
        }
    };

    View.OnClickListener buttonNumEightListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(outputResult.getText().equals("0")||resultExist){
                outputResult.setText("8");
                resultExist = false;
            } else {
                outputResult.setText(outputResult.getText() + "8");
            }
        }
    };

    View.OnClickListener buttonNumNineListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(outputResult.getText().equals("0")||resultExist){
                outputResult.setText("9");
                resultExist = false;
            } else {
                outputResult.setText(outputResult.getText() + "9");
            }
        }
    };

    View.OnClickListener buttonOpSumListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            firstInput = Float.parseFloat(outputResult.getText() + "");
            op = "+";
            decimalPoint = false;
            outputResult.setText(null);
        }
    };

    View.OnClickListener buttonOpSubListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            firstInput = Float.parseFloat(outputResult.getText() + "");
            op = "-";
            decimalPoint = false;
            outputResult.setText(null);
        }
    };

    View.OnClickListener buttonOpMulListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            firstInput = Float.parseFloat(outputResult.getText() + "");
            op = "*";
            decimalPoint = false;
            outputResult.setText(null);
        }
    };

    View.OnClickListener buttonOpDivListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            firstInput = Float.parseFloat(outputResult.getText() + "");
            op = "/";
            decimalPoint = false;
            outputResult.setText(null);
        }
    };

    View.OnClickListener buttonOpCommaListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(!decimalPoint){
                outputResult.setText(outputResult.getText() + ".");
                decimalPoint = true;
            }
        }
    };

    View.OnClickListener buttonOpEqualListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            secondInput = Float.parseFloat(outputResult.getText() + "");
            History h = new History();

            switch (op) {
                case "+":
                    outputResult.setText(firstInput + secondInput + "");
                    break;
                case "-":
                    outputResult.setText(firstInput - secondInput + "");
                    break;
                case "*":
                    outputResult.setText(firstInput * secondInput + "");
                    break;
                case "/":
                    if(secondInput == 0){
                        outputResult.setText("ERROR");
                    } else {
                        outputResult.setText(firstInput / secondInput + "");
                    }
                    break;
            }
            if(!(op.equals("/") && secondInput == 0)){
                h.setFirstInput(firstInput);
                h.setSecondInput(secondInput);
                h.setOperator(op);
                h.setResult(Float.parseFloat(outputResult.getText() + ""));
                historyList.add(h);
            }
            op = "";
            resultExist = true;
        }
    };

    View.OnClickListener buttonOpClearListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            outputResult.setText("0");
            decimalPoint = false;
            resultExist = false;
            firstInput = 0;
            secondInput = 0;
            op = "";
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNumZero = findViewById(R.id.buttonNumZero);
        buttonNumZero.setOnClickListener(buttonNumZeroListener);
        buttonNumOne = findViewById(R.id.buttonNumOne);
        buttonNumOne.setOnClickListener(buttonNumOneListener);
        buttonNumTwo = findViewById(R.id.buttonNumTwo);
        buttonNumTwo.setOnClickListener(buttonNumTwoListener);
        buttonNumThree = findViewById(R.id.buttonNumThree);
        buttonNumThree.setOnClickListener(buttonNumThreeListener);
        buttonNumFour = findViewById(R.id.buttonNumFour);
        buttonNumFour.setOnClickListener(buttonNumFourListener);
        buttonNumFive = findViewById(R.id.buttonNumFive);
        buttonNumFive.setOnClickListener(buttonNumFiveListener);
        buttonNumSix = findViewById(R.id.buttonNumSix);
        buttonNumSix.setOnClickListener(buttonNumSixListener);
        buttonNumSeven = findViewById(R.id.buttonNumSeven);
        buttonNumSeven.setOnClickListener(buttonNumSevenListener);
        buttonNumEight = findViewById(R.id.buttonNumEight);
        buttonNumEight.setOnClickListener(buttonNumEightListener);
        buttonNumNine = findViewById(R.id.buttonNumNine);
        buttonNumNine.setOnClickListener(buttonNumNineListener);

        buttonOpSum = findViewById(R.id.buttonOpSum);
        buttonOpSum.setOnClickListener(buttonOpSumListener);
        buttonOpSub = findViewById(R.id.buttonOpSub);
        buttonOpSub.setOnClickListener(buttonOpSubListener);
        buttonOpMul = findViewById(R.id.buttonOpMult);
        buttonOpMul.setOnClickListener(buttonOpMulListener);
        buttonOpDiv = findViewById(R.id.buttonOpDiv);
        buttonOpDiv.setOnClickListener(buttonOpDivListener);
        buttonOpComma = findViewById(R.id.buttonOpComma);
        buttonOpComma.setOnClickListener(buttonOpCommaListener);
        buttonOpEqual = findViewById(R.id.buttonOpEqual);
        buttonOpEqual.setOnClickListener(buttonOpEqualListener);
        buttonOpClear = findViewById(R.id.buttonOpClear);
        buttonOpClear.setOnClickListener(buttonOpClearListener);
        buttonOpHistory = findViewById(R.id.buttonOpHistory);

        outputResult = findViewById(R.id.outputResult);

    }

    public void handleHistoryClick(View v){
        Intent it = new Intent(getBaseContext(), CalculatorHistory.class);
        it.putExtra("historyList", (Serializable) historyList);
        startActivity(it);
    }

}