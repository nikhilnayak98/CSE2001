/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Employee Details
 */

import java.util.Scanner;

interface EmpInterface {

	void displayEmp();
	void giveBonus(double amount);

}

abstract class Employee {
	String empID;
	String fName;
	String lName;
	double salary;

	Employee(String e,String f,String l,double sal) {
		empID = e;
		fName = f;
		lName = l;
		salary = sal;
	}
}

class Manager extends Employee implements EmpInterface {

	Manager(String e, String f, String l, double sal) {
		super(e, f, l, sal);
	}

	public void displayEmp() {
		System.out.println("Employee ID - " + empID +
				"\nFirst Name - " + fName +
				"\nLast Name - " + lName +
				"\nSalary - $" + salary);
	}

	public void giveBonus(double amount){
		if(amount<=0) {
			System.out.println("Bonus cannot be zero");
		} else {
			salary += amount;
		}
	}

}

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID - ");
		String id = sc.next();
		System.out.println("Enter First Name -");
		String fn = sc.next();
		System.out.println("Enter Last Name - ");
		String ln = sc.next();
		System.out.println("Enter Salary - ");
		double sal = sc.nextDouble();
		Manager m = new Manager(id,fn,ln,sal);
		System.out.println("Bonus? y/n");
		if(sc.next().charAt(0)=='y') {
			System.out.println("Enter bonus amount(>0)");
			m.giveBonus(sc.nextDouble());
		}
		System.out.println("Details");
		m.displayEmp();
	}

}
