package com.company;

public class Main {

    public static void main(String[] args) {
        int star = 0;
        for (int i = 0; i < 5; i++){
            star ++;
            for (int j = 0; j < star; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        int starTriangle = 0;
        for (int x = 0; x < 5; x++){
            for (int y = 0; y < 5; y++){
                if(x + y  == 4){
                    break;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int x = 0; x < 9; x++){
            for (int j = 0; j < 9; j++){
                System.out.print("*");
                if(x == j ){
                    break;
                }else if( (x+j) == 8){
                    break;
                }
            }

            System.out.print("\n");
        }
    }
}
