import java.rmi.*;
import java.rmi.server.*;
public class Pgm5_reverserRemote extends UnicastRemoteObject implements reverser{
	reverserRemote()throws RemoteException{
		super();
	}

	public String reverse(String str){
		StringBuilder builder = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			builder.append(str.charAt(i));
		}
		return builder.toString();
	}
}