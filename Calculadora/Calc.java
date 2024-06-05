import java.rmi.*;

public interface Calc extends Remote {
	int add(int i, int j) throws RemoteException;
}