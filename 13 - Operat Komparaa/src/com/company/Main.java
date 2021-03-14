package com.company;

public class Main {

    public static void main(String[] args) {
        // nilai komparasi akan menghasilkan nilai boolean
        float a = 10.1f;
        int b = 10;
        boolean hasilKomparasi = (a == b );

        System.out.printf("%f apakah sama dengan %d : %s \n", a,b, hasilKomparasi);
    }
}
