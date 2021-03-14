package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // write your code here
        System.out.println("Nested Recrusive");
        System.out.print("masukan parameter : ");
        int parameter = input.nextInt();

        System.out.println("Recrusive  : " + fibo(parameter, "atas"));
        System.out.println("input : " + parameter + " Nilai fibonacci : " + fibo(parameter, "atas"));
    }

    private static int fibo(int params, String daun) {
        System.out.println("tree " + daun);
        System.out.println("Fibonacci ke n :" + params);
        if (params == 0 || params == 1) {
            return params;
        }
        return fibo(params -1, "kiri") + fibo(params - 2, "kanan");
    }
}
