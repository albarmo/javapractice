package com.java;

public class Main {

    public static void main(String[] args){
        System.out.println(data());
        dataVoid("albarm");
        sapaUser("aku");
    }

    private static void sapaUser(String nama){
        System.out.println("selamat pagi " + nama );
    }

    private static float data (){
        return 10.0f;
    }

    private static void dataVoid (String input){
        System.out.println("Hallo " + input );
    }

}
