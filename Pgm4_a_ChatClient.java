
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
 
public class Pgm4_a_ChatClient {
    static int port = 3001;
    static Socket client_socket;
   
    static PrintWriter output_stream;
    static BufferedReader input_stream;
 
    static JFrame client_frame;
    static JTextField input;
    static JButton send;
    static JTextArea chat_history;
   
    static String message;
 
    public static void main(String args[]) throws IOException {
        try {
            client_socket = new Socket("localhost", port);
            System.out.println("Client socket created");
 
            output_stream = new PrintWriter(client_socket.getOutputStream(), true);
            input_stream = new BufferedReader(
                new InputStreamReader(client_socket.getInputStream()));
 
            message = new String();
 
            client_frame = new JFrame();
            input = new JTextField("Enter message", 50);
            chat_history = new JTextArea();
            send = new JButton("Send");
           
            input.setBounds(5, 320, 235, 30);
            send.setBounds(245, 320, 80, 30);
            chat_history.setBounds(5, 5, 320, 310);
           
           
            client_frame.add(chat_history);
            client_frame.add(input);
            client_frame.add(send);
 
            send.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    if(!input.getText().equals("")) {
                        message = input.getText();
                        output_stream.println(message);
                        message = "Client : " + message;
                        chat_history.append("\n" + message);
                        output_stream.flush();
                        input.setText("");
                    }
                }
            });
 
            client_frame.setSize(350, 400);
            client_frame.setLayout(null);
            client_frame.setVisible(true);
 
            while(true) {    //Main Loop
                if((message = input_stream.readLine()) != null) {
                    message = "Server : " + message;
                    chat_history.append("\n" + message);
                }
            }
        } catch(IOException e) {
            System.out.println("ERROR!");
            input.setText("ERROR!");
        }
    }
}