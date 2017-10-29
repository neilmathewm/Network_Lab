import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.applet.*;

/*
<applet code='Pgm8_GrayScale.class' height=400 width=400>
</applet>
*/

public class Pgm8_GrayScale extends Applet {

   BufferedImage  image, real;
   int width;
   int height;
   
   public void init() {
   
      try {
         File input = new File("try.png");
         image = ImageIO.read(input);
	real=ImageIO.read(input);
         width = image.getWidth();
         height = image.getHeight();
         
         for(int i=0; i<height; i++){
         
            for(int j=0; j<width; j++){
            
               Color c = new Color(image.getRGB(j, i));
               int red = (int)(c.getRed() * 0.299);
               int green = (int)(c.getGreen() * 0.587);
               int blue = (int)(c.getBlue() *0.114);
               Color newColor = new Color(red+green+blue,
               
               red+green+blue,red+green+blue);
               
               image.setRGB(j,i,newColor.getRGB());
            }
         }
        
         
	//repaint();
	
      } catch (Exception e) {}
   }



public void paint(Graphics g){
	g.drawImage(real,120,100,this);
        g.drawImage(image, 140+width,100,this); 
}


   
}