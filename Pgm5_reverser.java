import java.rmi.*;

public interface Pgm5_reverser extends Remote{
	public String reverse(String str) throws RemoteException;
}