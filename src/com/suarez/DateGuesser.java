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
        season(month, day);



    }
    public static void season(int month, int day){

        if((month == 12 && ( day>=16 || day <= 31)) || ((month == 1 || month ==  2)  &&  (day>=1 || day <= 31)) || (month == 3 && ( day>=1 || day <= 15))){
        System.out.print("This is winter");
        }
        else if(((month == 4 || month == 5) &&( day>=1 || day <= 31) ) || (month == 3 && (day>=16 || day <= 31)) || month == 6 && ( day>=1 || day <= 15 )){
            System.out.print("This is spring");
        }
        else if((month == 6 && ( day>=1 || day <= 15)) || (month == 7 || month ==  8  && (day>=1 || day <= 31)) || (month == 9 && ( day>=1 || day <= 15) )){
            System.out.print("This is Summer");
        }
        else {
        System.out.print("This is fall");
        }





    }


    }

