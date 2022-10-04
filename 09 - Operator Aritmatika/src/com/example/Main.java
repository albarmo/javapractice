package com.example;

public class Main {
    public static  void main(String[] args){

        int value1 = 10;
        int value2 = 2;
        int sumResult, substractResult,hasilKali, hasilBagi, modulusResult;

        sumResult = value1 + value2;
        System.out.println(value1 + "+" + value2 + " : " + sumResult);

        substractResult = value1 - value2;
        System.out.println(value1 + "-" + value2 + " : " + substractResult);

        hasilKali = value1 * value2;
        System.out.println(value1 + "*" + value2 + " : " + hasilKali);

        hasilBagi = value1 / value2;
        System.out.println(value1 + "/" + value2 + " : " + hasilBagi);
        System.out.printf("%d + %d = %d \n", value1, value2, hasilBagi);

        /*
        akan menampilkan pesan error karena konversi tipe data
        float f = 10.2f;
        int temp =  10;
        float tempFloat =  f - temp;
        System.out.printf("%d  - %d = $d", f, temp, tempFloat);
         */

//        modulus
        modulusResult = value1 % (value2 + 1);
        System.out.printf("%d mod %d : %d", value1,value2+1, modulusResult);
    }
}
