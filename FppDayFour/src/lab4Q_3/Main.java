package lab4Q_3;

import java.time.LocalDate;
import java.util.Scanner;

import lab4Q3.Employee;

public class Main {
	Employee[] emps = null;
	String n = System.getProperty("line.separator");

	public static void main(String[] args) {

		new Main();
		Scanner sc = new Scanner(System.in);

	}

	public Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", LocalDate.of(2000, 1, 4));
		emps[1] = new Employee("Bob Reuben", LocalDate.of(1998, 1, 5));
		emps[2] = new Employee("Susan Randolph", LocalDate.of(1997, 2, 13));

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		displayOptions();
		String inputString = "";
		inputString = sc.nextLine();
		if (inputString.equalsIgnoreCase("A")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		} else if (inputString.equalsIgnoreCase("B")) {
			displayEmployees();
			int empIndex = Integer.parseInt(sc.nextLine());
			displayAccounts(empIndex);
			int accIndex = Integer.parseInt(sc.nextLine());
			System.out.println("Deposite Amount:");
			double amt = Double.parseDouble(sc.nextLine());
			emps[empIndex].deposit(accIndex, amt);
			System.out.println(amt + " has been deposited in the " + "\n" + findsAccount(accIndex, empIndex) + " of "
					+ emps[empIndex].getName()+"\n"+"The updeted blance is ==>"+emps[empIndex].getAcct().get(accIndex).getBalance());
			System.out.println();

		} else if (inputString.equalsIgnoreCase("C")) {
			displayEmployees();
			int empIndex = Integer.parseInt(sc.nextLine());
			displayAccounts(empIndex);
			int accIndex = Integer.parseInt(sc.nextLine());
			System.out.println("withDrwal Amount:");

			double amt = Double.parseDouble(sc.nextLine());
            emps[empIndex].withdraw(accIndex, amt);
            System.out.println(amt + " has been withdraw from the " + "\n" + findsAccount(accIndex, empIndex) + " of "
					+ emps[empIndex].getName());
            
		} else {
			System.out.println("Reenter ");
			displayOptions();
		}
	}
	// do nothing..the application ends here

	public String getFormattedAccountInfo() {
		String format = "";
		for (Employee empl : emps) {
			format += String.format(" %n ACCOUNT INFO FOR : %s %n%n ", empl.getName());
			format += String.format("%s", empl.getFormattedAcctInfo());
		}
		// loop through employees array and get formatted
		// account info for each employee, and assemble into a string
		return format;
	}

	void displayOptions() {
		String n = System.getProperty("line.separator");
		String display = "TYPE A LETTER IN INPUT AREA TO MAKE A SELECTION" + n + n + "A. See a report of all accounts."
				+ n + "B. Make a deposit." + n + "C. Make a withdrawal." + n + "\t" + "Make a selection (A/B/C):";
		System.out.println(display);

	}

	void displayEmployees() {
		for (int i = 0; i < emps.length; i++) {
			System.out.println(i + ". " + emps[i].getName());
		}
		System.out.print("Select an employee: (type a number)");
	}

	String findsAccount(int z, int y) {
		MyStringList accts = emps[y].getNamesOfAccounts();
		return accts.get(z);
	}

	void displayAccounts(int i) {
		MyStringList accts = emps[i].getNamesOfAccounts();

		for (int j = 0; j < accts.size(); ++j) {
			System.out.println(j + ". " + accts.get(j));
		}
		System.out.print("Select an AccountType: (type a number)");
	}

}
