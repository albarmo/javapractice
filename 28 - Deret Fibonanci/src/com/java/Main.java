package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //deret fibonanci
        Scanner input = new Scanner(System.in);

        int jumlahDeretFibonanci =  input.nextInt();
        int fibonanci = 0;

                for (int k = 0; k < jumlahDeretFibonanci; k++ ){
                    fibonanci = k + (k+1);
                    System.out.printf("%d + %d  = %d \n", k,(k+1),fibonanci);
        }
        System.out.println("Nilai deret fibonanci : " + fibonanci );
    }
}
