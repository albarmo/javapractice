package com.company;

public class Main {

    public static void main(String[] args) {
	// AND OR XOR Negasi
        System.out.println("========= OR ===========");
        boolean a = true;
        boolean b  = false;
        System.out.println(a || b);

        System.out.println("========= AND ===========");
        a = true;
        b  = false;
        System.out.println(a && b);

        System.out.println("========= XOR ===========");
        a = true;
        b  = false;
        System.out.println(a ^ b);

        System.out.println("========= NOT (Negasi) ===========");
        a = true;
        b  = false;
        System.out.println(!b);
    }
}
