/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Singly Linked List
 */
import java.util.Scanner;

class Node {
	int info;
	Node link;
}

public class LinkedList {

	public static Node create(Node start) {
		Scanner sc = new Scanner(System.in);
		Node p = new Node();
		System.out.println("Enter info - ");
		p.info = sc.nextInt();
		p.link = null;
		start = p;
		System.out.println("Want to add more?(0/1)");
		int o = sc.nextInt();
		while(o==1) {
			Node q = new Node();
			System.out.println("Enter info - ");
			q.info = sc.nextInt();
			q.link = null;
			p.link = q;
			p = q;
			System.out.println("Do u want to add more?(0/1)");
			o = sc.nextInt();
		}
		return start;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node start = new Node();
		int choice,res;
		while(true) {
			System.out.println("\n*****MENU*****" +
					"\n 0: Exit" +
					"\n 1: Creation" +
					"\n 2: Display" +
					"\n 3: Insert at the beginnning" +
					"\n 4: Insert at the end" +
					"\n 5: Insert at any location" +
					"\n 6: Delete from the beginning" +
					"\n 7: Delete from the end" +
					"\n 8: Delete from any location" +
					"\n 9: Search a node" +
					"\n 10: Sort the linked list" +
					"\n 11: Count the no of nodes in the linked list" +
					"\n 12: Reverse the linked list" +
					"\nEnter your choice\n");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Exit");
				System.exit(0);
			case 1:
				start=create(start);
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
				Node q = new Node();
				System.out.println("Enter key");
				int key = sc.nextInt();
				q=search(start,key);
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


	public static void display(Node start) {
		Node p = start;
		while(p!=null) {
			System.out.println("\nInfo - " + p.info);
			p = p.link;
		}
	}

	public static Node InsBeg(Node start) {
		Node p = new Node();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter info - ");
		p.info = sc.nextInt();
		p.link = start;
		start = p;
		return start;
	}

	public static Node InsEnd(Node start) {
		Scanner sc = new Scanner(System.in);
		Node p = new Node();
		System.out.println("Enter info - ");
		p.info = sc.nextInt();
		p.link = null;
		if(start==null)
			start=p;
		else {
			Node q = start;
			while(q.link!=null) {
				q = q.link;
			}
			q.link = p;
		}
		return start;
	}

	public static Node InsAny(Node start) {
		Scanner sc = new Scanner(System.in);
		int c = count(start);
		Node p = new Node();
		p.info = sc.nextInt();
		p.link = null;
		System.out.println("Input node number - ");
		int loc = sc.nextInt();

		if(loc>=1&&loc<=c+1) {
			Node q = start;
			int cnt = 1;
			while(cnt<loc-1) {
				cnt++;
				q = q.link;
			}
			if(loc==1) {
				p.link = start;
				start = p;
			}
			else {
				p.link = q.link;
				q.link = p;
			}
		}
		return start;
	}

	public static Node DelBeg(Node start) {
		if(start==null) {
			System.out.println("Underflow");
			return null;
		}
		start = start.link;
		return start;
	}

	public static Node DelEnd(Node start) {
		if(start==null) {
			System.out.println("Underflow");
			return null;
		}
		Node p = start;
		if(start.link==null)
			start = null;
		else {
			while(p.link.link!=null) {
				p = p.link;
			}
			p.link = null;
		}
		return start;
	}

	public static Node DelAny(Node start) {
		Scanner sc = new Scanner(System.in);
		if(start==null) {
			System.out.println("Underflow");
			return null;
		}
		System.out.println("Enter node to be deleted - ");
		int loc = sc.nextInt();
		int c = count(start);

		if(loc>=1&&loc<=c) {
			if(loc==1) {
				start = start.link;
			}
			else {
				Node p = start,q = null;
				int cnt = 1;
				while(cnt<loc) {
					cnt++;
					q = p;
					p = p.link;
				}
				q.link = p.link;
			}
		}
		return start;
	}

	public static int count(Node start) {
		Node p = start;
		int ctr = 0;
		while(p!=null) {
			ctr++;
			p = p.link;
		}
		return ctr;
	}

	public static Node search(Node start,int key) {
		Node p = start;
		while(p!=null) {
			if(p.info==key) {
				return p;
			}
			p = p.link;
		}
		return null;
	}

	public static Node reverse(Node start) {
		if(start==null) {
			System.out.println("Underflow");
			return null;
		}
		else if(start.link==null) {
			System.out.println("Cant reverse with one node");	
			return start;
		}
		else {
			Node q = start,p = start.link,r = null;
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

	public static void sort(Node start) {
		Node i,j;
		int t;
		for(i = start;i.link!=null;i=i.link) {
			for(j = start;j.link!=null;j=j.link) {
				if(j.info>j.link.info) {
					t= j.info;
					j.info = j.link.info;
					j.link.info = t;
				}
			}
		}
	}

}
