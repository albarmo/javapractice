package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner input =  new Scanner(System.in);
    String accessName = "alyaaa";

    System.out.print("masukan nama anda : ");
    String userName =  input.nextLine();

        System.out.println("Okey... and then ?");
        int answer =  input.nextInt();
        boolean flag =  false;

        if (userName.equalsIgnoreCase(accessName)) {
            flag = true;
        }

        if (flag && answer == 1 ){
            System.out.println("Oke here we go");
        } else{
            System.out.println("Sorry,you are not welcome!");
        }
    }
}
