/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Stack
 */
import java.util.Scanner;
public class StackDemo1 {

	public static final int MAX=10;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int stack[]=new int[MAX];
		int top=-1;
		while(true) {
			System.out.println("\n*****MENU*****" +
					"\n 0: Exit" +
					"\n 1: Push" +
					"\n 2: Pop" +
					"\n 3: Display" +
					"\n 4: Check if stack is empty?" +
					"\n 5: Check if stack is full?" +
					"\nEnter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 0: System.exit(0);
			case 1: top = push(stack,top);
			break;
			case 2: top = pop(stack,top);
			break;
			case 3: display(stack,top);
			break;
			case 4: if(isEmpty(top)==true)
						System.out.println("Yes");
					else
						System.out.println("No");
			case 5: if(isFull(top)==true)
						System.out.println("Yes");
					else
						System.out.println("No");
			default:
				System.out.println("Invalid choice");
			}
		}

	}

	public static boolean isEmpty(int top) {
		if(top==-1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isFull(int top) {
		if(top==MAX-1) {
			return true;
		} else {
			return false;
		}
	}

	public static int push(int S[],int top) {
		if(isFull(top)==true) {
			System.out.println("Overflow");
			return top;
		}
		top++;
		System.out.println("Enter value to be inserted - ");
		Scanner sc = new Scanner(System.in);
		int ele = sc.nextInt();
		S[top]=ele;
		return top;
	}

	public static int pop(int S[],int top) {
		if(isEmpty(top)==true) {
			System.out.println("Underflow");
			return top;
		}
		int x = S[top];
		top--;
		return top;
	}
	
	public static void display(int S[],int top) {
		if(isEmpty(top)==true) {
			System.out.println("Stack is empty");
		} else {
			int t = top;
			while(t>-1) {
				System.out.print(S[t] + " ");
				t--;
			}
			System.out.println();
		}
	}

}
