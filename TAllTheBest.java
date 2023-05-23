import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class TAllTheBest{

    public static void main(String[] args) {
        Color darkpink = new Color(255, 75, 255);
        Color skyblue = new Color(75, 255, 255);

        JFrame f = new JFrame();
        f.setLayout(null);
        f.setSize(700, 400);
        f.getContentPane().setBackground(Color.GRAY);
        JButton f1 = new JButton("All The Best");
        f1.setBounds(15, 10, 150, 20);
        f1.setForeground(Color.RED);
        f.add(f1);
        JButton f2 = new JButton("All The Best");
        f2.setBounds(180, 10, 150, 20);
        f2.setForeground(darkpink);
        f.add(f2);

        JButton f3 = new JButton("All The Best");
        f3.setBounds(345, 10, 150, 20);
        f3.setForeground(Color.BLUE);
        f.add(f3);

        JButton f4 = new JButton("All The Best");
        f4.setBounds(510, 10, 150, 20);
        f4.setForeground(Color.GREEN);
        f.add(f4);

        JButton f5 = new JButton("All The Best");
        f5.setBounds(275, 40, 150, 20);
        f5.setForeground(skyblue);
        f.add(f5);

        JLabel l1 = new JLabel("All The Best");
        l1.setBounds(115, 70, 100, 40);
        l1.setForeground(darkpink); 
        l1.setVisible(false);
        f.add(l1);

        JLabel l2 = new JLabel("All The Best");
        l2.setBounds(175, 120, 100, 40);
        l2.setForeground(skyblue);
        l2.setVisible(false);
        f.add(l2);

        JLabel l3 = new JLabel("All The Best");
        l3.setBounds(235, 180, 100, 40);
        l3.setForeground(Color.RED); 
        l3.setVisible(false);
        f.add(l3);

        JLabel l4 = new JLabel("All The Best");
        l4.setBounds(295, 240, 100, 40);
        l4.setForeground(Color.BLACK); 
        l4.setVisible(false);
        f.add(l4);

        f1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
                l3.setVisible(true);
           } 
        });
        f2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 l1.setVisible(true);
            } 
         });
         f3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //  l1.setVisible(true);
            } 
         });
         f4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 l4.setVisible(true);
            } 
         });
         f5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 l2.setVisible(true);
            } 
         });
        f.setVisible(true);

    }
}