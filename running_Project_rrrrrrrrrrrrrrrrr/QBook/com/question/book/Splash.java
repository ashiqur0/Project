package com.question.book;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame{

    JLabel title;

    Splash(){

        title = new JLabel("All notes");
        title.setBounds(400,20,100,30);
        title.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(title);
        
        setSize(900, 600);
        setBounds(100, 50, 900, 600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Splash();
    }
}