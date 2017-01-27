/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Student Details
 */

package com.a;

import java.util.Scanner;

class Student {
	int roll;
	String name;
	String course;
	
	void input_Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no");
		roll = sc.nextInt();
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter course");
		course = sc.next();
	}
	
	void display_Student() {
		System.out.println("Roll no - " + roll +
						   "\nName - " + name +
						   "\nCourse - " + course);
	}
}

class Exam extends Student {
	double mark1,mark2,mark3;
	
	void input_Marks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark 1");
		mark1 = sc.nextDouble();
		System.out.println("Enter mark 2");
		mark2 = sc.nextDouble();
		System.out.println("Enter mark 3");
		mark3 = sc.nextDouble();
	}
	
	void display_Marks() {
		System.out.println("Mark 1 - " + mark1 +
						   "\nMark 2 - " + mark2 +
						   "\nMark 3 - " + mark3);
	}
	
}

public class StudentDetails {

	public static void main(String[] args) {
		Exam ob[] = new Exam[5];
		
		for(int i=0;i<4;i++) {
			ob[i] = new Exam();
		}
		
		for(int i=0;i<4;i++) {
			System.out.println("Enter details of Student " + i);
			System.out.println();
			ob[i].input_Student();
			ob[i].input_Marks();
		}
		
		for(int i=0;i<4;i++) {
			System.out.println("Details of Student " + i);
			ob[i].display_Student();
			ob[i].display_Marks();
		}

	}

}
