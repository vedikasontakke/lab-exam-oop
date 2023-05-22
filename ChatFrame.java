import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.*;
import java.awt.*;

public class ChatFrame implements ActionListener{

    static JTextArea ta;
    static JTextField t;
    static JButton sendButton , resetButton;

    public static void main(String args[])
    {
        JFrame f = new JFrame("ChatFrame");
        JPanel p = new JPanel();

        t = new JTextField(10);
        JLabel l1 = new JLabel("enter text : ");
        
        sendButton = new JButton("Send");
        resetButton = new JButton("Reset");

        p.add(l1);
        p.add(sendButton);
        p.add(resetButton);
        p.add(t);


        JMenuBar menubar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Help");

        JMenuItem menuItem1 = new JMenuItem("open");
        JMenuItem menuItem2 = new JMenuItem("saveas");

        menu1.add(menuItem1);
        menu1.add(menuItem2);

        menubar.add(menu1);
        menubar.add(menu2);

        ta = new JTextArea();

        f.add(BorderLayout.NORTH , menubar);
        f.add(BorderLayout.CENTER , ta);
        f.add(BorderLayout.SOUTH , p);

        sendButton.addActionListener(new ChatFrame());
        resetButton.addActionListener(new ChatFrame());

      //  f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == sendButton)
        {
            String text = t.getText();

            ta.append(text);
        }

        if(ae.getSource() == resetButton)
        {
            t.setText(" ");
            ta.setText("");
        }
    }
}