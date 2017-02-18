/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc:  Tower of Hanoi puzzle
 */

import java.util.Scanner;

public class TowerOfHanoi {

	static int moves = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int source=1,temp=3,target=2;
		System.out.println("Enter no of discs - ");
		int n = sc.nextInt();
		func(n,source,temp,target);
		System.out.println("Total no of moves - " + moves);
	}

	public static void func(int n,int source,int temp,int target) {
		if(n==1) {
			System.out.println("Move " + n + " from peg " + source + " to peg " + target);
		} else {
			moves++;
			func(n-1,source,target,temp);
			System.out.println("Move " + n + " from peg " + source + " to peg " + target);
			moves++;
			func(n-1,temp,source,target);
		}
	}
}
