import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingCalculator2 extends JFrame implements ActionListener{
    
    JButton b10 , b11 , b12 , b13 , b14 , b15;
    JButton b[] = new JButton[10];
    JTextField textField;
    int r , n1 , n2 ;
    char opr;

    SwingCalculator2()
    {
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        for(int i=0 ; i<=9 ; i++)
        {
           b[i] = new JButton(i+"");
           panel.add(b[i]);
           b[i].addActionListener(this);
        }

        b10 = new JButton("+");
        panel.add(b10);
        b10.addActionListener(this);

        b11 = new JButton("-");
        panel.add(b11);
        b11.addActionListener(this);

        b12 = new JButton("*");
        panel.add(b12);
        b12.addActionListener(this);

        b13 = new JButton("/");
        panel.add(b13);
        b13.addActionListener(this);

        b14 = new JButton("=");
        panel.add(b14);
        b14.addActionListener(this);

        b15 = new JButton("C");
        panel.add(b15);
        b15.addActionListener(this);

        textField = new JTextField(12);

        add(panel , BorderLayout.CENTER);
        add(textField , BorderLayout.NORTH);
       // add(panel);

        setVisible(true);
        setSize(600 , 600);

    }
    public void actionPerformed(ActionEvent ae)
    {
        JButton pb = (JButton)ae.getSource();

        if(pb == b15)
        {
            r = n1 = n2 = 0;
            textField.setText(" ");

        }else if(pb == b14)
            {
                n2 = Integer.parseInt(textField.getText());
                eval();
                textField.setText(r+" ");
            }
            else
            {
                boolean opf = false;

                if(pb == b10)
                {
                    opr = '+';
                    opf = true;
                }
                  if(pb == b11)
                {
                    opr = '-';
                    opf = true;
                }
                 if(pb == b12)
                {
                    opr = '*';
                    opf = true;
                } 
                if(pb == b13)
                {
                    opr = '/';
                    opf = true;
                }

                if(opf== false)
                {
                    for(int i=0 ; i<=9 ; i++)
                    {
                        if(pb==b[i])
                        {
                          
                            String t = textField.getText();
                            t = t+i;
                            textField.setText(t);

                        }
                    }

                }else
                {
                    n1 = Integer.parseInt(textField.getText());
                    textField.setText("");
                }
            }
        }


    
    int eval()
    {
        switch(opr){
            case '+' : r=n1+n2;
            break;
            case '-' : r=n1-n2;
            break;
            case '*' : r=n1*n2;
            break;
            case '/' : r=n1/n2;
            break;
        }

      

                   return 0;

    }
    public static void main(String args[])
    {
        new SwingCalculator2();
    }
}
