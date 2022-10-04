package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int panjang, lebar;
        int luas;

        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai panjang : ");
        panjang = input.nextInt();
        System.out.print("masukan nilai lebarr : ");
        lebar = input.nextInt();

        luas =  panjang * lebar;
        System.out.printf("Luas persegi panjang adalah  %d cm:",luas);

    }

}