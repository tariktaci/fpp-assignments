package lab4Q1;

import java.time.LocalDate;

public class Secretry extends DeptEmployee {
	private double overtimeHours;

	public Secretry(String name, LocalDate hireDate,double salary,double overtimeHours) {
		super(name, hireDate,salary);
		this.overtimeHours=overtimeHours;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	@Override
	public double computesalary() {
		//salary= salary+(overtimeHours*12);
		return salary+(overtimeHours*12);
	}
}
