/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Palindrome string using recursion
 */

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string - ");
		char str[] = sc.next().toCharArray();

		char t[] = new char[str.length];
		
		for(int i=0;i<str.length;i++)
			t[i] = str[i];
		
		String s1=new String(t);

		revString(str,0,str.length-1);
		
		String s2=new String(str);

		if(s1.equals(s2))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	public static void revString(char a[],int i,int n) {
		char temp;
		temp = a[i];
		a[i] = a[n-i];
		a[n-i] = temp;
		if(i==n/2) {
			return;
		}
		else
			revString(a,i+1,n);
	}

}
