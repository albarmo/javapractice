package com.java;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai a : ");
        float a = input.nextFloat();
        System.out.print("masukan nilai b : ");
        float b = input.nextFloat();
        System.out.print("masukan operator : ");
        char aritmeticOperator = input.next().charAt(0);
        float result = 0;

        if (aritmeticOperator == '+'){
            result = a + b;
        }
        else if (aritmeticOperator == '-'){
            result = a - b;
        }
        else if (aritmeticOperator == '*'){
            result =  a * b;
        }
        else if (aritmeticOperator == '/'){
            if( b == 0 ){
                System.out.println("tidak bisa dibgai dengan 0");
            }else {
                result = a / b ;
            }
        }
        else {
            System.out.println("input operator invalid!");
        }
        System.out.printf("%f %c %f : %f", a,aritmeticOperator,b, result);
    }
}
