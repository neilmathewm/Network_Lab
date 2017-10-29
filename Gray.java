/*<applet code=Gray.java width=500 height=500>
</applet>
*/
import java.util.*;
import java.applet.*; 
import java.awt.*; 
import java.awt.event.*;
             
public class Gray extends Applet implements ActionListener
{
     
   Button G=new Button("GRAY");
   Button R=new Button("RESET");
   Image img;
   Image fimg;
   public void init()
   {
      setLayout(new FlowLayout()); 
      add(G);
      add(R);
      G.addActionListener(this);
      R.addActionListener(this);
      img = getImage(getCodeBase(), "img.jpg");
      fimg=img;
   }
   public void paint(Graphics g) 
   {   
      g.drawImage(fimg, 0, 0, this);
   }
   
        
   
    public void actionPerformed(ActionEvent ae) 
    {
      String a="";
      try
      {
       a=(String)ae.getActionCommand();
       if (a.equals("RESET")) 
       {
        fimg=img; 
       }

       else  
       {
       GrayScale g=new GrayScale();
       Image i=g.filter(Gray.this,img);
       fimg=i;
       }
        repaint();
     }
     catch(Exception e)
     {
      fimg=img;
      repaint();
     }
   }

}
