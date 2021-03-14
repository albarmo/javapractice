package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int angka = 1;
        System.out.println("unary minus -angka : " + -angka);
        System.out.println("unary minus +angka : " + +angka);

        // increment dan decrement
        System.out.println("increment angka" + angka++);
        System.out.println("decrement angka" + angka--);
        System.out.println(angka);

        //prefix dan postfix
        int pre = 10;
        int post = 10;
        System.out.printf("%d prefix \n",++pre);
        System.out.printf("%d postfix \n", post++);
        System.out.printf("%d angka prefix akan dijumblah setelah data dipagnggil \n", post);


        // negasi (bangSign)
        boolean isStatus = true;
        System.out.println("nilai isStatus : " + isStatus);
        System.out.println("nilai isStatus setelah negasi : " + !isStatus);
    }
}
