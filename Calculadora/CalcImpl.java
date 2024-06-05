import java.rmi.*;
import java.rmi.server.*;

public class CalcImpl extends UnicastRemoteObject implements Calc {
	public CalcImpl() throws RemoteException {
		super();
	}
	
	public int add(int i, int j) {
		return i + j;
	}
 
	public static void main(String args[]) {
		try {
			CalcImpl objRMI = new CalcImpl();
			Naming.rebind("//node01:2004/Calc", objRMI);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}