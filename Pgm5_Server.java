import java.rmi.*;
import java.rmi.registry.*;
public class Pgm5_Server{
	public static void main(String args[]){
		try{
			reverser stub = new reverserRemote();
			Naming.rebind("rmi://localhost:5000/priyath",stub);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}