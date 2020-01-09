package com.suarez;
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args){
        System.out.println("Would you like to convert from °F to °C, or °C to °F? (1 or 2)");
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        //I made it keyboard since there was an error for using "in" twice
        //For future reference, make an else statement in case someone is dummy dum
        if(choice == 1){
            System.out.println("What temperature in fahrenheit do you want too convert?");
            Scanner in = new Scanner(System.in);
            //calling for a incoming messsage
            int temperature = in.nextInt();
            System.out.println("Here are the converted Celsius temperatures for " + temperature + "°F:");

            for(int i = temperature; i <= temperature+5; i++){
                System.out.printf( "%7.2f\n", (i-32)/1.8);
                //This is derived from the celsius to fahrenheit formula
            }
        }
        if(choice ==2){
            System.out.println("What temperature in celsius do you want too convert?");
            Scanner in = new Scanner(System.in);
            //calling for a incoming messsage
            int temperature = in.nextInt();
            System.out.println("Here are the converted Fahrenheit  temperatures for " + temperature + "°C:");
            for(int i = temperature; i <= temperature+5; i++){
                System.out.printf( "%7.2f\n", (1.8*i+32));
            }
        }
    }
}
