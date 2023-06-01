package com.mycompany.propertymanagement.controller;

public class CalculatorMain {

    public static void main(String[] args){
        CalculatorController cc = new CalculatorController();
        Double result = cc.add(4.55, 8.5, 2.02);
        System.out.println(result);
    }
}
