package com.example.projetocalculator;

import java.io.Serializable;

public class History implements Serializable {

    private float firstInput;
    private float secondInput;
    private String operator;
    private float result;

    public void setFirstInput(float firstInput){
        this.firstInput = firstInput;
    }

    public void setSecondInput(float secondInput){
        this.secondInput = secondInput;
    }

    public void setOperator(String operator){
        this.operator = operator;
    }

    public void setResult(float result){
        this.result = result;
    }

    public float getFirstInput(){
        return firstInput;
    }

    public float getSecondInput(){
        return secondInput;
    }

    public String getOperator(){
        return operator;
    }

    public float getResult(){
        return result;
    }

}