import java.rmi.*;
import java.util.*;
public class Pgm5_Client{
	public static void main(String args[]){
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.printf("Enter the String to reverse :");
			String s = scanner.nextLine();

			Pgm5_reverser stub = (Pgm5_reverser)Naming.lookup("rmi://localhost:5000/neil");
			System.out.println("The reverser String is :"+stub.reverse(s));
			
		}catch(Exception e){
		
		}
	}
}