/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Double Linked List
 */
import java.util.*;

class Node {
	protected int regd_no;
	protected double mark;
	protected Node link;
	protected Node prev;
}

public class DLinkedList {

	public static Node create(Node start) {
		Scanner sc = new Scanner(System.in);
		Node p = new Node();
		System.out.println("Enter registration number - ");
		p.regd_no = sc.nextInt();
		System.out.println("Enter marks - ");
		p.mark = sc.nextDouble();
		p.link = p.prev = null;
		start = p;
		System.out.println("Want to add more?");
		char op = sc.next().charAt(0);

		while(op=='y') {
			Node q = new Node();
			System.out.println("Enter registration number - ");
			q.regd_no = sc.nextInt();
			System.out.println("Enter marks - ");
			q.mark = sc.nextDouble();
			q.link = q.prev = null;
			p.link = q;
			q.prev = p;
			p = q;
			System.out.println("Want to add more?");
			op = sc.next().charAt(0);
		}
		return start;
	}

	public static void display(Node start) {
		Node p = start;
		while(p!=null) {
			System.out.println("Registration number - " + p.regd_no +
					"\nMarks - " + p.mark);
			p = p.link;
		}
	}

	public static Node insBeg(Node start, Node end) {
		Scanner sc = new Scanner(System.in);
		Node p = new Node();
		System.out.println("Enter registration number - ");
		p.regd_no = sc.nextInt();
		System.out.println("Enter marks - ");
		p.mark = sc.nextDouble();
		p.link = p.prev = null;
		if(start==null) {
			start = end = p;
		} else {
			p.link = start;
			start.prev = p;
			p.prev = null;
			start = p;
		}
		return start;
	}

	public static Node insEnd(Node start, Node end) {
		Scanner sc = new Scanner(System.in);
		Node p = new Node();
		System.out.println("Enter registration number - ");
		p.regd_no = sc.nextInt();
		System.out.println("Enter marks - ");
		p.mark = sc.nextDouble();
		p.link = p.prev = null;
		if(start==null) {
			start = end = p;
		} else {
			end.link = p;
			p.prev = end;
			p.link = null;
			end = p;
		}
		return start;
	}

	public static Node insAny(Node start, Node end) {
		Scanner sc = new Scanner(System.in);
		int c = count(start);
		System.out.println("Enter location - ");
		int loc = sc.nextInt();
		if(loc>=1&&loc<c+1) {
			Node p = new Node();
			System.out.println("Enter registration number - ");
			p.regd_no = sc.nextInt();
			System.out.println("Enter marks - ");
			p.mark = sc.nextDouble();
			p.link = p.prev = null;
			if(start!=null) {
				if(loc==1) {
					p.link = start;
					start.prev = p;
					p.prev = null;
					start = p;
				} else {
					Node q = start;
					int cnt =1;
					while(cnt<loc-1) {
						q = q.link;
						cnt++;
					}
					p.link = q.link;
					q.link.prev = p;
					q.link = p;
					p.prev = q;
				}
			} else if(loc==1)
				start = end = p;
		}
		return start;
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

	public static void search(Node start) {
		Scanner sc = new Scanner(System.in);
		int regno;
		int flag = 0;
		Node p;
		p = start;
		System.out.println("Enter the registration number you want to search - ");
		regno = sc.nextInt();
		while(p!=null) {
			if(p.regd_no==regno) {
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

	public static Node delBeg(Node start, Node end) {
		if(start==null) {
			System.out.println("Underflow");
			return start;
		}
		if(start.link==null)
			start=end=null;
		else {
			start=start.link;
			start.prev=null;
		}
		return start;
	}

	public static Node delEnd(Node start, Node end) {
		if(start==null) {
			System.out.println("Underflow");
			return start;
		}
		if(start.link==null)
			start=end=null;
		else {
			end=end.prev;
			end.link=null;
		}
		return start;
	}

	public static Node delAny(Node start, Node end) {
		if(start==null) {
			System.out.println("Underflow");
			return start;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Input location - ");
		int loc = sc.nextInt();
		int c= count(start);
		if(loc>=1&&loc<=c) {
			if(loc==1) {
				if(start.link==null)
					start=end=null;
				else {
					start=start.link;
					start.prev=null;
				}
			}
			else if(loc==c) {
				if(start.link==null)
					start=end=null;
				else {
					end=end.prev;
					end.link=null;
				}
			}
			else {
				Node p = start;
				int cnt = 1;
				while(cnt<loc) {
					cnt++;
					p=p.link;
				}
				p.prev.link=p.link;
				p.link.prev=p.prev;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node start=null,end=null;
		int choice,res;
		while(true) {
			System.out.println("\n*****MENU*****" +
					"\n 0: Exit" +
					"\n 1: Create the linked list " +
					"\n 2: Display the linked list" +
					"\n 3: Insert at the beginnning" +
					"\n 4: Insert at the end" +
					"\n 5: Insert at any location" +
					"\n 6: Delete from the beginning" +
					"\n 7: Delete from the end" +
					"\n 8: Delete from any location" +
					"\n 9: Search a registration number " +
					"\n 10: Count the no of marks entered in the linked list " +
					"\nEnter your choice ");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Exit");
				System.exit(0);
			case 1:
				start = create(start);
				Node r = start;
				while(r.link!=null) {
					r = r.link;
				}
				end = r;
				break;
			case 2:
				display(start);
				break;
			case 3:
				start=insBeg(start,end);
				break;
			case 4:
				start=insEnd(start,end);
				break;
			case 5:
				start=insAny(start,end);
				break;
			case 6:
				start=delBeg(start,end);
				break;
			case 7:
				start=delEnd(start,end);
				break;
			case 8:
				start=delAny(start,end);
				break;
			case 9:
				search(start);
				break;
			case 10:
				res=count(start);
				System.out.println("Total no of nodes = " + res);
				break;
			default:
				System.out.println("\nWrong choice");

			}

		}
	}
}
