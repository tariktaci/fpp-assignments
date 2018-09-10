package lab4Q1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DeptEmployee sr1 = new Secretry("tarik", LocalDate.of(1995, 2, 9), 100.0,200);
		DeptEmployee sr2 = new Secretry("zed", LocalDate.of(2000, 2, 9), 200.0,200);
		
		DeptEmployee pro1 = new Professor("emrahim", LocalDate.of(1975, 8, 4), 2000.0,10);
		DeptEmployee pro2 = new Professor("amarech", LocalDate.of(1989, 8, 4), 3000.0,10);
		DeptEmployee[] dps = new DeptEmployee[4];
		dps[0] = sr1;
		dps[1] = sr2;
		dps[2] = pro1;
		dps[3] = pro2;
		System.out.println("if you wish to see  sum  of salary employees enter Y ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			double total = 0.0;
			for (DeptEmployee emp : dps) {

				total += emp.computesalary();

			}
			System.out.println("the sum of employee salary ==>"+ total);
		}

	}
}
