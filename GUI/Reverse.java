import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;
import java.util.*;
public class Reverse implements ActionListener
{
    JLabel s1,lbl,lbl1;
    JTextField txt;
    Reverse()
    {
        JFrame frm = new JFrame();
        frm.setLayout(new FlowLayout());
        frm.setSize(200,300);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s1 = new JLabel("Enter a number");
        txt = new JTextField(5);
        JButton btn = new JButton("Submit");
        btn.addActionListener(this);
        lbl=new JLabel("          ");
        lbl1=new JLabel("          ");
        frm.add(s1);
        frm.add(txt);
        frm.add(btn);
        frm.add(lbl);
        frm.add(lbl1);
        frm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int num1=0;
        boolean invalidFlag = false;
        try{
            num1=Integer.parseInt(txt.getText());

        }
        catch(NumberFormatException ex)
        {
            invalidFlag=true;
        }
        if(ae.getActionCommand().equals("Submit")){
            if(invalidFlag)
            {
                lbl.setText("Erro:Invalid no");
            }
            else if(num1<0)
            {
                lbl.setText("Error:NEgative no");
            }
            else{
                Date d = new Date();
                int d1,rev=0;
                while(num1!=0)
                {
                    d1=num1%10;
                    rev=rev*10+d1;
                    num1=num1/10;
                }
                lbl.setText("Date is"+d);
                lbl1.setText("Reverse="+rev);
            }
        }
        
    }
    public static void main(String args[])
    {
        new Reverse();
    }
}