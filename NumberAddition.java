import javax.swing.*;
import java.awt.*;
import java.awt.Button;
import java.awt.event.*;

public class NumberAddition{

    public static void main(String args[])
    {
        Hello obj = new Hello();

    }
}

class Hello implements ActionListener{

    JLabel l1 , l2 , l3;
    JTextField t1 , t2 , t3;
    JButton b1 , b2 , b3;

    public Hello()
    {
        JFrame f1 = new JFrame("Number Addtion");

        l1 = new JLabel("First Number");
        t1 = new JTextField(20);

        l2 = new JLabel("Second Number");
        t2 = new JTextField(20);

        l3 = new JLabel("Result Number");
        t3 = new JTextField(20);

        b1 = new JButton("Add");
        b2 = new JButton("Clear");
        b3 = new JButton("Exit");

        f1.add(l1);
        f1.add(l2);
        f1.add(l3);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);

        f1.add(t1);
        f1.add(t2);
        f1.add(t3);

        l1.setBounds(100, 50, 180, 50);
        t1.setBounds(250, 50, 180, 50);

        l2.setBounds(100, 150, 180, 50);
        t2.setBounds(250, 150, 180, 50);

        l3.setBounds(100, 250, 180, 50);
        t3.setBounds(250, 250, 180, 50);

        b1.setBounds(100, 350, 180, 50);
        b2.setBounds(300, 350, 180, 50);
        b3.setBounds(450, 450, 180, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        f1.setLayout(null);

        f1.setSize(600 , 600);
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            int val1 = Integer.parseInt(t1.getText());
            int val2 = Integer.parseInt(t2.getText());
            int value = val1 + val2;

            t3.setText(" " + value);
        }

        if(ae.getSource() == b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");

        }

        if(ae.getSource() == b3)
        {
            System.exit(0);
        }
    }
}