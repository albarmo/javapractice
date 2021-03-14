package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();
        int a = 8;
        String result;

        result =  userInput == a ? "benar" : "salah";
        System.out.println("masukan anda " + result);

    }

}
