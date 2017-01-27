/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Student Teacher
 */

import java.util.Scanner;

class Person {
	String name;
	int age;
	
	public Person(String name1,int age1) {
		name = name1;
		age = age1;
	}
}

class Student extends Person{
	int roll;
	String course;
	double marks;
	
	public Student(String name1,int age1,int roll1,String course1,double marks1) {
		super(name1, age1);
		roll = roll1;
		course = course1;
		marks = marks1;
	}
	
	void display() {
		System.out.println("Name - " + name +
				           "\nRoll no - " + roll +
				           "\nAge - " + age +
				           "\nCourse - " + course);
	}
	
}

class Teacher extends Person {
	
	String subject_assigned;
	int contact_hours;

	public Teacher(String name1,int age1,String subAssign,int contHrs) {
		super(name1, age1);
		subject_assigned = subAssign;
		contact_hours = contHrs;
	}
	
	void display() {
		System.out.println("Name - " + name +
				           "\nSubject Assigned - " + subject_assigned +
				           "\nAge - " + age +
				           "\nCountact Hours - " + contact_hours);
	}
	
}

public class School {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Teacher Details");
		System.out.println("Enter Name - ");
		String name = sc.next();
		System.out.println("Enter Age -");
		int age = sc.nextInt();
		System.out.println("Enter Subject Assigned - ");
		String subassg = sc.next();
		System.out.println("Enter Contact Hours -");
		int contact = sc.nextInt();
		Teacher teacher = new Teacher(name,age,subassg,contact);
		teacher.display();
		
		System.out.println("Student Details");
		System.out.println("Enter Name - ");
		name = sc.next();
		System.out.println("Enter Age -");
		age = sc.nextInt();
		System.out.println("Enter Roll no- ");
		int roll = sc.nextInt();
		System.out.println("Enter Course");
		String course = sc.next();
		System.out.println("Enter Marks -");
		double marks = sc.nextDouble();
		Student student = new Student(name,age,roll,course,marks);
		student.display();
	}

}
