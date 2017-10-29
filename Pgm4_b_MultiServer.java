//MultiServer
import java.util.*;
import java.net.*;
import java.io.*;
 
class Server extends Thread {
    Socket cs;
 
    PrintWriter out;
    BufferedReader in;
   
    String message;
 
    Server(Socket s) {
        cs = s;
    }
 
    public void run() {
        try {
            out = new PrintWriter(cs.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            while(true) {    //Main Loop
                if((message = in.readLine()) != null) {
                    System.out.println("Compute Request");
                    int a = Integer.parseInt(message);
                    out.println("Square of " + String.valueOf(a)
                        + " is : " + String.valueOf(a * a));
                    out.flush();
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR!");
        }
    }
}
 
public class Pgm4_a_MultiServer {
    static int port = 3000;
    static ServerSocket server_socket;
 
    static PrintWriter output_stream;
    static BufferedReader input_stream;
    static Scanner input_stdin;
 
    public static void main(String args[]) throws IOException {
        try {
            server_socket = new ServerSocket(port);
            while(true) {
                Socket client_socket = server_socket.accept();
                System.out.println("New Client");
                Server s = new Server(client_socket);
                s.start();
            }
        } catch(IOException e) {
            System.out.println("ERROR!");
        }
    }
}
 