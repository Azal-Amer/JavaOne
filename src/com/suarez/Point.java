package com.suarez;

import java.util.Random;

public class Point {
    private int x;
    private int y;
    public Point() {
        x = 0;
        y = 1;
    }
    public Point(int x1, int y1) {
        x = x1;
        if (x1 >= 0) {
            x = x1;
        } else {
            System.err.println("ERROR NO NEG VALS");
        }

        y = y1;
    }
    public void setX(int x1) {
        x = x1;
    }
    public void setY(int y1) {
        y = y1;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void location(int x1, int y1) {
        x = x1;
        y = y1;
    }
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
    public double distance(Point p) {
        double x2 = p.x;
        double y2 = p.y;
        return Math.sqrt(((x2 - x) * (x2 - x)) + ((y2 - y) * (y2 - y)));
    }
    public void translate(int x1, int y1) {
        x = x + x1;
        //System.out.print();
        y = y + y1;
    }
    public void translateX(int x1) {
        x = x + x1;
    }
    public void translateY(int y1) {
    y=y+y1;
}
    public void randomPoint(int size){
        Random rand = new Random();
        int xRand = rand.nextInt(size) + 1;
        int yRand = rand.nextInt(size) + 1;
        x= xRand;
        y = yRand;
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


}
