/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : Student class
 */

import java.util.Scanner;

class student {
	String name;
	double marks;
	int rollno;
	void setData(String name1,int rollno1,double marks1) {
		name=name1;
		rollno=rollno1;
		marks=marks1;
	}
	void display() {
		System.out.println("Name - " + name);
		System.out.println("Roll no - " + rollno);
		System.out.println("Marks - " + marks);
	}
}
public class assign1ques10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student stud = new student();
		String name;
		int rollno;
		double marks;
		System.out.println("Enter a name");
		name=sc.next();
		System.out.println("Enter roll no");
		rollno=sc.nextInt();
		System.out.println("Enter marks");
		marks=sc.nextDouble();
		stud.setData(name,rollno,marks);
		stud.display();
	}

}
