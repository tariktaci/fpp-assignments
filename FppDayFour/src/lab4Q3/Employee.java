package lab4Q3;

import java.time.LocalDate;

import lab4Q_3.MyStringList;

public class Employee {
	private AccountList acct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, LocalDate hireDate) {
		this.name = name;
		acct = new AccountList();
		/*
		 * update, using LocalDate GregorianCalendar cal = new
		 * GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire); hireDate =
		 * cal.getTime();
		 */
		this.hireDate = hireDate;
	}
public AccountList getAcct() {
	AccountList tmp= new AccountList() ;
	for(int i=0;i<acct.size();i++) {
		tmp.add(acct.get(i));
	}
	return tmp;
}
	public void createNewChecking(double startAmount) {

		Account checkingAcct = new CheckingAccount(this, startAmount);
		acct.add(checkingAcct);

	}

	public void createNewSavings(double startAmount) {
		// implement
		Account savingsAcct = new SavingsAccount(this, startAmount);
		acct.add(savingsAcct);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		Account retirementAcct = new RetirementAccount(this, startAmount);
		acct.add(retirementAcct);
	}

	public String getFormattedAcctInfo() {
		String output = "";
		for (int i = 0; i < acct.size(); i++) {
			if (acct.get(i) != null) {
				output += acct.get(i).toString();
			}

		}
		return output;
		// return null;
	}

	/*
	 * @Override public String toString() { return "Employee1 [name=" + name +
	 * ", hireDate=" + hireDate + "]"; }
	 */

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void deposit(int acctIndex, double amt) {
		// implement
		Account choose = acct.get(acctIndex);
		choose.makeDeposit(amt);

	}

	public boolean withdraw(int acctIndex, double amt) {

		Account choose = acct.get(acctIndex);

		boolean valu = choose.makeWithdrawal(amt);
		return valu;

	}
	public MyStringList getNamesOfAccounts() {
		MyStringList acctNameList = new MyStringList();
		for(int i = 0; i < acct.size(); ++i) {
		acctNameList.add(acct.get(i).getAcctType().toString());
		}
		return acctNameList;
		}
}