package com.java;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("operasi array");
        String[] name = {"aku", "kamu", "dia"};
        System.out.println("Nilai array : " + Arrays.toString(name));

        printName(name);

        //mengcopy array
        int[] arrayAngka1 = {1, 2, 3, 4, 5, 6};
        int[] arrayAngka2 = new int[6];

        System.out.println("array angka 1 : " + Arrays.toString(arrayAngka1) + "address memories : " + arrayAngka1);
        System.out.println("array angka 2 : " + Arrays.toString(arrayAngka2) + "address memories : " + arrayAngka2);

        // manualy copy array
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }

        System.out.println("\n");

        System.out.println("array angka 1 : " + Arrays.toString(arrayAngka1) + "address memories : " + arrayAngka1);
        System.out.println("array angka 2 : " + Arrays.toString(arrayAngka2) + "address memories : " + arrayAngka2);


        System.out.println("copy array degnan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, arrayAngka1.length);
        System.out.println("array angka 3 : " + Arrays.toString(arrayAngka3) + " @address " + arrayAngka3);

        System.out.println("========= COPY OF Range ==========");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 0, 3);
        System.out.println("array angka 4 : " + Arrays.toString(arrayAngka4));

        // fill array
        System.out.println("\n ========== FILL ARRAY ========= \n");
        int[] arrayAngka5 = new int[100];
        Arrays.fill(arrayAngka5, 8);
        System.out.println("array angka 5 : " + Arrays.toString(arrayAngka5) + " filled ");

        // komparasi array
        System.out.println("============ KOMPARASI VALUE ARRAY =============");
        int[] arrayAngka6 = new int[6];
        int[] arrayAngka7 = new int[6];

        arrayAngka6 = Arrays.copyOf(arrayAngka1,arrayAngka1.length);
        arrayAngka7 = new int[]{1, 2, 5, 4, 5, 6};

        System.out.println("array angka 6 : " + Arrays.toString(arrayAngka6));
        System.out.println("array angka 7 : " + Arrays.toString(arrayAngka7));

        if (Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("sama");
        }else {
            System.out.println("beda");
        }

        System.out.println("======== COMPARE ARRAY ==========");
        System.out.println("mencari nilai terbesar dari array");

        System.out.println("compare arrays => " + Arrays.compare(arrayAngka6,arrayAngka7));
        // cek index yang berbeda

        System.out.println("mencari index berbeda : " +  Arrays.mismatch(arrayAngka6,arrayAngka7));


        // search array
        System.out.println("======== Search Array value return index ==========");
        int[] arrayAngka8 = {1,2,5,7,8,3,2,4,8};

        System.out.println("before sorting : " + Arrays.toString(arrayAngka8));

        System.out.println("=== sort array ====");
        Arrays.sort(arrayAngka8);
        System.out.println("after sorting : " + Arrays.toString(arrayAngka8));

        int searchNumber = 7;
        System.out.println("search number in index " + Arrays.binarySearch(arrayAngka8,searchNumber));

    }

    private static void printName(String[] name) {
        for (String username : name) {
            System.out.printf("Hello, %s \n", name);
        }
    }

}
