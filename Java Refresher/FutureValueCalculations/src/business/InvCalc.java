package business;

public class InvCalc implements InvCalcReader {
	
	private double monthlyInv, rate, years;
	
	public InvCalc() {
		monthlyInv = 0.0;
		rate = 0.0;
		years = 0.0;
	}

	public double getMonthlyInv() {
		return monthlyInv;
	}

	public void setMonthlyInv(double monthlyInv) {
		this.monthlyInv = monthlyInv;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getYears() {
		return years;
	}

	public void setYears(double years) {
		this.years = years;
	}

	public double getFutureValue() {
		double monthlyInterestRate = rate / 12;
		double months = years * 12;
		
		double futureValue = 0.0;
		for (int i = 0; i < months; i++) {
			futureValue += monthlyInv;
			double interest = futureValue * monthlyInterestRate;
			futureValue += interest;
		}
		return futureValue;
	}

}
