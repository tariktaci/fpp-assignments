package lab4Q1;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	private int numberOfPublications;

	public Professor(String name, LocalDate hireDate,double salary,int numberOfPublication) {
		super(name, hireDate,salary);
	this.numberOfPublications=numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
