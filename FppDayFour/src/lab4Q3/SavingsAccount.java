package lab4Q3;

public class SavingsAccount extends Account {

	public SavingsAccount(Employee emp, double balance) {
		super(emp, balance);

	}

	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

	@Override
	public String toString() {
		String output = "";

		// output= String.format("Account INFO for %4s %2s :", get)
		output = String.format(" Account Type: %3s %n ", getAcctType());
		output += String.format("Current bal: %5.1f %n", getBalance());
		// System.out.println(output);

		return output;
	}

	@Override
	public double getBalance() {
		double interest = (0.25 / 100) * balance;
		return balance + interest;
	}
}
