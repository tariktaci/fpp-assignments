package lab4Q3;

public class RetirementAccount extends Account {
	public RetirementAccount(Employee emp, double amt) {
		super(emp, amt);
	}

	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

	@Override
	public boolean makeWithdrawal(double amount) {
		if (amount < balance) {
			balance = balance - amount - (amount * 0.02);
			return true;
		} else {
			return false;
		}

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
}
