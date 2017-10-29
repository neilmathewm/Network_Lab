    import java.awt.*;  
    import java.applet.*;  
    /*
	<applet code="Pgm2_a.class" width=800 height=800>
	</applet>
	 */  
      
    public class Pgm2_a extends Applet {  
      
      Image picture,pic2;  
      
      public void init() {  
        picture = getImage(getDocumentBase(),"car.jpg"); 
	pic2 = getImage(getDocumentBase(),"sunrise.jpg"); 
      }  
        
      public void paint(Graphics g) {  
        g.drawImage(picture, 30,30,400,250, this); 
	g.drawImage(pic2, 450,30, 300,250,this); 
      }  
          
      }  
