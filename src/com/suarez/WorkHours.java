package com.suarez;

import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class WorkHours {
    public static void main(String args[])  throws FileNotFoundException {
        Scanner input = new Scanner (new File("C:\\Users\\amer_\\IdeaProjects\\The Suffering of Suares (Her name not mine)\\src\\com\\suarez\\hours.txt"));
        while (input.hasNextLine()){
            int size = 0;

            String ID = "";
            String name = "";
            double hours = 0;
            int count = 1;
            String line = input.nextLine();
            Scanner person = new Scanner(line);
            while(person.hasNext()) {
                if (count == 1) {
                    ID = person.next();
                }
                else if (count == 2) {
                    name = person.next();
                }
                else {
                    while (person.hasNextDouble()) {
                        size++;
                        hours = hours + person.nextDouble();
                    }
                }
                count++;
            }
            //System.out.println(name + "(ID#"+ ID + ")" + "worked " + hours + " hours (" + (hours/size) + " hours / day)");
            System.out.print(name + "(ID#"+ ID + ") " + "worked ");
            System.out.printf("%.1f", hours);
            System.out.print(" hours (");
            System.out.printf("%.2f", hours/size);
            System.out.println(" hours/day)");
        }

    }
}
