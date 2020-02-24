package colwell_problem2;

public class SavingsAccount {

	private static double annualInterestRate;
	
	private double savingsBalance;
	
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void calculateMonthlyInterest() {
		double interest;
		interest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += interest;
	}

	public static void modifyInterestRate(double new_rate) {
		annualInterestRate = new_rate;	
	}

	

	
}
