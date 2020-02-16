package com.suarez;
import java.util.*;
import java.io.*;
public class EncryptorClass {
    private String[] alphabetArray = {" ", "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B",
            "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
            "Y", "Z", "!", "?", ",", ".", "\"", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public String[] alphabetArray() {
        return alphabetArray.clone();
    }
    public static String scannyboi() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input sentance");

        String sentance = keyboard.nextLine();
        return sentance;
    }
    public static String[] stringBreaker(String str) {
        String[] brokenSentance = new String[str.length()];
        for (int i = 0; i <= brokenSentance.length - 1; i++) {
            brokenSentance[i] = str.substring(i, i + 1);
        }
        return brokenSentance;
        //the above code is my attempt to take in the given string and break it up into a char array
    }

    public static int findIndex(String[] arr, String t) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(t)) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static int max(int[] t) {
        int maximum = t[0];   // start with the first value
        for (int i = 1; i < t.length; i++) {
            if (t[i] > maximum) {
                maximum = t[i];   // new maximum
            }
        }
        return maximum;
    }
//The above code was found on Stack Overflow, its purpose is to search an array for the spot where a charecter occured

    public static void stringBreakerDebug(int arrayVal, String[] brokenSentance) {
        System.out.print(brokenSentance[arrayVal]);
    }
    //the above method was used as a debugger to test the charecter shift in its primitive form, when it would not shift consistently, I left it in in case I need it again

    public static int[] shiftString(String[] brokenString, String[] alphabetArray, int[] charLocation) {
        Scanner keyboard = new Scanner(System.in);
        String shiftString = keyboard.next();
        int shift = Integer.valueOf(shiftString);
        if(shift > alphabetArray.length || shift < -(alphabetArray.length)){
            System.out.print("Sorry, that value is outside of the range, try to put numbers between -" + alphabetArray.length + " and " + alphabetArray.length);
            shift = keyboard.nextInt();
        }
        System.out.println();
        int[] shiftArray = new int[brokenString.length];
        for (int i = 0; i <= brokenString.length - 1; i++) {
            if (charLocation[i] + shift > alphabetArray.length - 1) {
                shiftArray[i] = (charLocation[i] + shift) - (alphabetArray.length - 1);
                //so that we don't get a -1 error, the array will loop
            }
//            else if (charLocation[i] + shift < 0) {
//                shiftArray[i] = (alphabetArray.length - 1) + (charLocation[i] + shift);
//            } else if (charLocation[i] + shift < 0 && (((alphabetArray.length - 1) + (charLocation[i] + shift)) > 0)) {
//                shiftArray[i] = (alphabetArray.length - 1) + (charLocation[i] + shift);

            else {
                shiftArray[i] = charLocation[i] + shift;
            }
        }
            //The above logic was designed for a previous iteration of the code, I left it in so that you could use the class in a wider variety of scenarios (Also the code breaks without some of them)


        return shiftArray;
    }
    public static String alphaDecode(String[] brokenString, int[] shiftArray, String[] alphabetArray) {
        String str = "";
        for( int i = 0; i<= brokenString.length-1; i++){
            int newAlphaChar = shiftArray[i];
            str = str+alphabetArray[newAlphaChar];
        }
        return str;
    }
}






