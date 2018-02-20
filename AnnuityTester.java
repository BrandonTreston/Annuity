import java.util.Scanner;
public class AnnuityTester {
	public static void main (String [] args) {
		System.out.println("enter initial balance: "); //initial balance is the pmt.
		Scanner in1 = new Scanner (System.in);
		System.out.println("enter intrest: ");
		Scanner in2 = new Scanner (System.in);
		System.out.println("enter number of payment: ");
		Scanner in3 = new Scanner (System.in);
		
		double param1 = in1.nextDouble();
		double param2 = in2.nextDouble();
		double param3 = in3.nextDouble();

		
		Annuity account = new Annuity(param1, param2, param3);
		account.calculateAnnuity();
		System.out.println(account.getAnnuity());
		in1.close();
		in2.close();
		in3.close();
	}
}
