import java.io.*;
import java.net.*;
import java.util.*;
public class Pgm7b_MulticastSender {
  public static void main(String[] args) {
    DatagramSocket socket = null;
    DatagramPacket outPacket = null;
    byte[] outBuf;
    final int PORT = 8888;
 
    try {
      socket = new DatagramSocket();
      
      String msg;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        msg = br.readLine();
        
        outBuf = msg.getBytes();
 
        //Send to multicast IP address and port
        InetAddress address = InetAddress.getByName("224.2.2.3");
        outPacket = new DatagramPacket(outBuf, outBuf.length, address, PORT);
 
        socket.send(outPacket);
 
        System.out.println("Server sends : " + msg);
        try {
          Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
      }
    } catch (IOException ioe) {
      System.out.println(ioe);
    }
  }
}
