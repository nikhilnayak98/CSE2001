/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Student package
 */
package com.qtwelve;

import java.util.Scanner;

public class Test extends Student {
	Scanner sc = new Scanner(System.in);
	double mark1,mark2;
	
	void input() {
		System.out.println("Enter Mark 1 - ");
		mark1 = sc.nextDouble();
		System.out.println("Enter Mark 2 - ");
		mark2 = sc.nextDouble();
	}
	
	void output() {
		System.out.println("Mark 1 - " + mark1 +
						  "\nMark2 - " + mark2);
	}

}
