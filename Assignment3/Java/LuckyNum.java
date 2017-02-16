/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Lucky Number
 */

import java.util.Scanner;

class NumberFormatException extends Exception {
	NumberFormatException() {
		System.err.println("Number Cant Be Negative");
	}
}

public class LuckyNum {

	public static void main(String[] args) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your lucky number");
		int n = sc.nextInt();
		try {
			if(n<0) {
				throw new NumberFormatException();
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}

