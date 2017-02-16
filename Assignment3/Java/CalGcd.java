/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: GCD using recursion
 */

import java.util.Scanner;

public class CalGcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1 - ");
		int n = sc.nextInt();
		System.out.println("Enter a number 2 - ");
		int m = sc.nextInt();
		System.out.println("GCD - " + gcd(n,m));
	}
	
	public static int gcd(int n,int m) {
		if(m==0)
			return n;
		else
			return gcd(n,n%m);
	}

}
