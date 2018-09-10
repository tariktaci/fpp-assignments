package lab4Q1;

import java.time.LocalDate;

public class DeptEmployee {
private String name;
protected double salary;
private LocalDate hireDate;
public DeptEmployee(String name, LocalDate hireDate,double salary) {
	
	this.name = name;
	this.hireDate = hireDate;
	this.salary= salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getHireDate() {
	return hireDate;
}
public void setHireDate(LocalDate hireDate) {
	this.hireDate = hireDate;
}
public double computesalary() {
	
	return salary;
	
}





}
