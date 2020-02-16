package com.suarez;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ElectoralVotes {
    public static void main(String args[]) throws FileNotFoundException {
        //try using a ~ for getting a relative path
        Scanner input = new Scanner(new File("C:\\Users\\amer_\\IdeaProjects\\The Suffering of Suares (Her name not mine)\\src\\com\\suarez\\poll.txt"));
        int obama = 0;
        int mccain = 0;
        while(input.hasNextLine()){
            String line = input.nextLine();
            Scanner elect = new Scanner(line);
            int count = 1;
            while(elect.hasNext()){
                while(elect.hasNextInt()) {
                    if (count == 1) {
                        obama = obama + elect.nextInt();
                    }
                    else if (count == 2) {
                        mccain = mccain + elect.nextInt();
                    }
                    else if (count==3){
                        int a = elect.nextInt();
                    }

                    count++;
                    }
                String texty = elect.next();
                }


        }
        System.out.println("Obama: " + obama);
        System.out.print("Mccain: " + mccain);
    }


}
