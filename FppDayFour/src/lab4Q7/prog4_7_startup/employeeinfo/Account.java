package lab4Q7.prog4_7_startup.employeeinfo;

abstract public class Account implements Comparable<Account> {
	private Employee emp;
	private double balance;
private final int MONTHLY_CHARGE=5;
	@Override
	public int compareTo(Account a) {
		//implement
		if(this.balance==a.getBalance()) {
			return 0;
		}
		else	if (balance>a.getBalance()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	Account(Employee e, double startBalance) {
		emp = e;
		balance = startBalance;
		
		
	}
	Account(Employee e) {
		this(e,0.0);
	}
	abstract public AccountType getAcctType();

	void makeDeposit(double amount){
		balance += amount;
	}
	boolean makeWithdrawal(double amount){
		if(amount > balance){
			return false;
		}
		balance -= amount;
		return true;
	}
	double getBalance(){
		return balance;
	}
	/** used by subclasses only */
	void setBalance(double bal){
		balance = bal;
	}
	void updateBalance() {
		//by default do nothing
		balance=balance-MONTHLY_CHARGE;
	}
	
	
	public Employee getEmp(){
		return emp;
	}
	private String newline = System.getProperty("line.separator");
	public String toString(){
		String ret =
			"Account type: "+getAcctType().toString().toLowerCase()+newline+
			"Current bal:  "+balance;
		return ret;
	}
	
}
