import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        label1.setText("Hello Red");
        label1.setBounds(0,0,70,10);
        label2.setText("Hello Green");
        label3.setText("Hello Blue");

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,300,300);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(300,0,400,300);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,300,700,400);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(700,700);
        frame.setVisible(true);

        redPanel.add(label1);
        greenPanel.add(label2);
        bluePanel.add(label3);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}