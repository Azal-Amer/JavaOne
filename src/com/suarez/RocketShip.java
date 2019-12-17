package com.suarez;

public class RocketShip {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        lid();
        equalStar();
        top();
        bot();
        equalStar();
        lid();
    }

    public static void spaces(int amount) {
        for (int space = 2 * SIZE; space >= amount + 1; space--) {
            System.out.print(" ");
        }

    }

    public static void lid() {
        for (int line = 1; line <= 2 * SIZE; line++) {
            spaces(line);
            System.out.print("/");
            for (int spaceBetween = 1; spaceBetween <= line - 1; spaceBetween++) System.out.print("/");
            System.out.print("**");
            for (int spaceBetween = 1; spaceBetween <= line - 1; spaceBetween++) System.out.print("\\");
            System.out.print("\\");
            spaces(line);
            System.out.println();
        }
    }

    public static void equalStar() {
        System.out.print("+");
        for (int i = 1; i <= 2 * SIZE; i++) {
            System.out.print("*=");
        }
        System.out.println("+");

    }

    public static void top() {
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("|");
            for (int j = 1; j <= SIZE - i; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("/\\");
            }
            for (int inBetween = 1; inBetween <= 2 * (SIZE -  i); inBetween++) {
                System.out.print(".");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("/\\");
            }
            for (int k = 1; k <= SIZE - i; k++) {
                System.out.print(".");
            }




        System.out.println("|");}
    }
    public static void bot(){
         for (int i = 1; i <= SIZE; i++) {
             System.out.print("|");
             for (int j = 1; j <= i-1; j++) {
                 System.out.print(".");
             }
             for (int j = 1; j <= SIZE -i+1; j++) {
                 System.out.print("\\/");
             }
             for (int inBetween = 1; inBetween <= 2 * i - 2; inBetween++) {
                 System.out.print(".");
             }
             for (int j = 1; j <= SIZE - i+1; j++) {
                 System.out.print("\\/");
             }
             for (int k = 1; k <= i-1; k++) {
                 System.out.print(".");

             }
             System.out.print("|\n");
         }}}