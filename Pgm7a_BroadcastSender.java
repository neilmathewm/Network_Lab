import java.io.*;
import java.net.*;

public class Pgm7a_BroadcastSender {
  public static void main(String[] args) {
    DatagramSocket socket = null;
    DatagramPacket outPacket = null;
    byte[] outBuf;
    final int PORT = 3031;
 
    try {
      socket = new DatagramSocket();
      long counter = 0;
      String msg;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        msg = br.readLine();
        outBuf = msg.getBytes();
 
        //Send to multicast IP address and port
        InetAddress address = InetAddress.getByName("255.255.255.255");
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
