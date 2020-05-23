package business;

public class Financial {

	public static double calculateFutureValue(double monthlyInvestment, double yearlyInterestRate, int years) {
		
		double monthlyInterestRate = yearlyInterestRate / 100 / 12;
		double months = years * 12;
		
		double futureValue = 0;
		for(int i = 1; i <= months; i++) {
			futureValue += monthlyInvestment;
			double monthlyInterest = monthlyInterestRate * futureValue;
			futureValue += monthlyInterest;
		}
		return futureValue;
	}
}
