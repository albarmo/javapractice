package com.java;

public class Main {
    public static void main(String[] args) {
        angka(1.0f);
        angka(18.0d);
        angka(10);

        int hasilInteger = tambahAangka(1, 5);
        System.out.println("hasil method tambah adalah " + hasilInteger);

        float hasilFloat = tambahAangka(1.2f, 1.3f);
        System.out.println("hasil method float : " +  hasilFloat);

        float hasilFloatInteger =  tambahAangka(10.5f,5);
        System.out.println("hasil method float dan integer adalah : " + hasilFloatInteger);

    }

    private static float tambahAangka(float a, float b) {
        return a + b;
    }

    private static float tambahAngka(float a, int b){
        return a + b;
    }

    private static int tambahAangka(int a, int b) {
        return a + b;
    }

    private static float tambahAngka(float a, float b) {
        return a + b;
    }

    //overload method
    private static void angka(double params) {
        System.out.println("Angka ini adalah integer : " + params);
    }

    private static void angka(float params) {
        System.out.println("Angka ini adalah integer : " + params);
    }

    private static void angka(int params) {
        System.out.println("Angka ini adalah integer : " + params);
    }
}
