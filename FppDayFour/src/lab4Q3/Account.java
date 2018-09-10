package lab4Q3;

abstract public class Account {
	abstract public AccountType getAcctType();

	private final static double DEFAULT_BALANCE = 0.0;
	protected double balance;

	private Employee employee;

	public Account(Employee emp, double balance) {
		employee = emp;

		this.balance = balance;
	}

	public Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	public String toString() {
		String output = "";

		output = String.format("Current bal: %5.1f %n", balance);

		return output;
	}

	public void makeDeposit(double deposit) {
		// implement
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if (amount < balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}

	public double getBalance() {
		return balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}
	
	
}