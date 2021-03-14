package com.java;

public class Main {
    public static void main(String[] args){
        System.out.println("pengenalan function");
        int result = hitung(20);
        System.out.println(result);
    }

   private static int hitung(int val){
        int hasil;
        hasil = (val + 2) * val;
        return hasil;
    }


}
