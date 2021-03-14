package com.java;

import java.util.Scanner;

public class Main {

    public static  void main (String[] args){
        Scanner input =  new Scanner(System.in);
        String inputUser =  input.next();

        System.out.print("masukan pilihan program anda : ");

        // switch case in java
        switch (inputUser){
            case "name" :
                System.out.println("hello albarm");
                break;
            case "umur" :
                System.out.println("umur anda 23 tahuun");
                break;
            case "pekerjaan" :
                System.out.println("anda adalah seorang fullstack developer");
                break;
            default:
                System.out.println("Input invalid");
                break;
        }
        System.out.println("program selesai");

    }


}
