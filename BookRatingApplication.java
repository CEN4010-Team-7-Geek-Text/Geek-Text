package com.example.demo;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


@SpringBootApplication
/**
 *
 * @Kenny Pierre
 * BookRating System to be implemented for Project
 */
public class BookRatingApplication 
{

private ArrayList<String> results = new ArrayList<>();

private final JLabel inputLabel1;

public static void main(String[] args) {

    BookRating bookRating = new BookRating();
}

public BookRatingApplication() 
{
    JFrame f2 = new JFrame("Rating");
    inputLabel1 = new JLabel("Rate: ");

    Icon icon1 = new ImageIcon("star-icon.png");
    Icon icon2 = new ImageIcon("star-3-icon.png");

    JButton button1 = new JButton(icon1);
    button1.setPreferredSize(new Dimension(35, 35));
    button1.setBorder(BorderFactory.createEmptyBorder());
    button1.setContentAreaFilled(false);
    button1.setDisabledIcon(icon1);
    button1.setPressedIcon(icon2);
    button1.setSelectedIcon(icon2);
    button1.setRolloverEnabled(true);
    button1.setRolloverIcon(icon2);
    button1.setRolloverSelectedIcon(icon2);

    JButton button2 = new JButton(icon1);
    button2.setPreferredSize(new Dimension(35, 35));
    button2.setBorder(BorderFactory.createEmptyBorder());
    button2.setContentAreaFilled(false);
    button2.setDisabledIcon(icon1);
    button2.setPressedIcon(icon2);
    button2.setSelectedIcon(icon2);
    button2.setRolloverEnabled(true);
    button2.setRolloverIcon(icon2);
    button2.setRolloverSelectedIcon(icon2);

    JButton button3 = new JButton(icon1);
    button3.setBorder(BorderFactory.createEmptyBorder());
    button3.setContentAreaFilled(false);
    button3.setDisabledIcon(icon1);
    button3.setPressedIcon(icon2);
    button3.setSelectedIcon(icon2);
    button3.setPreferredSize(new Dimension(35, 35));
    button3.setRolloverEnabled(true);
    button3.setRolloverIcon(icon2);
    button3.setRolloverSelectedIcon(icon2);

    JButton button4 = new JButton(icon1);
    button4.setPreferredSize(new Dimension(35, 35));
    button4.setBorder(BorderFactory.createEmptyBorder());
    button4.setContentAreaFilled(false);
    button4.setDisabledIcon(icon1);
    button4.setPressedIcon(icon2);
    button4.setSelectedIcon(icon2);
    button4.setRolloverEnabled(true);
    button4.setRolloverIcon(icon2);
    button4.setRolloverSelectedIcon(icon2);

    JButton button5 = new JButton(icon1);
    button5.setPreferredSize(new Dimension(35, 35));
    button5.setBorder(BorderFactory.createEmptyBorder());
    button5.setContentAreaFilled(false);
    button5.setDisabledIcon(icon1);
    button5.setPressedIcon(icon2);
    button5.setSelectedIcon(icon2);
    button5.setRolloverEnabled(true);
    button5.setRolloverIcon(icon2);
    button5.setRolloverSelectedIcon(icon2);

    JButton button6 = new JButton("Subscribe");
    button6.setPreferredSize(new Dimension(95, 35));

    final JTextArea display = new JTextArea(5, 25);

    JButton button7 = new JButton("Clear");
    button7.setPreferredSize(new Dimension(95, 35));

    JPanel panel2 = new JPanel();
    f2.add(panel2);
    f2.setVisible(true);
    f2.setSize(500, 550);
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel2.add(inputLabel1);
    panel2.add(button1);
    panel2.add(button2);
    panel2.add(button3);
    panel2.add(button4);
    panel2.add(button5);
    panel2.add(button6);
    panel2.add(button7);
    panel2.add(display);

    button1.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            String b1 = "1";
            results.add(b1);
            StringBuilder sb = new StringBuilder();
            for (String string : results) {

                sb.append(string);
                sb.append("\n");
            }

        }

      
    }
    );
    button2.addActionListener((ActionEvent e) -> {
        String b2 = "2";
        results.add(b2);
        StringBuilder sb = new StringBuilder();
        for (String string : results) {
            
            sb.append(string);
            sb.append("\n");
        }
    });
    button3.addActionListener(new ActionListener() 
    {

        public void actionPerformed(ActionEvent e) 
        {
            String b3 = "3";
            results.add(b3);
            StringBuilder sb = new StringBuilder();
            for (String string : results) {

                sb.append(string);
                sb.append("\n");
            }

        }
    });
    button4.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            String b4 = "4";
            results.add(b4);
            StringBuilder sb = new StringBuilder();
            for (String string : results) {

                sb.append(string);
                sb.append("\n");
            }

        }
    });
    button5.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            String b5 = "5";
            results.add(b5);
            StringBuilder sb = new StringBuilder();
            for (String string : results) {

                sb.append(string);
                sb.append("\n");
            }

        }
    });

    button6.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            String s = display.getText().toString();
            results.add(s);
            StringBuilder sb = new StringBuilder();
            for (String string : results) {

                sb.append(string);
                sb.append("\n");
            }
            display.setText(sb.toString());
            results.clear();

        }
    });

    button7.addActionListener(new ActionListener() 
    {

        public void actionPerformed(ActionEvent e) 
        {

            results.clear();
            StringBuilder sb = new StringBuilder();
            for (String string : results) {
                sb.append(string);
            }

            display.setText(null);

        }
    }
    );
}
}
