/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Reversing digits using recursion
 */

import java.util.Scanner;

public class RevDigit {
	
	static int rev = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Reversed Number - " + revDig(n));
	}
	
	public static int revDig(int n) {
		if(n==0)
			return 1;
		else {
			rev = rev*10 + n%10;
			revDig(n/10);
			return rev;
		}
			
	}

}
