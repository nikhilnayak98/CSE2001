/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Stack
 */

import java.util.Scanner;

class Node {
	int info;
	Node next;
}
public class StackDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node top;
		top=null;
		while(true) {
			System.out.println("****MENU****");
			System.out.println("0:Exit");
			System.out.println("1:Push");
			System.out.println("2:Pop");
			System.out.println("3:Display");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 0: System.exit(0);
			case 1: top = push(top);
			break;
			case 2: top = pop(top);
			break;
			case 3: display(top);
			break;
			default : System.out.println("Invalid choice");
			}
		}
	}
	
	public static Node push(Node top) {
		Node p = new Node();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input info");
		p.info = sc.nextInt();
		p.next = null;
		p.next = top;
		top = p;
		return top;
	}
	
	public static Node pop(Node top) {
		if(top==null) {
			System.out.println("Underflow");
			return top;
		}
		top = top.next;
		return top;
	}
	
	public static void display(Node top) {
		Node p;
		p = top;
		if(top==null) {
			System.out.println("Stack is empty");
		}
		else {
			while(p!=null) {
				System.out.print(p.info + " ");
				p = p.next;
			}
		}
	}
}
