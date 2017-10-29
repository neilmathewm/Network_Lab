import java.io.*;
import java.net.*;

public class Pgm7a_BroadCastReceiver {
public static void main(String[] args) {
DatagramSocket socket = null;
DatagramPacket inPacket = null;
byte[] inBuf = new byte[256];
try {

socket = new DatagramSocket(3031);

while (true) {
inPacket = new DatagramPacket(inBuf, inBuf.length);
socket.receive(inPacket);
String msg = new String(inBuf, 0, inPacket.getLength());
System.out.println("From " + inPacket.getAddress() + " Msg : " + msg);
}
} catch (IOException ioe) {
System.out.println(ioe);
}
}
}
