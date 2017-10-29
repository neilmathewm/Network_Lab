import java.io.*;
import java.net.*;
import java.util.Date;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Pgm7_MultiClient{
 public static void main(String args[]) 
 { Date d=new Date();
  System.out.println(new com.sun.security.auth.module.NTSystem().getName());
   try{System.out.println(InetAddress.getLocalHost());
   }catch(Exception e){System.out.println(e);}
   System.out.println(d.toString());
   MulticastSocket msocket= null;
   DatagramPacket dpacket= null;
   byte[] data=new byte[256];
   try{
       msocket= new MulticastSocket(8888);
       InetAddress address = InetAddress.getByName("224.2.2.3");
       msocket.joinGroup(address);
       while(true)
       {dpacket=new DatagramPacket(data,data.length);
          msocket.receive(dpacket);
          String msg=new String(data,0,dpacket.getLength());
          System.out.println("From " + dpacket.getAddress() + " Msg : " + msg);
}
} catch (IOException ioe) {
System.out.println(ioe);
}
}
}
         