package com.suarez;

import java.awt.desktop.SystemSleepEvent;

public class ChristmasTree {
    public static final int SIZE = 3;
    public static void main(String[] args) {
        for(int spaces = 1; spaces<=SIZE+3; spaces++){
            System.out.print(" ");
        }
        System.out.println("*");

        for(int tier = 1; tier <= 3; tier++){
            for(int line = 1; line<= SIZE+tier-1; line++){
                for(int space = 1; space <= -line +SIZE + 3; space++){
                    System.out.print(" ");
                }
                for (int fslash = 1; fslash <= line; fslash++){
                    System.out.print("/");
                }
                System.out.print("|");
                for (int bslash = 1; bslash <=line; bslash++){
                    System.out.print("\\");
                }
                System.out.println();

            }
        //top(5);
    }
    }
}
