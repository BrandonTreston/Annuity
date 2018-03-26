
public class Annuity {
	public Annuity() {
		pmt = 0;
		i = 0;
		n = 0;
		pv = 0;
	}
	public Annuity (double payment, double intrest, double numberOfPayments) {
		pmt =payment;
		i = intrest;
		n = numberOfPayments;
		//ex: one payment per year == , 2 payments per year == 2
	}
	
	public void calculateAnnuity() {
		double newPv = pmt * ((((Math.pow((1+i),(n-1))) -1) /i) / (Math.pow((1 + i),(n -1))) + 1);
		pv = newPv;
		
	}
	
	public double getAnnuity() {
		return pv;
	}
	
	private double pv;
	private double pmt;
	private double i;
	private double n;
}
