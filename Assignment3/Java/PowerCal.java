/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Calculate x^n
 */

import java.util.Scanner;

public class PowerCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x - ");
		int x = sc.nextInt();
		System.out.println("Enter n - ");
		int n = sc.nextInt();
		System.out.println("x^n - " + calPower(x,n));
	}
	
	public static int calPower(int x,int n) {
		if(n==0)
			return 1;
		else
			return (x*calPower(x,--n));
	}

}
