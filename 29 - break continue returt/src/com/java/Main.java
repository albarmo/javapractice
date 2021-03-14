package com.java;

public class Main {

    public static void main(String[] args){
        int a = 1;
        while(a <= 10)
        {   if (a == 5){
          continue;
        }
        else {
            System.out.println("Nilai a :" + a);
            a++;
        }
        }
    }
}
