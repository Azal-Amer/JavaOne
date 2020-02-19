package com.suarez;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class FinalGUI {
    private JPanel panel1;
    private JButton button1;
    JTextField textField1;
     JTextField textField2;
     JTextField textField3;
    private JTextField textField5;
    private JPasswordField passwordField1;

    public FinalGUI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    FinalProjectClassClientGUITest.main(textField1, textField2, textField3,passwordField1,textField5);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null,
                "Welcome to Encryptotron 9000!\nHere are the instructions\n1. All terms are case sensitive!\n" +
                "2. Remember the key number you use to encrypt your password, or you will loose access!\n" +
                "3. When accessing a previous password, to decrypt them just input the same key you used to encrypt them\n" +
                "3a. Make sure that when you are placing your password directory, that it ends with a \" \\ \" !\n" +
                "4. Do not put spaces in your username and password or they will be replaced !\n" +
                        "5. Do not input non--numerical charecters when prompted to input the shift!!\n" +
                        "Have fun!");
        JFrame frame = new JFrame("App");
        frame.setContentPane(new FinalGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
