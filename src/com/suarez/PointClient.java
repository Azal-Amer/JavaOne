package com.suarez;


public class PointClient {
    public static void main(String[] args){
        Point p1 = new Point();
        System.out.println("(" + p1.getX()+"," + p1.getY() + ")");
        p1.setX(5);
        p1.setY(7);
        System.out.println("(" + p1.getX()+"," + p1.getY() + ")");
        Point p2 = new Point(-6,10);
        System.out.println("(" + p2.getX()+"," + p2.getY() + ")");
        double distance = p1.distance();
        System.out.printf("Distance= %.2f \n " , distance);
        distance = p2.distance();
        System.out.printf("Distance= %.2f \n " , distance);
        p1.location(2,6);

        //System.out.println("Distance= " + distance);
        distance = p1.distance(p2);
        System.out.printf("Distance= %.2f \n " , distance);
        p1.translate(5,7);
        System.out.println("(" + p1.getX()+"," + p1.getY() + ")");




        //System.out.println("Distance= " + distance);




    }
}

