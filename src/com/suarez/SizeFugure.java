package com.suarez;
/*
Changing the size of a figure
12/6/19
Ver 1


        System.out.print(" \\     / \n");
        System.out.print("  \\   / \n");
        System.out.print("   \\ / \n");
// between spaces = 2*size-2
//Outside spaces = -line+size+1
*/
public class SizeFugure {
    //public static final int SIZE = 10;

    public static void top(int SIZE){
        for(int line=1; line <= SIZE; line++  ) {
            for (int space = 1; space <= -line+(SIZE + 1);space++) {
                System.out.print(" ");
            }
            //prints the spaces before the shape
            System.out.print("/");
            for(int spaceBetween = 1; spaceBetween <= 2*line-2; spaceBetween++){
                System.out.print("/");
            }
            //makes the recursive slashes that don't include the initial outside "Sandwich" slashes
            System.out.println("\\");
        }
    }
    public static void bot(int SIZE){
        for(int line=1; line <= SIZE; line++  ) {
            //top but reversed
            for (int space = 1; space <= line-1;space++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for(int spaceBetween = 1; spaceBetween <= -2*line+2*SIZE; spaceBetween++){
                System.out.print("/");
            }
            for (int space = 1; space <= line-1;space++) {
                System.out.print(" ");

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        top(1);
        //bot(6);

	// write your code here
    }
}