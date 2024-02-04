package com.main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("podda.jpg");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel();
        label.setText("Hello Ishan");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setIconTextGap(-25);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(border);
        label.setFont(new Font("Arial",Font.PLAIN,24));
        label.setForeground(new Color(86, 178, 218));
        //label.setBounds(0,0,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(420,420);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}