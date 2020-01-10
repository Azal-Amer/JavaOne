package com.suarez;

public class StringMethodStuff {
    public static void main(String[] args){
        String s1 = "Willy dooo";
        String s2 = "Marty Mcfly";
        System.out.println(s1.length());
        System.out.println(s1.indexOf("y"));
        System.out.println(s1.substring(5,8));
        String s3 = s2.substring(1, 7);
        System.out.println(s3.toLowerCase());
    }
}
