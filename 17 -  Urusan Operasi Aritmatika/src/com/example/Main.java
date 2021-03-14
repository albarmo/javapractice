package com.example;

import java.util.Scanner;

public class Main {

    public static  void main (String[] args){

        Scanner inputUser = new Scanner(System.in);

        // operasi aritmatika di java
        // PERKALIAN ATAU PEMBAGIAN AKAN DILAKUKAN TERLEBIH DAHULU
        int hasil;
        int m,x,c;

        // latihan persamaan kuadrat

        System.out.print("m : ");
        m = inputUser.nextInt();
        System.out.print("x : ");
        x = inputUser.nextInt();
        System.out.print("c : ");
        c = inputUser.nextInt();

        int persamaanKuadrat =( m * x * x ) + c;
        System.out.printf("Result : %d", persamaanKuadrat);


    }
}

//        hasil = 8 / 2 + 5 * 10;
//        System.out.println(hasil);
//        // pengelompokan eskekusi aritmatikan dapat dikelompokan menggunakan kurung
//        hasil = (5 + 10) * 10;
//        System.out.println(hasil);