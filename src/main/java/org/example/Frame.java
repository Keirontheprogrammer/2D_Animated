package org.example;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    MyPanel panel;
    Frame(){
        panel=new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
