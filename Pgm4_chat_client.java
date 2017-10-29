import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Pgm4_chat_client{
			static TextArea t1;
			static TextField t2;
			static Button send;
			 static TextArea t3;
			 static Socket client;
			 static String mesg;
			 static Frame f;
	public static void main(String args[]) throws IOException{
		f=new Frame("chat client");
			t1=new TextArea();t2=new TextField();send=new Button("Send");t3=new TextArea();
			f.add(t1);f.add(t2);f.add(send);f.add(t3);
			t1.setBounds(50,50,250,310);
			t2.setBounds(50,400,235,30);
			send.setBounds(50,470,80,30);
			f.setVisible(true); 
			f.setSize(450,600);
			f.setLayout(null);
			mesg=new String();

		try{
			client=new Socket("localhost",3001);
			System.out.println("Client created");
			PrintWriter out=new PrintWriter(client.getOutputStream());
			BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
			send.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
					{
						System.out.println("click");
						t1.append("\nClient:"+t2.getText());
						out.println(t2.getText());
						out.flush();
						t2.setText("");
						
					}
			});	
			while(true) {    //Main Loop
			 	System.out.println("while");
                if((mesg = in.readLine()) != null) {
                    t1.append("\nServer:" + mesg);
                }
            }
		}
		catch(IOException e){
			System.out.println("Error:"+e);
		}
	}
}