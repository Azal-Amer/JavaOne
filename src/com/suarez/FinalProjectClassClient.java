package com.suarez;
import java.util.*;
import java.io.*;
public class FinalProjectClassClient {
    public static void makefile(String path, String username) {
        try {
            File file = new File(path + username + ".txt");
            /*If file gets created then the createNewFile()
             * method would return true or if the file is
             * already present it would return false
             */
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("File has been created successfully");
            } else {
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
    public static void usernameSearcherPass(String path, String username) throws IOException{
        String password = "";
        final Scanner scanner = new Scanner(new File(path));
        boolean detect = false;
        while (scanner.hasNextLine()) {
            //the while loop is because each login is stored on a new line for simplicity sake
            String lineFromFile = scanner.nextLine();
            Scanner passw = new Scanner((lineFromFile));
            //The scanner name was redundant, but it was based on the password, and I was lazy, hence passw
            if (lineFromFile.contains(username)) {
                //This is figuring out if the consumed line has the account the user has provided (the username of the account in this case), if so, then it will consume the username,
                //and then take the next term as the password
                String user = passw.next();
                password= passw.next();
                String encrypt = EncryptorClientClass.main(password);
                System.out.print(encrypt);
                //The reason this became a "main" class was because it allowed for easy implementation with my initial final project,
                //without much friction
                detect = true;
                //this is making sure the program knows not to write another password to this line, it "Detects" the password
                break;
            }
        }
        if (detect == false) {
            //the username isn't detected
            System.out.print("A new account has been made, what is the password?");
            Scanner console1 = new Scanner(System.in);
            password = console1.nextLine();

            FileWriter userData = new FileWriter(path, true);
            String encrypt = EncryptorClientClass.main(password);
            //The above code is the one that encrypts the users password
            System.out.println(encrypt);
            userData.write("\n" + username + "  " + encrypt);
            //the above code saves the username and password,
            userData.close();
            System.out.println("Username and password stored and encrypted");
            System.out.print(password);
        }
    }
    public static void main(String args[]) throws IOException {
        System.out.println("Welcome to Encryptotron 9000!");
        System.out.println("Here are the instructions");
        System.out.println("1. All terms are case sensitive!");
        System.out.println("2. Remember the key number you use to encrypt your password, or you will loose access!");
        System.out.println("3. When accessing a previous password, to decrypt them, multiply your original key by -1 (Ex: Original Key of 4, user inputs -4 to decrypt");
        System.out.println("3a. Make sure that when you are placing your password directory, that it ends with a \" \\ \" !");
        System.out.println("The file will be saved as a jpeg, as to increase the difficulty to open it by any prying eyes");

        Scanner console = new Scanner(System.in);
        System.out.println("Where will your encrypted passwords be stored?");

        String path = console.nextLine();
        //String path = "C:\\Users\\amer_\\IdeaProjects\\The Suffering of Suares (Her name not mine)\\src\\com\\suarez\\";
        boolean accountDetect = false;
        System.out.print("What is your name??");
        String user = console.nextLine();
        System.out.print("What is the name of the account associated with the password?");
        String account = console.nextLine();
        makefile(path,user);
        //boolean detect = usernameSearcher(path+user+".txt", user);
        System.out.println("checking for password");
        //usernameSearcherPass(path+user+".txt", account);
        usernameSearcherPass(path+user+".txt", account);

    }
}
