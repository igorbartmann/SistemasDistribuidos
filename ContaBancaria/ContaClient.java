import java.rmi.*;

public class ContaClient {
	public static void main(String[] args) {
		try {
			Conta objConta = (Conta)Naming.lookup("rmi://localhost:1900/Conta");
			
			// Exibe o saldo atual.
			System.out.println("O saldo atual da conta bancaria e: " + objConta.saldo());
			
			// Adiciona 100 na conta e exibe o saldo após o movimento.
			objConta.deposita(100);
			System.out.println("Apos depositar 100 na conta, o saldo atual da conta bancaria e: " + objConta.saldo());
			
			// Remove 25 da conta e exibe o saldo após o movimento.
			objConta.retira(25);
			System.out.println("Apos retirar 25 da conta, o saldo atual da conta bancaria e: " + objConta.saldo());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}