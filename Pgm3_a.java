import java.awt.*;
import java.awt.event.*;
public class pgm3_a
	{
	public static void main(String args[])
		{  
    		
		Frame f= new Frame("Personal Details");  
    		final TextField nam,roll,branch,yr,avg;  
    		final Label l1,l2,l3,l4,l5;
		Button submit;
		final TextArea area; //to access inside action performed..made final

		l1=new Label("Name : ");
		l1.setBounds(20,100, 200,30);
		nam=new TextField();  
    		nam.setBounds(80,100, 200,30);  
    		
		l2=new Label("Roll : ");
		l2.setBounds(20,150, 200,30);
		roll=new TextField();  
    		roll.setBounds(80,150, 200,30);  
    		
		
		l3=new Label("Branch : ");
		l3.setBounds(20,200, 200,30);
		branch=new TextField();  
    		branch.setBounds(80,200, 200,30);  
    		
		l4=new Label("Year : ");
		l4.setBounds(20,250, 200,30);
		yr=new TextField();  
    		yr.setBounds(80,250, 200,30);  
    		
		l5=new Label("Avg Mark : ");
		l5.setBounds(20,300, 200,30);
		avg=new TextField();  
    		avg.setBounds(80,300, 200,30);  
    		
		submit=new Button("SUBMIT");
		submit.setBounds(80,350, 150,30);
		
		area=new TextArea(""); 
		area.setBounds(20,400, 300,200);
  		
		f.add(nam);f.add(roll);
		f.add(branch);f.add(yr);
		f.add(avg);f.add(l1);
		f.add(l2);f.add(l3);
		f.add(l4);f.add(l5);
		f.add(submit);f.add(area);
		
		submit.addActionListener(new ActionListener(){  
   			 public void actionPerformed(ActionEvent e){  
				           			  
    				 area.setText("Name : "+nam.getText()+"\n\nRoll : "+roll.getText()+"\n\nBranch : "+branch.getText()+"\n\nYear : "+yr.getText()+"\n\nAggrergate Mark : "+avg.getText());  
				}  
    			});  		

    		f.setSize(400,700);  
    		f.setLayout(null);  
    		f.setVisible(true);  
		}  
	}