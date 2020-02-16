package com.suarez;
import java.util.*;
public class BoxStarsClient {
    public static void main(String[] args ){
        //BoxStars.Box();
        int size = BoxStars.Size();
        Point p1 = new Point();p1.randomPoint(size);
        Point p2 = new Point();p2.randomPoint(size);
        Point p3 = new Point();p3.randomPoint(size);
        Point p4 = new Point();p4.randomPoint(size);

        BoxStars.BoxStars(size, p1, p2, p3, p4);
        System.out.print("\n");
        System.out.println("(" + p1.getX() + "," + p1.getY() +")");
        System.out.println("(" + p2.getX() + "," + p2.getY() +")");
        System.out.println("(" + p3.getX() + "," + p3.getY() +")");
        System.out.println("(" + p4.getX() + "," + p4.getY() +")");

        System.out.print(p1.getX() + "," + p1.getY());




    }
}
