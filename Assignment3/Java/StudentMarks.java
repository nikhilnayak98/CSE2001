/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Student Marks
 */

import java.util.Scanner;

class MarksOutOfBoundException extends Exception {
	MarksOutOfBoundException() {
		System.err.println("Marks cannot be greater than 100");
	}
}

class Student {
	String name;
	int marks;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter marks");
		marks = sc.nextInt();
		try {
			if(marks>100)
				throw new MarksOutOfBoundException();
		} catch(Exception e) {
			System.out.println("Error - " + "\n" + e);
		}
	}
	
	void display() {
		System.out.println("Name - " + name);
		System.out.println("Marks - " + marks);
	}
}

public class StudentMarks {

	public static void main(String[] args) {
		Student stud = new Student();
		stud.input();
		stud.display();
	}

}
