import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 
/* 
<applet code="Pgm2_b" width=300 height=300>
</applet>
*/

public class Pgm2_b extends Applet implements ActionListener
{
TextField txt1;
Button add,sub,mul,div,equal;
Button no[]=new Button[10];
int a,b,result;
char OP;
public void init()
	{
	txt1=new TextField(10);
	add=new Button("+");
	sub=new Button("-");
	mul=new Button("*");
	div=new Button("/");
	equal=new Button("=");
	for(int i=0;i<10;i++)
		{
			no[i]=new Button(""+i);
		}
	add(txt1);
	for(int i=0;i<10;i++)
		{
			add(no[i]);
		}
	add(add);
	add(sub);
	add(mul);
	add(div);
	add(equal);
	
	for(int i=0;i<10;i++)
		{
			no[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		txt1.addActionListener(this);
	}

public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		char ch=str.charAt(0);
		if ( Character.isDigit(ch))
			txt1.setText(txt1.getText()+str);
		else
		if(str.equals("+"))
		{
			a=Integer.parseInt(txt1.getText());
			OP='+';
			txt1.setText("");
		}
		else if(str.equals("-"))
		{
			a=Integer.parseInt(txt1.getText());
			OP='-';
			txt1.setText("");
		}
		else if(str.equals("*"))
		{
			a=Integer.parseInt(txt1.getText());
			OP='*';
			txt1.setText("");
		}
		else if(str.equals("/"))
		{
			a=Integer.parseInt(txt1.getText());
			OP='/';
			txt1.setText("");
		}
		
		if(str.equals("="))
		{
			b=Integer.parseInt(txt1.getText());
			if(OP=='+')
				result=a+b;
			else if(OP=='-')
				result=a-b;
			else if(OP=='*')
				result=a*b;
			else if(OP=='/')
				result=a/b;
			txt1.setText(""+result);
		}	
		
	}
}