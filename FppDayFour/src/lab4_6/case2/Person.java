package lab4_6.case2;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != this.getClass()) 
				return false;
		Person p = (Person) ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person("tarik", new GregorianCalendar(2000,7,4));
		Person p2= new Person("betty",new GregorianCalendar(2009,3,5) );
		PersonWithJob pjob1= new PersonWithJob("zed",new GregorianCalendar(2000,7,4),500000);
		PersonWithJob pjob2= new PersonWithJob("zed",new GregorianCalendar(2000,7,4),500000);
		System.out.println(p1.equals(p2));
		System.out.println(pjob1.equals(pjob2));

	}

}
