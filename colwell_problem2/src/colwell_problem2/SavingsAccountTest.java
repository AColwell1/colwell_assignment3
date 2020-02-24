package colwell_problem2;

public class SavingsAccountTest {

	public static void main(String[] args) {
		int i;
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		SavingsAccount.modifyInterestRate(.04);
		
		for(i=0; i<12; i++) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.printf("Month %d\nSaver 1: %.2f\nSaver 2: %.2f\n", i+1,saver1.getSavingsBalance(), saver2.getSavingsBalance());
		}
		
		SavingsAccount.modifyInterestRate(.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("Next month \nSaver 1: %.2f\nSaver 2: %.2f\n",saver1.getSavingsBalance(), saver2.getSavingsBalance());
		
		
	}

}
