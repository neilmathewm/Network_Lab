import java.rmi.*;
import java.rmi.registry.*;
public class Pgm5_Server{
	public static void main(String args[]){
		try{
			Pgm5_reverser stub = new Pgm5_reverserRemote();
			Naming.rebind("rmi://localhost:5000/neil",stub);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}