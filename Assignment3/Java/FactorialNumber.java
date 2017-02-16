/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Factorial Number using recursion
 */

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Factorial - " + factorial(n));
	}

	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return (n*factorial(--n));
	}

}
