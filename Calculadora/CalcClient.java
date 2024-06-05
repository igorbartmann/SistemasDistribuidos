import java.rmi.*;
public class CalcClient {

	public static void main(String[] args) {
		try {
			Calc objCalc = (Calc)Naming.lookup("//node01:2004/Calc");
			System.out.println("O resultado da soma é : " + objCalc.add(3, 7));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}