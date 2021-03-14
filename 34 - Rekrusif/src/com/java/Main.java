package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah operasi fungsi rekrusif : ");
        int jumlahIterasi = input.nextInt();
        recursiveFunction(jumlahIterasi);
        System.out.println("Recrusive Aritmetic Operation : " + recrusiveOperations(jumlahIterasi));
        System.out.println("Faktorial using recrusive : " + factorial(jumlahIterasi));
    }

    private static void recursiveFunction(int parameter) {
        System.out.println("Recrusive :" + parameter);
        parameter--;
        if (parameter != 0) {
            recursiveFunction(parameter);
        }
    }

    private static int recrusiveOperations(int parameter) {
        if (parameter == 0) {
            return parameter;
        }
        System.out.println("parameter = " + parameter);
        return parameter + recrusiveOperations(parameter - 1);
    }

    private static int factorial(int parameter) {
        System.out.println("factorial = " + parameter);
        if (parameter == 1) {
            return parameter;
        }
        return parameter * factorial(parameter - 1);
    }
}
