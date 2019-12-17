package com.suarez;

public class FunkySlashyRectangleWithStars {
    public static void main(String[] args) {
        for (int line = 1; line <= SIZE+1; line++) {
            stars(line);
            spaces(line);
            frontSlash(line);
            spaces(line);
            stars(line);
            System.out.println();

        }
    }
/*    for line
        stars();
            We need to repeat the number of stars an X number of times, while the amount of slashes appears 2x times
            The total # of charecters p/ line is 26
            Each time the line cycles, we set # of stars = SIZE, then have it so that while >= 0, stars --
        Spaces();
            Spaces = line #
        for(/)
            line*2-backSub
                Back sub is defined as 2*(line-1)
        for(\\)
            i =1; 1<= 2*(line-1); i++

        space()
        star
}
 */
    public static final int SIZE = 6;

    public static void stars(int line) {
        for (int stars = SIZE; stars >= line; stars--) {
            System.out.print("*");
        }
    }
    public static void spaces(int line){
        for(int spaces = 1; spaces<=line; spaces++){
            System.out.print(" ");
        }

    }
    public static void frontSlash(int line){
        for(int i = SIZE * 2 - line + 1; i >= line; i--){
            System.out.print("/");
        }
        for(int i = 0; i <= 2*(line)-3; i ++){
            System.out.print("\\");
        }
    }

}
