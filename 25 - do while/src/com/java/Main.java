package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai a : ");
        int a = input.nextInt();
        System.out.print("masukan nilai b : ");
        int b =  input.nextInt();

        System.out.println("pengulangan akan dilakukan sebanyak" + (a - b));
        do {
            System.out.println("a value : " + a);
            a++;
        }while (a <= b);
    }

}
