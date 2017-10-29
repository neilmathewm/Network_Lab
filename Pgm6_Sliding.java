
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import java.net.InetAddress;
public class Pgm6_Sliding extends JFrame implements ActionListener
{
 JTextField t1,t2,t3,t4,t5,t6;
 JButton b1,b2;

 public Sliding()
 {
  try{
  Date date = new Date();
  InetAddress s = InetAddress.getLocalHost();
  setLayout(null);
  setTitle("Sliding Window");
  setSize(500,500);
  JLabel h1=new JLabel(new com.sun.security.auth.module.NTSystem().getName());
   h1.setBounds(10,30,200,20);
   JLabel h2=new JLabel(s.toString());
    h2.setBounds(10,10,200,20);
   JLabel h3=new JLabel(date.toString());
    h3.setBounds(10,50,200,20);
  JLabel l1=new JLabel("Message");
  l1.setBounds(100,100,100,40);

  JLabel l2=new JLabel("Message ");
  l2.setBounds(500,100,100,40);

  t1=new JTextField(20);
  t1.setBounds(100,150,200,20);

  t2=new JTextField(20);
  t2.setBounds(500,150,200,20);

  b1=new JButton("SEND");
  b1.setBounds(100,200,100,40);

  b2=new JButton("RECEIVE");
  b2.setBounds(500,200,100,40);

  t3=new JTextField(20);
  t3.setBounds(300,300,50,20);

  t4=new JTextField(20);
  t4.setBounds(350,300,50,20);

  t5=new JTextField(20);
  t5.setBounds(400,300,50,20);

  t6=new JTextField(20);
  add(h1);
  add(h2);
  add(h3);
  add(l1);
  add(l2);
  add(t1);
  add(t2);
  add(b1);
  add(b2);
  add(t3);
  add(t4);
  add(t5);


  b1.addActionListener(this);
  b2.addActionListener(this);

 }
catch(Exception e){}
}

 public static void main(String arg[])
 {
  Sliding sw=new Sliding();
  sw.setVisible(true);


 }

 public void actionPerformed(ActionEvent e)
 {
  String s1=null,s2=null,s3=null,s4=null,a=null,b=null,s=null;
  int l;


  if(e.getSource()==b1)
  {
   s1=t6.getText();

   s=t1.getText();
   l=s.length();
   s2=s.substring(0,1);
   if(s1.equals(t5.getText()))
   {
    s3=s.substring(1,l);
    t1.setText(s3);
    t5.setText(s2);
   }
   else if(s1.equals(t4.getText()))
   {
    s3=s.substring(1,l);
    t1.setText(s3);
    t4.setText(s2);
   }
   else if(s1.equals(t3.getText()))
   {
    s3=s.substring(1,l);
    t1.setText(s3);
    t3.setText(s2);
   }

  }

  else if(e.getSource()==b2)
  {
   b=t5.getText();
   a=t2.getText();

   t2.setText(a+b);
   t5.setText(t4.getText());
   t4.setText(t3.getText());
   t3.setText(null);
  }
 }
}