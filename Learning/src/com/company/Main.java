package com.company;

import java.net.PortUnreachableException;

public class Main {

    public static void main(String[] args) {
	
        double Pounds = 1000.00;

        Converter(Pounds);

        //Operator Challenge
        double Var20 = 20d;
        double Var80 = 80d;
        double SumVar = (Var20 + Var80)*100;
        SumVar %= 4;
        boolean isSumVarZero = (SumVar == 0)? true:false;

        System.out.println(isSumVarZero);

        if (!isSumVarZero){
            System.out.println("Got some reminder");
        }


    }
    public static void Converter(double Pounds){

        double Kilograms = Pounds * 0.45359237;
        //System.out.println(Kilograms);
    }
}
