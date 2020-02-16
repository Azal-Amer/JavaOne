package com.suarez;
import java.io.*;
import java.util.*;
public class ReadFile {
    public static void main(String args[]) throws FileNotFoundException {
        //try using a ~ for getting a relative path
        Scanner input = new Scanner(new File("C:\\Users\\amer_\\IdeaProjects\\The Suffering of Suares (Her name not mine)\\src\\com\\suarez\\poll.txt"));
        while (input.hasNextLine()) {
            while (input.hasNextInt()) {
                if (input.hasNextInt()) {
                    int test = input.nextInt();
                    System.out.println(test);
                } else {
                    System.out.println("nope");
                    String text2 = input.next();
                }
            }


        }
    }}
