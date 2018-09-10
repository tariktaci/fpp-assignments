package lab4Q3;

public class CheckingAccount extends Account {

	public CheckingAccount(Employee ep, double amt) {
		super(ep, amt);

	}

	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

	@Override
	public double getBalance() {
		return balance = balance - 5;
	}

	@Override
	public String toString() {
		String output = "";

		output = String.format(" Account Type: %3s %n ", getAcctType());
		output += String.format("Current bal: %5.1f %n", getBalance());

		return output;
	}
}
