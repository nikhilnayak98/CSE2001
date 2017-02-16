/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Fibonacci numbers using recursion
 */

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		System.out.println("Nth fibonacci number - " + fiboNum(n));
	}

	public static int fiboNum(int n) {
		if(n==1)
			return 1; 
		if (n == 2)
			return 1; 
		return fiboNum(n-1) + fiboNum(n-2);
	}

}
