import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class ContaServer extends UnicastRemoteObject implements Conta {
	private float saldo = 0;
	
	public ContaServer() throws RemoteException {
		super();
	}	
	
	public synchronized float saldo() {
		return saldo;
	}
	
	public synchronized void deposita(float valor) {
		saldo += valor;
	}
	
	public synchronized void retira(float valor) {
		// if (saldo < valor) {
			// throw new RemoteException();
		// }
		
		saldo -= valor;
	}
 
	public static void main(String args[]) {		
		try {
			ContaServer objRMI = new ContaServer();
			
			LocateRegistry.createRegistry(1900);
			Naming.rebind("rmi://localhost:1900/Conta", objRMI);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}