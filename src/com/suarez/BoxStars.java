package com.suarez;
import java.awt.desktop.SystemSleepEvent;
import java.util.*;
public class BoxStars {
    public  static void main (String[] args){
        //BoxStarsClient.main(String[] args);
    }
    public static int Size(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What size should the box be?");

        int size = keyboard.nextInt();
        return size;
    }

    public static int Box(int size){
        //int size = Size();
        //return size;
        for(int lines = 1; lines<= size+2; lines++){
            System.out.print("_");
        }
        System.out.println();
        for(int lines= 0 ; lines <= size; lines++){
            System.out.print("|");

            for(int spaces = 0; spaces <= size; spaces++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for(int lines = 1; lines<= size+2; lines++){
            System.out.print("_");
        }
        return size;
    }
    public static void BoxStars(int size, Point p1, Point p2, Point p3, Point p4){

        //return size;
        for(int lines = 1; lines<= size; lines++){
            System.out.print("_");
        }
        System.out.println();
        for(int lines= 0 ; lines <= size-2; lines++){
            System.out.print("|");

            for(int x = 0; x <= size-2; x++){
                if(((p1.getX() == x && p1.getY() == lines)||(p2.getX() == x && p2.getY() == lines) || (p3.getX() == x && p3.getY() == lines) || (p4.getX() == x && p4.getY() == lines) )){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        for(int lines = 1; lines<= size; lines++){
            System.out.print("_");
        }
    }
    //public static box()
}
