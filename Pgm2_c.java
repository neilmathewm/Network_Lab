import java.applet.*;
import java.awt.*;

/*
<applet code="pgm2_c" width=600 height=600>
</applet>
*/
public class pgm2_c extends Applet implements Runnable
{
	Thread t;
	int i=0;
	public void init()
		{
			t=new Thread(this,"clock");
			t.start();
		}
	public void run() 
		{
		try {
			while(true) 
				{
				i++;
				repaint();
				Thread.sleep(1000);
				}
			}catch (InterruptedException e) {
						}
		}
	public void paint(Graphics g)
		{
			Dimension d = getSize();
            int x = d.width/2;
            int y = d.height/2;
            int radius = 150;
            g.setColor(Color.cyan);
            g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
			//g.drawOval(150,150,250,250);
			
			g.setFont(new Font("TimesRoman", Font.PLAIN, 40));
			g.setColor(Color.black);
			g.fillOval(x-5, y-5, 10, 10);
			g.drawString("6",x-10,y+radius-5);
			g.drawString("12",x-20,y-radius+30);
			g.drawString("3",x+radius-30,y);
			g.drawString("9",x-radius+5,y);

			g.drawLine(x,y,x,y-95);
			g.drawLine(x,y,x,y+70);	
			g.drawString(""+i,10,d.height-50);			
		}
}