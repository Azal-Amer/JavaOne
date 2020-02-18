package com.suarez;
import java.util.*;
// @author MeneXia (Xavi Ablaza)
public class HelpingwithTicTacToe {
    static Scanner in;
    //this line will print the board
    static String[] board;
    //this String determines who's turn it is
    static String turn;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        //the string is [9] because it is 3 by 3
        //this is declaring the string 
        board = new String[9];
        //this is declaring the turn system as X
        turn = "X";
        //null is basically holding the spot of the winner
        String winner = null;
        populateEmptyBoard();

        System.out.println("Welcome to this game of tic tac toe!");
        printBoard();
        System.out.println("The first player will be X's");
        System.out.println("Please enter the spot for your first X:");

        while (winner == null) {
            //numimput is the spot chosen
            int numInput = 0;
            //this try catch statement is catching any numbers input that are either less than 0 or greater than 9.
            try {
                if(turn == "X") {
                    numInput = in.nextInt();
                    //the ! is the inverse; so anything <0 or >=9 is not valid
                    //this is catching any numbers input that are not 1-9
                    if (!(numInput > 0 && numInput <= 9)) {
                        System.out.println("That is not one of the spots.");
                        System.out.println("Please enter a valid spot (1-9)");
                        continue;
                    }
                }
                else if(turn == "O"){
                    Random rand = new Random();
                    numInput = rand.nextInt(9)+1;
                }
            } catch (InputMismatchException e) {
                System.out.println("That is not one of the spots");
                System.out.println("please enter a valid spot 1-9:");
                continue;
            }
            //this is determining who's turn it is. This is an if else statement. Either it is the o's turn and "else" it is the X's turn.
            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;
                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                //re printing board with the printed X or O
                printBoard();
                //this is the function that checks if someone has won.
                winner = checkWinner();
            } else {
                //this is if someone enters a spot which someone else is already in
                System.out.println("Someone is already there.");
                System.out.println("Please choose another spot");
                continue;
            }
        }
        //this if else statement is if someone tied. Otherwise, it prints who won. Because either someone has to of won, or they would of had to of tied.
        if (winner.equalsIgnoreCase("tie")) {
            System.out.println("You tied!");
        } else {
            System.out.println("Congrats! " + winner + "'s won!");
        }
    }

    //checkwinner checks all the possible variations of 3 in a row to see if someone won
    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            //null is a placeholder for any value
            String line = null;
            //switch is basically an if statement
            switch (a) {
                //each case is a different variation of 3 in a row
                case 0:
                    //left to right
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    //left to right
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    //left to right
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    //left side up to down
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    //2nd row up to down
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    //3rd row up to down
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    //diagonal left to right
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    //right up to down
                    line = board[2] + board[4] + board[6];
                    break;
            }
            //if there are 3 in a row of X's; X would be returned as the winner. Likewise for O.
            //this is knowing who won if one of the conditions in the string is met.
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }
        //this for loop and if else statement determine if there has been a tie.
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8) return "tie";
        }
        //this is the part that asks either x's or O's to enter a spot. Depending on who's turn it is.
        System.out.println(turn + "'s turn; enter a spot " + turn + " in:");
        return null;
    }

    //this is printing the actual game board
    static void printBoard() {
        //this is actually printing the board and spots
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---||");
    }

    static void populateEmptyBoard() {
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
    }

}
