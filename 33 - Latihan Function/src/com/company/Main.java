package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai panjang : ");
        int panjang = input.nextInt();
        System.out.print("Masukan nilai lebar : ");
        int lebar = input.nextInt();

        if(panjang != 0  && lebar != 0){
            gambar(panjang, lebar);
            System.out.print("\n");
            System.out.println("Nilai luas adalah : " +  hitungLuas(panjang, lebar));
            float keliling =  (float) hitungKeliling(panjang,lebar);
            System.out.println("Nilai keliling adalah : " +  keliling + " cm");
        } else {
            System.out.println("Input invalid : input anda adalah 0");
        }
    }

    private static int hitungLuas(int panjang, int lebar){
    int luas = 0;
    luas =  panjang * lebar;
    return luas;
    }

    private static int hitungKeliling(int panjang, int lebar){
      int keliling =  (panjang + lebar) * 2;
      return keliling;
    }

    public static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
