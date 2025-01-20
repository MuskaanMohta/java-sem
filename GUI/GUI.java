import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI implements ActionListener
{
    JLabel lbl,s1,s2;
    JTextField txt1,txt2;
    GUI()
    {
        JFrame frm = new JFrame("Admission Count");
        frm.setSize(500,300);
        frm.setLayout(new FlowLayout());
        s1 = new JLabel("CSE Count");
        txt1=new JTextField(5);
        s2=new JLabel("CSBS Count");
        txt2=new JTextField(5);
        JButton btn = new JButton("Submit");
        btn.addActionListener(this);
        lbl = new JLabel("                ");
        frm.add(s1);
        frm.add(txt1);
        frm.add(s2);
        frm.add(txt2);
        frm.add(btn);
        frm.add(lbl);
        frm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int count1=0,count2=0;
        boolean invalidFlag=false;
        try
        {
            count1=Integer.parseInt(txt1.getText());
            count2=Integer.parseInt(txt2.getText());
        }
        catch(NumberFormatException ex)
        {
            invalidFlag=true;
        }
        if(ae.getActionCommand().equals("Submit"))
        {
            if(invalidFlag)
            {
                lbl.setText("Error:Invalid Number");
            }
            else if(count1<0||count2<0)
            {
                lbl.setText("Error:Negative Number");
            }
            else{
                int total=count1+count2;
                lbl.setText("Total count of sudent is:"+total);
            }
        }
    }
    public static void main(String args[])
    {
        new GUI();
    }
}