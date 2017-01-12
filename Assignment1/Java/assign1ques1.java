/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : To input three integers, a, b, and c, from the Java console and determines if they can be used in a correct arithmetic formula (in the given order).
 */

import java.util.Scanner;

public class assign1ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter number 1");
		n1=sc.nextInt();
		System.out.println("Enter number 2");
		n2=sc.nextInt();
		System.out.println("Enter number 3");
		n3=sc.nextInt();
		if((n1+n2)==n3)
			System.out.println("Addition is true");
		else if((n2-n3)==n1)
			System.out.println("Subtraction is true");
		else if((n1*n2)==n3)
			System.out.println("Multiplication is true");
	}

}
