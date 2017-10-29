import java.awt.*;
import java.awt.event.*;
public class Pgm3_b
	{
		//static ArrayList str = new ArrayList();
		
		static int n=0,p=0;
		static String[] s = new String[20];
		static String[] t = new String[20];
		static String m=new String();
	public static void main(String args[])
		{  
    		
		Frame f= new Frame("Personal Details");  
    		final TextField nam,pnr,sno,sourc,dest,tod,arriv;  
    		final Label l1,l2,l3,l4,l5,l6,l7;
    		
		Button submit,a,b;
		final TextArea area; //to access inside action performed..made final

		l1=new Label("Name : ");
		l1.setBounds(20,50, 200,30);
		nam=new TextField();  
    	nam.setBounds(110,50, 200,30);  
    		
		l2=new Label("PNR : ");
		l2.setBounds(20,100, 200,30);
		pnr=new TextField();  
    	pnr.setBounds(110,100, 200,30);  
    		
		
		l3=new Label("Seat No : ");
		l3.setBounds(20,150, 200,30);
		sno=new TextField();  
    	sno.setBounds(110,150, 200,30);  
    		
		l4=new Label("Source : ");
		l4.setBounds(20,200, 200,30);
		sourc=new TextField();  
    	sourc.setBounds(110,200, 200,30);  
    		
		l5=new Label("Dest : ");
		l5.setBounds(20,250, 200,30);
		dest=new TextField();  
    	dest.setBounds(110,250, 200,30);  
    	

		l6=new Label("Time of Depart : ");
		l6.setBounds(20,300, 200,30);
		tod=new TextField();  
    	tod.setBounds(110,300, 200,30);	
		

		l7=new Label("Time of Arrival : ");
		l7.setBounds(20,350, 200,30);
		arriv=new TextField();  
    	arriv.setBounds(110,350, 200,30);

		submit=new Button("SUBMIT");
		submit.setBounds(80,400, 150,30);
		
		a=new Button("Flight A (COK-BLR)");
		a.setBounds(20,450, 120,30);
		b=new Button("Flight B (BLR-COK)");
		b.setBounds(150,450, 120,30);
		
		area=new TextArea(""); 
		area.setBounds(20,500, 350,200);
  		
		f.add(nam);f.add(pnr);
		f.add(sno);f.add(sourc);
		f.add(dest);f.add(tod);
		f.add(arriv);f.add(l1);
		f.add(l2);f.add(l3);
		f.add(l4);f.add(l5);
		f.add(l6);f.add(l7);
		f.add(submit);f.add(area);
		f.add(a);f.add(b);
		
		submit.addActionListener(new ActionListener(){  

   			 public void actionPerformed(ActionEvent e){  
				     if(sourc.getText().equals("COK") && dest.getText().equals("BLR"))
				    	 s[n++]=nam.getText();
				    else if(sourc.getText().equals("BLR") && dest.getText().equals("COK"))
				    	 t[p++]=nam.getText();
				    nam.setText("");sourc.setText("");arriv.setText("");
				    pnr.setText("");dest.setText("");area.setText("");
				    sno.setText("");tod.setText("");
				   }  
    			});  		
		a.addActionListener(new ActionListener(){  

   			 public void actionPerformed(ActionEvent e){  
				   m="";
				     for(int i=0;i<n;i++)
				     	{
				     		m+="\n"+s[i];
				     	}
				     area.setText("Names of Passenger :-\n\n"+m);
				   }  
    			});  		
		b.addActionListener(new ActionListener(){  

   			 public void actionPerformed(ActionEvent e){  
				     m="";
				     for(int i=0;i<p;i++)
				     	{
				     		m+="\n"+t[i];
				     	}
				     area.setText("Names of Passenger :-\n\n"+m);
				   }  
    			});  		

    		f.setSize(400,800);  
    		f.setLayout(null);  
    		f.setVisible(true);  
		}  
	}