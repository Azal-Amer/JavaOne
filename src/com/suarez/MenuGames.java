package com.suarez;
import java.util.*;
import java.util.Random;
import java.util.Random;
import java.util.Scanner;
public class MenuGames {
    //

    public static void main(String[] args){
        boolean gamePlay = true;
        while(gamePlay){

            Scanner console = new Scanner(System.in);
            System.out.println("Which game would you like too play?(1-6)");;
            System.out.println(" 1- Xo \n 2- Smallest Largest \n 3- printGPA \n 4- longestName \n 5- Triangle Type \n 6- Dice Rolling \n 7- number Sorter \n -1-Stop playing \n" );
            int n = console.nextInt();

            if(n == 1){
                Scanner keyboard = new Scanner(System.in);
                System.out.println("How big Would you like the box to be?");
                int SIZE = keyboard.nextInt();

                for(int row = 1; row <= SIZE; row ++){
                    for(int collum = 1; collum <= SIZE; collum++){
                        if(row == collum || row + collum == SIZE +1){
                            System.out.print("x");
                        }
                        else{
                            System.out.print("o");
                        }
                    }
                    System.out.println("");

                }

            }
            else if( n == 2){
                System.out.println("How many numbers would you like to sort?");
                int numbers = console.nextInt();
                int[] intArray = new int[numbers];
                for(int i = 0; i < numbers; i++){
                    System.out.println("Type in your numbers now");
                    intArray[i]= console.nextInt();
                }
                int max = 0;
                int min = 5000;
                for(int i = 1; i < numbers; i++){
                    System.out.println("Number " + i + ": " + intArray[i]);
                }
                for(int i = 1; i < numbers; i++){

                    if(intArray[i] < min){
                        min = intArray[i];
                    }
                    if(intArray[i] > max){
                        max = intArray[i];
                    }

                }
                System.out.println("Max : " + max +  "\nMin : " + min);



            }
            else if(n == 3){
                System.out.print("Enter a student's record: ");
                Scanner console1 = new Scanner(System.in);

                String studentRecord = console1.nextLine();
                String[] records = studentRecord.split(" ");
                float recordsLength = records.length;
                System.out.print(records[0] + "'s record is ");
                int total = 0;
                float average;

                for(int i = 1; i<= recordsLength-1; i++){
                    total = total + Integer.parseInt(records[i]);

                }
                System.out.printf( "%.2f", total/recordsLength);
                System.out.print("%");

            }
            else if(n==4){

                String longest = "";
                boolean tie = false;
                System.out.print("How many names would you like to print?");
                int numbernames = console.nextInt();
                for (int name = 1; name <= numbernames; name++){
                    System.out.print ("name #" + name + ":");
                    String namename = console.next();
                    if (namename.length() == longest.length()){
                        tie = true;
                    }
                    else if (namename.length() > longest.length()){
                        tie = false;
                        longest = namename;
                    }
                    else{
                        tie = false;
                    }
                }
                if (tie == true) {
                    System.out.println("The names are equal in length");
                }
                else{
                    System.out.println (capitalize(longest) + "'s name is longest");}
            }
            else if(n==5){
                int[] tri = new int[3];

                for(int i = 1; i<=3; i++){
                    //Scanner console1 = new Scanner(System.in);

                    System.out.print("Enter side " + i + ".");
                    int side  = console.nextInt();
                    tri[i-1]= side;

                }
                if(tri[0] == tri[1] && tri[1] == tri[2]){
                    System.out.print("Equilateral");
                }
                else if(tri[0] == tri[1] || tri[1] == tri[2]|| tri[1]== tri[2] ){
                    System.out.print("Isosceles");
                }

                else{
                    System.out.print("Scalene");
                }}
            else if(n==6){
                int sum = 0;
                int iteration = 0;
                int diceOne = 0;
                int diceTwo = 0;
                //this program will add a+b randomized too equal 7
                while( sum != 7){
                    Random rand = new Random();
                    diceOne = rand.nextInt(6) + 1;
                    diceTwo = rand.nextInt(6) + 1;
                    sum = diceOne+diceTwo;

                    System.out.println("Dice A: " + diceOne + " Dice B: "+ diceTwo + " = " + sum);
                    iteration ++;
                }
                System.out.print("It took me " + iteration + " times to get a 7");
            }
            else if(n==-1){
                gamePlay = false;
                System.out.print("Thanks for playing!");
            }
            else if(n==7){
                System.out.println("How many numbers would you like to sort?");
                int numbers = console.nextInt();
                int[] intArray1 = new int[numbers];
                for(int i = 0; i < numbers; i++){
                    System.out.println("Type in your numbers now");
                    intArray1[i]= console.nextInt();
                    System.out.println("Number " + intArray1[i]);
                }
                Arrays.sort(intArray1);
                System.out.printf("Sorted : %s" , Arrays.toString(intArray1));
                System.out.println();
                /*for(int i = 0; i < numbers-1; i++){

                    if(intArray1[i] > intArray1[i+1]){
                        int temp = intArray1[i+1];
                        intArray1[i] = intArray1[i+1];
                        intArray1[i+1] = temp;
                    }

                }
                for( int i = 0;i <= numbers-1; i++){
                    System.out.print(" " + intArray1[i]);
                }
                //System.out.print(max + " + " + min);

                 */
            }
            else{
                System.out.println("Sorry that's not a valid option!");
            }
            }
        }
    public static void Names(String longName, int n, int i) {
    }
    public static String capitalize(String str) {
        str = str.toLowerCase();

        if(str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

