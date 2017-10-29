//MultiClient
import java.util.*;
import java.net.*;
import java.io.*;
 
public class Pgm4_b_MultiClient {
    static int port = 3000;
    static Socket client_socket;
 
    static String message;
   
    static PrintWriter output_stream;
    static BufferedReader input_stream;
    static Scanner input_stdin;
 
    public static void main(String args[]) throws IOException {
        try {
            client_socket = new Socket("localhost", port);
            System.out.println("Client socket created");
 
            output_stream = new PrintWriter(client_socket.getOutputStream(), true);
            input_stream = new BufferedReader(
                new InputStreamReader(client_socket.getInputStream()));
            input_stdin = new Scanner(System.in);
 
            message = new String();
 
            while(true) {
                System.out.println("Enter number to find square : ");
                message = input_stdin.next();          
                output_stream.println(message);
                output_stream.flush();
                while ((message = input_stream.readLine()) != null) {
                    System.out.println(message);
                    break;
                }
            }
        } catch(IOException e) {
            System.out.println("ERROR!");
        }
    }
}