import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AllTheBest implements ActionListener {

    JLabel l1, l2, l3, l4, l5;
    JButton JL1, JL2, JL3, JL4, JL5;

    public AllTheBest() {
        JFrame frame = new JFrame();

        JL1 = new JButton("All The Best");
        JL2 = new JButton("All The Best");
        JL3 = new JButton("All The Best");
        JL4 = new JButton("All The Best");
        JL5 = new JButton("All The Best");

        JL1.setForeground(Color.red);
        JL2.setForeground(Color.pink);
        JL3.setForeground(Color.yellow);
        JL4.setForeground(Color.black);
        JL5.setForeground(Color.blue);

        frame.add(JL1);
        frame.add(JL2);
        frame.add(JL3);
        frame.add(JL4);
        frame.add(JL5);

        l1 = new JLabel("All The Best");
        l1.setBounds(100, 100, 100, 40);
        l1.setForeground(Color.pink);
        l1.setVisible(false);
        frame.add(l1);

        l2 = new JLabel("All The Best");
        l2.setBounds(150, 150, 100, 40);
        l2.setForeground(Color.BLUE);
        l2.setVisible(false);
        frame.add(l2);

        l3 = new JLabel("All The Best");
        l3.setBounds(200, 200, 100, 40);
        l3.setForeground(Color.RED);
        l3.setVisible(false);
        frame.add(l3);

        l4 = new JLabel("All The Best");
        l4.setBounds(250, 250, 100, 40);
        l4.setForeground(Color.BLACK);
        l4.setVisible(false);
        frame.add(l4);

        l5 = new JLabel("All The Best");
        l5.setBounds(250, 250, 100, 40);
        l5.setForeground(Color.GREEN);
        l5.setVisible(false);
        frame.add(l5);

        JL1.addActionListener(this);
        JL2.addActionListener(this);
        JL3.addActionListener(this);
        JL4.addActionListener(this);
        JL5.addActionListener(this);

       // JL1.setVisible(true);
        frame.setBackground(Color.gray);
        frame.setLayout(new FlowLayout());

        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == JL1) {
            l1.setVisible(true);
        }

        if (e.getSource() == JL2) {
            l2.setVisible(true);
        }

        if (e.getSource() == JL3) {
            l3.setVisible(true);
        }

        if (e.getSource() == JL4) {
            l4.setVisible(true);
        }

        if (e.getSource() == JL5) {
            l5.setVisible(true);
        }
    }

    public static void main(String args[]) {
        new AllTheBest();
    }
}
