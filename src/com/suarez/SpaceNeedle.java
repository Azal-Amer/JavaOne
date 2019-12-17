package com.suarez;

public class SpaceNeedle {
    public static int SIZE = 4;
    public static void main(String[] args) {
        Needle();
        topHead();
        botHead();
        Needle();
        percentPole();
        topHead();
    }
    public static void Needle(){

        for(int i = 1; i<= SIZE; i++){
            for (int j = 1 ; j <= SIZE*3; j++){
                System.out.print(" ");
            }
            System.out.println("||");

    }}
    public static void topHead(){
        for(int line = 1; line <= SIZE; line ++){
            for(int i = 1; i <= 3*SIZE- 3*line; i++){
                System.out.print(" ");
            }
            System.out.print("__/");
            for(int colon = 1; colon <= (3*(line-1)); colon++){
                System.out.print(":");
            }
            System.out.print("||");

            for(int colon = 1; colon <= (3*(line-1)); colon++){
                System.out.print(":");
            }
            System.out.println("\\__");

        }
        System.out.print("|");

        for(int i = 1; i<= 6*SIZE; i++){
            System.out.print("\"");


        }
        System.out.println("|");

    }
    public static void botHead(){
        for(int line = 1; line <= SIZE; line++){
            //line maker
            for(int i = 1; i <= 2*(line)-1; i++){
                //spaces maker
                System.out.print(" ");
            }
            System.out.print("\\_");
            //inside triangle maker loop
            for(int i = 1; i <= 3*SIZE -2*line; i++){
                System.out.print("/\\");
            }
            System.out.println("_/");
        }

    }
    public static void percentPole(){


        for(int i = 1; i<= SIZE*SIZE; i++){
            //makes the amount of times to repeat the lines size^2
            for (int j = 1 ; j <= (SIZE*3)-3; j++){
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
    }





}

