/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Binary equivalent using recursion
 */

import java.util.Scanner;

public class BinaryEquiv {

	static int bin = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("binary Equivalent - " + bEquiv(n));
	}

	public static int bEquiv(int n) {
		if(n==0||n==1)
			return n;
		else {
			int r = n%2;
			return r + bEquiv(n/2)*10;
		}
	}
}
