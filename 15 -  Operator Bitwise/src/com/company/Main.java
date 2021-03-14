package com.company;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte a = 3;
        byte b = 3;

        String a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("Binary >  %d = %s \n",a, a_bits);

        // Operator SHIFT LEFT
        System.out.println("======= SHIFT LEFT");
        b = (byte)(a << 1);
        String b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        // Operator SHIFT RIGHT
        System.out.println("SHIFT RIGHT =======");
        a= 24;
        a = (byte)(a >> 3);
        a_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

    }
}
