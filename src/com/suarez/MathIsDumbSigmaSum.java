package com.suarez;
import java.util.Scanner;

public class MathIsDumbSigmaSum {
    public static void fractionSum(int userInput) {

        double sum = 0;

        for(int i =1; i <= userInput; i++){
            sum = sum + 1.0/i;
            //System.out.print(sum + " + ");
            }
        System.out.printf("The sum is %f2" , sum);
        }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("What value would you like n to be?");
        int n = console.nextInt();
        fractionSum(n);


    }

}
