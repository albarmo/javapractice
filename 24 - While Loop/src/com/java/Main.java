package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int a = input.nextInt();
        while(a > 0){
            a--;
            System.out.println("nilai a :" + a);
        }
    }
}
