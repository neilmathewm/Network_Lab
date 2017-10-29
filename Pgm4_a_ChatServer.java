
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
 
public class Pgm4_a_ChatServer {
    static int port = 3001;
    static ServerSocket server_socket;
    static Socket client_socket;
   
    static PrintWriter output_stream;
    static BufferedReader input_stream;
 
    static JFrame server_frame;
    static JTextField input;
    static JButton send;
    static JTextArea chat_history;
   
    static String message;
 
    public static void main(String args[]) throws IOException {
        try {
            server_socket = new ServerSocket(port);
            System.out.println("Server created");
            client_socket = server_socket.accept();
            System.out.println("Client socket created");
 
            output_stream = new PrintWriter(client_socket.getOutputStream(), true);
            input_stream = new BufferedReader(
                new InputStreamReader(client_socket.getInputStream()));
 
            message = new String();
 
            server_frame = new JFrame();
            input = new JTextField("Enter message", 50);
            chat_history = new JTextArea();
            send = new JButton("Send");
           
            input.setBounds(5, 320, 235, 30);
            send.setBounds(245, 320, 80, 30);
            chat_history.setBounds(5, 5, 320, 310);
           
           
            server_frame.add(chat_history);
            server_frame.add(input);
            server_frame.add(send);
 
            send.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    if(!input.getText().equals("")) {
                        message = input.getText();
                        output_stream.println(message);
                        message = "Server : " + message;
                        chat_history.append("\n" + message);
                        output_stream.flush();
                        input.setText("");
                    }
                }
            });
 
            server_frame.setSize(350, 400);
            server_frame.setLayout(null);
            server_frame.setVisible(true);
 
            while(true) {    //Main Loop
                if((message = input_stream.readLine()) != null) {
                    message = "Client : " + message;
                    chat_history.append("\n" + message);
                }
            }
        } catch(IOException e) {
            System.out.println("ERRORRRR!");
            input.setText("ERROR!");
        }
    }
}