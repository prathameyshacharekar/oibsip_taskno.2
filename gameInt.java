import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class gameInt extends JFrame implements ActionListener{

    JPanel p1;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    Integer randNum,guessNum;
    String ipText;
 
    gameInt() {

        super("Gamers...");
        this.setBounds(300,100,900,550);

        Random rand = new Random();

            randNum = rand.nextInt(100)+1;
            System.out.println(randNum);

        p1 = new JPanel();

            p1.setBackground(Color.cyan);
            p1.setBounds(0,0,550,400);
            p1.setLayout(null);        
        add(p1);  
        
        
        l1 = new JLabel("ENTER A NUMBER BETWEEN 1 & 100  ...");

            l1.setBounds(220,120,500,30);
            l1.setFont(new Font("SAN SERIF",Font.PLAIN,24));
        p1.add(l1);    

        t1 = new JTextField();

            t1.setBounds(320,250,200,20);
			t1.setBorder(BorderFactory.createEmptyBorder());
            t1.addActionListener(this);
        p1.add(t1);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        
        new gameInt();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==t1) {

            ipText = t1.getText();
            guessNum = Integer.valueOf(ipText);
    
            if(randNum == guessNum) {
    
                JOptionPane.showMessageDialog(null,"Number is Correct","Result",JOptionPane.INFORMATION_MESSAGE);
                t1.setText("");
                System.out.println("Equal ...");    
            }
    
            else if(randNum >= guessNum) {

                JOptionPane.showMessageDialog(null,"Entered Number is smaller !","Result",JOptionPane.INFORMATION_MESSAGE);
                t1.setText("");
                System.out.println("Not Equal ..");
            }
            else {

                JOptionPane.showMessageDialog(null,"Entered Number is Bigger !","Result",JOptionPane.INFORMATION_MESSAGE);
                t1.setText("");
                System.out.println("Not Equal ..");
            }
        }
    }   
}