import java.io.*;
import java.net.*;
import java.util.Date;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Pgm7_MultiServer{
 public static void main(String args[]) 
 { Date d=new Date();
  System.out.println(new com.sun.security.auth.module.NTSystem().getName());
   try{System.out.println(InetAddress.getLocalHost());
   }catch(Exception e){System.out.println(e);}
   System.out.println(d.toString());
   DatagramSocket dsocket= null;
   DatagramPacket dpacket= null;
   byte[] data;
   final int port= 8888;
   try{
        dsocket= new DatagramSocket();
        String msg;
      while(true)
       {
          BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the message :");
          msg= br.readLine();
          data= msg.getBytes();
          InetAddress addr= InetAddress.getByName("224.2.2.3");
          dpacket= new DatagramPacket(data, data.length, addr, port);
          dsocket.send(dpacket);
          System.out.println("Server Sends :" + msg);
          try{
                Thread.sleep(500);
             }catch(InterruptedException ie){System.out.println(ie);}
        }
   }catch(Exception e)
   {System.out.println(e);}
}}
     

