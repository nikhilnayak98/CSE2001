/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc:  Towers of Hanoi puzzle
 */

import java.util.Scanner;

public class TowerOfHanoi {
	
	static int moves = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int source=1,temp=2,target=3;
		System.out.println("Enter no of discs - ");
		int discs = sc.nextInt();
		solve(discs,source,target,temp);
		System.out.println("Total no of moves - " + moves);
	}
	
	public static void solve(int n,int source,int temp,int target) {
	       if (n == 1) {
	           System.out.println(source + " to " + target);
	       } else {
	    	   moves++;
	           solve(n-1,source,target,temp);
	           System.out.println(source + " to " + target);
	           moves++;
	           solve(n-1,temp,source,target);
	       }
	   }
}
