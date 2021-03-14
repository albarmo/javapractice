package com.java;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("masukan jumlah looping ");
        int maxLoop =  input.nextInt();

        for (int i =  0; i < maxLoop; i ++){
            System.out.println("LOOP Pertama" + i);
            for (int j =  0; j < 5; j++){
                System.out.println("LOOP Kedua" + j);
                for (int k = 0; k < 5; k++){
                    System.out.println("LOOP ketiga" + k);
                }
            }
        }
    }

}
