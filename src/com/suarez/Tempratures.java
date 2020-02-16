package com.suarez;
import java.io.*;
import java.util.*;
public class Tempratures {
    public static void main(String args[]) throws FileNotFoundException{
        //try using a ~ for getting a relative path
        Scanner input = new Scanner(new File("C:\\Users\\amer_\\IdeaProjects\\The Suffering of Suares (Her name not mine)\\src\\com\\suarez\\weather.txt"));
        double prev = input.nextDouble();

        while(input.hasNextDouble()) {
            double next = input.nextDouble();
            System.out.println("prev" + " to " + next + ", change = " + (next - prev));
        }


    }
}
