/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Product of 2 numbers using recursion
 */

import java.util.Scanner;

public class ProdNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Enter number 1 - ");
		n = sc.nextInt();
		System.out.println("Enter number 2 - ");
		m = sc.nextInt();
		System.out.println("Product - " + product(n,m));
	}

	public static int product(int n,int m) {
		if(n<m)
			return product(m, n);
		else if(m!=0)
			return (n + product(n,--m));
		return 0;
	}

}
