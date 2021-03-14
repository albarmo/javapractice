package com.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        int keyValue = 8;
        System.out.print("shoot : ");
        int shoot = input.nextInt();
        boolean resultHandler =  keyValue == shoot;
        boolean statusTebakan;

        // aljabar boolean
        statusTebakan = (shoot > 1) && (shoot < 10);

        System.out.println(statusTebakan);

        if ( statusTebakan){
            System.out.println("Your Hit it!");
        }else {
            System.out.println("Oops, Miss!");
        }
    }

}
