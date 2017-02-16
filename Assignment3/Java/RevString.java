/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Reversing a string using recursion
 */

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string - ");
		char str[] = sc.nextLine().toCharArray();

		System.out.print("Original String - ");
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}

		revString(str,0,str.length-1);

		System.out.println("\nReversed String - ");
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
	}

	public static void revString(char a[],int i,int n) {
		char temp;
		temp = a[i];
		a[i] = a[n-i];
		a[n-i] = temp;
		if(i==n/2)
			return;
		else
			revString(a,i+1,n);
	}

}
