import java.util.Scanner;

/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : Student class
 */

class Student {
	Scanner sc = new Scanner(System.in);
	String name;
	double marks;
	int rollno;
	void setData() {
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter rollno");
		rollno=sc.nextInt();
		System.out.println("Enter marks");
		marks=sc.nextDouble();
	}
	void display() {
		System.out.println("Name - " + name);
		System.out.println("Roll no - " + rollno);
		System.out.println("Marks - " + marks);
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		Student stud = new Student();
		stud.setData();
		stud.display();
	}

}
