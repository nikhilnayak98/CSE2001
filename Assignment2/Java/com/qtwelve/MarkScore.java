/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Student package
 */
package com.qtwelve;

import com.qtwelve2.Sports;
import java.util.Scanner;

class Student {
	Scanner sc = new Scanner(System.in);

	String name;
	int roll;

	void input() {
		System.out.println("Enter Student name - ");
		name = sc.next();
		System.out.println("Enter Roll no - ");
		roll = sc.nextInt();
	}

	void output() {
		System.out.println("Name - " + name + 
				"\nRoll no - " + roll);
	}

}

class Test extends Student implements Sports {
	double mark1,mark2;

	void input() {
		super.input();
		System.out.println("Enter Mark 1 - ");
		mark1 = sc.nextDouble();
		System.out.println("Enter Mark 2 - ");
		mark2 = sc.nextDouble();
		System.out.println("Enter Score 1 - ");
	}

	void output() {
		super.output();
		System.out.println("Mark 1 - " + mark1 +
				"\nMark 2 - " + mark2 +
				"\nTotal Marks - " + (mark1+mark2) +
				"\nScore 1 " + score1 +
				"\nScore 2 - " + score2 +
				"\nTotal Score - " + (score1+score2));
	}

}

public class MarkScore {
	
	public static void main(String args[]) {
		Test ob = new Test();
		ob.input();
		ob.output();
	}
	
}
