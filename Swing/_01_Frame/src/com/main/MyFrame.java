package com.main;

import javax.swing.*;
import java.awt.*;

public class MyFrame {
    MyFrame(){
        JFrame frame = new JFrame(); // create new frame
        frame.setTitle("Hello World");
        frame.setSize(420,420); // set size
        frame.setResizable(false); // Can't resize
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit
        frame.setVisible(true); // set size

        ImageIcon imageIcon = new ImageIcon("logo.jpeg");//Create a logo
        frame.setIconImage(imageIcon.getImage());

        frame.getContentPane().setBackground(new Color(86, 178, 218 ));//Set background color
    }
}
