package com.suarez;
import java.util.Scanner;

public class EncryptorClientClassGUI {
    public static String main(String password, String shift, boolean detect) {
        Scanner keyboard = new Scanner(System.in);
//
            EncryptorClassGUI newClassObj = new EncryptorClassGUI();
            String[] alphabetArray = newClassObj.alphabetArray();
            int size = alphabetArray.length;
        /*NOTE TO MS.SUAREZ AND FUTURE ME, I got a headache trying to fit all this logic into a class and call it, so for
        the time being, the following code is left in the client for my own sanity. Hopefully once I have it all written, I can start
        to organize it
         */
            String[] brokenString = EncryptorClassGUI.stringBreaker(password);
            int[] charLocation = new int[brokenString.length];
            for (int i = 0; i <= brokenString.length - 1; i++) {
                // find the index of 5
                String alphacharLocation = brokenString[i];
                //the new array will have it so, at bucket 0 in the broken sentance array, if it is "a", then it will search the alphabet for the
                //point at which "a" occurs, and then it will put the new integer in the corresponding bucket
                charLocation[i] = EncryptorClassGUI.findIndex(alphabetArray, alphacharLocation);
            }
            //The above line is checking at what point letter in brokenArray[i] occurs in alphabetArray
            //the above code is for debugging
//            System.out.print("What number are you making the code by? (-" +((((alphabetArray.length) - (maxCharLocation)) + (brokenString.length - 3)) + 1 +alphabetArray.length-brokenString.length)+") to ("+ ((((alphabetArray.length) - (maxCharLocation)) + (brokenString.length - 3)) + 1 +alphabetArray.length-brokenString.length) + ")");
//              System.out.print("What number are you making the code by? (-" + alphabetArray.length + ", " + alphabetArray.length + ")");
        //The above formula used to calculate the maximum encryption value was pulled out of thin air, along with educated guessing. I have no idea why you need to subtract 3 from the length, then add 1. I just noticed the pattern
            int[] shiftArray = EncryptorClassGUI.shiftString(brokenString, alphabetArray,charLocation, shift, detect);
            String str = EncryptorClassGUI.alphaDecode(brokenString,shiftArray,alphabetArray);
            //System.out.print(str);
            return str;
            //we need to turn the decoded array into a string and return it here}
    }
}

