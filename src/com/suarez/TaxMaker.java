package com.suarez;

import java.awt.desktop.SystemSleepEvent;

public class TaxMaker {
    public static void main(String[] args){
        int subTotal = 38 + 40 + 30;
        double tax = .08 * subTotal;
        double Tip = .15 * subTotal;
        //Heads up the following commented code is good and correct, but it put spaces between the $ and the money, so I didn't use it cause it didn't look nice
        System.out.println("Subtotal:  $"+ subTotal);
        ///System.out.printf("Tax: %8.2f \n" ,tax);
        //the upper code will insert a new string with spaces before the float var of tax, so you can't seperate them, hence why I just used the dummy method
        System.out.println("Tax:      $" + tax);
        //System.out.printf("Tip: %,9.2f \n" , Tip );
        System.out.println("Tip:      $" + Tip);
        //System.out.printf("Total : %,6.2f \n" , (tax + Tip + subTotal));
        System.out.println("Total:  $" + (tax + Tip + subTotal));
    }
}
