package com.suarez;
import java.util.Scanner;
public class DateGuesser {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What month would you like too use?");
        int month = console.nextInt();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What day would you like too use?");
        int day = keyboard.nextInt();
        fall(month, day);



    }
    public static void fall(int month, int day){
        if(month >= 9){
            if(month <= 12){
                if(day <= 31){
                    if(day >= 16){
                        System.out.print("That falls in fall!");
                    }
                    if( month ==12){
                        if(day > 15){
                            System.out.print("This is not in fall");

                        }
                    }
                }
            }

        }

    }
}
