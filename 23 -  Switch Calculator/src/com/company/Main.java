package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    float a = inputUser.nextFloat();
    char operator = inputUser.next().charAt(0);
    float b =  inputUser.nextFloat();
    float result =  0;

    switch (operator){
        case '+' :
            result = a + b;
            break;
        case '-' :
            result = a - b;
            break;
        case '*' :
            result =  a * b;
            break;
        case '/' :
            result = a / b;
            break;
        case '%' :
            result = a % b;
            break;
        default:
            System.out.print("input operator invalid \n");
    }
    System.out.printf("%f %c %f : %f", a,operator,b,result);


    }
}
