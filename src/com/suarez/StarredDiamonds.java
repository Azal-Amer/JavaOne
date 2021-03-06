package com.suarez;

public class StarredDiamonds {
    public static final int SIZE = 3;
    public static void main(String[] args){
        plusDash();
    }
    public static void plusDash() {
        lid();
        top();
        bot();
        lid();
        bot();
        top();
        lid();
    }


    public static void spaces(int amount){
        for(int space =SIZE; space >= amount+1; space --){
            System.out.print(" ");
            //spaces before the shape
        }
    }
    public static void betweenSpacesPre(int line){
        //calls the spaces pre with the line function, which is used in the top method
            for(int spaceBetween = 1; spaceBetween <= line-1; spaceBetween++){
                System.out.print("/");
            }
        }
    public static void betweenSpacesPost(int line){
        for(int spaceBetween = 1; spaceBetween <= line-1; spaceBetween++) System.out.print("\\");
        //same as previous comment
    }
    public static void betweenSpacesPreBot(int lines){
        for(int spaceBetween = SIZE; spaceBetween >= lines+1; spaceBetween--){
            System.out.print("\\");
            //same as previous comment
        }

    }
    public static void betweenSpacesPostBot(int lines){
        for(int spaceBetween = SIZE; spaceBetween >= lines+1; spaceBetween--){
            System.out.print("/");
            //same as previous comment
    }}
    public static void botSpaces(int lines){
        for(int space =2; space <= lines; space ++){
            System.out.print(" ");
            //spaces before the inside box
        }

    }
    public static void firstStar(){
        System.out.print("|");
        spaces(0);
        System.out.print("*");
        spaces(0);
        System.out.println("|");
        //this basically is making the top triangle thing
    }
    public static void lid(){
        System.out.print("+");

        for(int dash = 1; dash <= 2*SIZE+1;dash++){
            System.out.print("-");
            //makes the dashes that are sandwiched
        }
        System.out.println("+");
    }
    public static void bot(){
        for(int line =1; line <=SIZE;line++){
            System.out.print("|");
            botSpaces(line);
            System.out.print("\\");
            betweenSpacesPreBot(line);
            System.out.print("*");
            betweenSpacesPostBot(line);
            System.out.print("/");
            botSpaces(line);
            System.out.println("|");
        }
        firstStar();
        //prints the bottom star shape by inheriting the previous space and line functions
    }
    public static void top(){
        firstStar();
        for(int line =1; line <=SIZE;line++){
            System.out.print("|");
            spaces(line);
            System.out.print("/");
            betweenSpacesPre(line);
            System.out.print("*");
            betweenSpacesPost(line);
            System.out.print("\\");
            spaces(line);
            System.out.println("|");
        }
    }
    //same as the bot comment

    }



//}

