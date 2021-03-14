package com.example;

public class Main {
    public static void main(String[] args){
//        konversi tipe data
        int numberInt =  450; // 32 bit
        long numberLong = 123456;
        long intToLong =  numberInt; // dari tipe data kecil ke besar
        int LongToInt = (int) numberLong;



        System.out.println("nilai integer :" + numberInt);
        System.out.println("nilai long :" + numberInt);
        System.out.println("nilai intCastLong :" + intToLong);
        System.out.println("nilai longCastInt:" + LongToInt);

        //error jika sebalikanya


        // casting pembagian

        float a  = 10;
        int b  =  4;
        float c =  a / b;
        System.out.printf("%f / %d = %f \n", a,b,c);


        int x = 10;
        int y = 4;
        float z = (float) x / y ;

        System.out.printf("%d / %d = %f \n", x,y,z);

    }

}
