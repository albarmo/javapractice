package com.java;

import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        int data =  input.nextInt();
        for (int i = 0; i < data; i ++){
            System.out.println("Looping ke-" + i);
        }
    }
}
