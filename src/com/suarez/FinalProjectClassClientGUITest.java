package com.suarez;
import javax.swing.*;
import java.util.*;
import java.io.*;
public class FinalProjectClassClientGUITest {
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
    public static boolean usernameSearcherPass(String path, String username,  String password, String shift) throws IOException{
        final Scanner scanner = new Scanner(new File(path));
        boolean detect = false;
        while (scanner.hasNextLine()) {
            String lineFromFile = scanner.nextLine();
            Scanner passw = new Scanner((lineFromFile));
            if (lineFromFile.contains(username)) {
                detect = true;
                String user = passw.next();
                password= passw.next();
                String encrypt = EncryptorClientClassGUI.main(password, shift,detect);
                JOptionPane.showMessageDialog(null,encrypt);
                break;
            }
        }
        if (detect == false) {
            FileWriter userData = new FileWriter(path, true);
            String encrypt = EncryptorClientClassGUI.main(password, shift, detect);
            System.out.println(encrypt);
            userData.write("\n " + username + " " + encrypt );
            userData.close();
            JOptionPane.showMessageDialog (null, "Stored and Encrypted. Password : " + encrypt);
        }
        return detect;
    }
    public static boolean main(JTextField pathy, JTextField namey, JTextField usernamey, JTextField passwordy, JTextField encrypty ) throws IOException {
        String path = pathy.getText();
        String user = namey.getText();
        String account = usernamey.getText();
        String password = passwordy.getText();
        String encrypt = encrypty.getText();
        boolean accountDetect = false;
        makefile(path,user);
        boolean detect = usernameSearcherPass(path+user+".txt", account, password,encrypt);
        return detect;

    }
}




