import java.rmi.*;

public interface Conta extends Remote {
	float saldo() throws RemoteException;
	void deposita(float valor) throws RemoteException;
	void retira(float valor) throws RemoteException;
}