/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: To display name of a person and count the no. of characters present in the name of the person.
 */

import java.util.Scanner;

interface pperson {
	void display();
	void count();
}

class CPerson implements pperson {
	static int maxcount;
	String name;
	
	public CPerson(String n) { name = n; }
	
	public void count() {
		for(int i=0;i<name.length();i++)
		maxcount++;
	}
	
	public void display() {
		System.out.println("Name - " + name);
		System.out.println("Characters present in the name - " + maxcount);
	}
	
}

public class CountPerson {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name - ");
		CPerson ob = new CPerson(sc.next());
		ob.count();
		ob.display();
	}
	
}
