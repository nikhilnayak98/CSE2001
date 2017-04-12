/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Singly Linked List
 */
import java.util.*;

class Node {
	protected int reg_no;
	protected double mark;
	protected Node link;
}

public class LinkedList {

	public static void create(Node start) {
		Scanner sc = new Scanner(System.in);
		int option;
		Node p;
		System.out.println("Enter registration number - ");
		start.reg_no = sc.nextInt();
		System.out.println("Enter marks - ");
		start.mark = sc.nextDouble();
		start.link = null;
		p = start;
		System.out.println("Do u want to add more?(0/1)");
		option=sc.nextInt();;
		while(option!=0) {
			p.link = new Node();
			p = p.link;
			System.out.println("Enter registration number - ");
			p.reg_no = sc.nextInt();
			System.out.println("Enter marks - ");
			p.mark = sc.nextDouble();
			p.link = null;
			System.out.println("Do u want to add more?(0/1)");
			option = sc.nextInt();
		}
	}

	public static void display(Node start) {
		Node p = start;
		while(p!=null) {
			System.out.println("\nRegistration No - " + p.reg_no + "\nMarks - " + p.mark);
			p = p.link;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node start = new Node() ;
		int choice,res;
		while(true) {
			System.out.println("\n*****MENU*****" +
					"\n 0: Exit" +
					"\n 1: Create the linked list " +
					"\n 2: Display the linked list " +
					"\n 3: Insert at the beginnning" +
					"\n 4: Insert at the end" +
					"\n 5: Insert at any location" +
					"\n 6: Delete from the beginning" +
					"\n 7: Delete from the end" +
					"\n 8: Delete from any location" +
					"\n 9: Search a registration number " +
					"\n 10: Sort the linked list " +
					"\n 11: Count the no of marks entered in the linked list " +
					"\n 12: Reverse the linked list" +
					"\nEnter your choice ");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Exit");
				System.exit(0);
			case 1:
				create(start);
				break;
			case 2:
				display(start);
				break;
			case 3:
				start=InsBeg(start);
				break;
			case 4:
				start=InsEnd(start);
				break;
			case 5:
				start=InsAny(start);
				break;
			case 6:
				start=DelBeg(start);
				break;
			case 7:
				start=DelEnd(start);
				break;
			case 8:
				start=DelAny(start);
				break;
			case 9:
				search(start);
				break;
			case 10:
				sort(start);
				break;
			case 11:
				res=count(start);
				System.out.println("Total no of nodes = "+res);
				break;
			case 12:
				start=reverse(start);
				break;  
			default:
				System.out.println("\n Wrong choice");

			}
		}
	}

	public static Node InsBeg(Node start) {
		Scanner sc = new Scanner(System.in);
		Node p = new Node();
		if(p==null) {
			System.out.println("Overflow");
		}
		System.out.println("Enter registration number - ");
		p.reg_no = sc.nextInt();
		System.out.println("Enter marks - ");
		p.mark = sc.nextDouble();
		p.link = start;
		start = p;
		return start;
	}

	public static Node InsEnd(Node start) {
		Scanner sc = new Scanner(System.in);
		Node p = start,q;
		while(p.link!=null) {
			p = p.link;
		}
		q = new Node();
		System.out.println("Enter registration number - ");
		q.reg_no = sc.nextInt();
		System.out.println("Enter marks - ");
		q.mark = sc.nextDouble();
		p.link = q;
		q.link = null;
		return start;
	}

	public static Node InsAny(Node start) {
		Scanner sc = new Scanner(System.in);
		Node q,pre = null,p = start;
		int i,loc;
		System.out.println("Enter the location you want to insert - ");
		loc = sc.nextInt();
		i = 1;
		while(i<loc) {
			pre = p;
			p = p.link;
			i++;
		}
		q = new Node();
		System.out.println("Enter registration number - ");
		q.reg_no = sc.nextInt();
		System.out.println("Enter marks - ");
		q.mark = sc.nextDouble();
		q.link = pre.link;
		pre.link = q;
		return start;
	}

	public static Node DelBeg(Node start) {
		Node temp;
		if(start==null) {
			System.out.println("Memory underflow");
			System.exit(0);
		}
		temp = start;
		start = start.link;
		temp.link = null;
		return start;
	}

	public static Node  DelEnd(Node start) {
		Node p = start,temp = null;
		while(p.link!=null) {
			temp = p;
			p = p.link;
		}
		temp.link=null;
		return start;
	}

	public static Node DelAny(Node start) {
		Scanner sc = new Scanner(System.in);
		Node p,temp;
		int loc;
		int i=1;
		p = start;
		temp = null;
		System.out.println("Enter the location number of the registration number to be deleted - ");
		loc = sc.nextInt();
		while(i<loc) {
			temp = p;
			p = p.link;
			i++;
		}
		temp.link = p.link;
		return start;
	}

	public static void search(Node start) {
		Scanner sc = new Scanner(System.in);
		int regno;
		int flag = 0;
		Node p;
		p = start;
		System.out.println("Enter the registration number you want to search - ");
		regno = sc.nextInt();
		while(p!=null) {
			if(p.reg_no==regno) {
				flag = 1;
				break;
			} else {
				p = p.link;
			}
		}

		if(flag==1) {
			System.out.println("Found");
			int c;
			System.out.println("Update marks?(1/0");
			c = sc.nextInt();
			if(c==1) {
				System.out.println("Enter marks - ");
				p.mark = sc.nextDouble();
			}
		} else {
			System.out.println("Not found");
		}
	}

	public static int count(Node start) {
		Node p = start;
		int c = 0;
		while(p!=null) {
			c++;
			p = p.link;
		}
		return c;
	}
	
	public static Node sort(Node start) {
		Node i,j;
		int t1;
		double t2;
		for(i=start;i.link!=null;i=i.link) {
			{
				for(j=start;i.link!=null;j=j.link) {
					if(j.mark>j.link.mark) {
						t1 = j.reg_no;
						t2 = j.mark;
						j.reg_no = j.link.reg_no;
						j.mark = j.link.mark;
						j.link.reg_no = t1;
						j.link.mark = t2;
					}
				}
			}
		}
		return start;
	}
	
	public static Node reverse(Node start) {
		if((start==null)||(start.link==null)) {
			System.out.println("Underflow");
			return start;
		}
		Node p = start.link,q=start,r=null;
		while(p!=null) {
			r = q;
			q = p;
			p = p.link;
			q.link = r;
		}
		start = q;
		return start;
	}

}
