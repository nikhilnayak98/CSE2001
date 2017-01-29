/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Arithmetic,Geometric and Fibonacci Progression
 */

import java.util.Scanner;

class Progression {
	protected long current;

	Progression() {
		this(0);
	}

	Progression(long curr) {
		current = curr;
	}

	public long nextValue() {
		long nextval = current;
		advance();
		return nextval;
	}

	public void printProgression(int n) {
		for(int i=0;i<n;i++) {
			System.out.print(" " + nextValue());
		}
	}

	protected void advance() {
		current++;
	}
}

class ArithmeticProgression extends Progression {
	protected long increment;

	public ArithmeticProgression() { this(1,0); }

	public ArithmeticProgression(long val) { this(val,0); }

	public ArithmeticProgression(long val1,int s) {
		super(s);
		increment = val1;
	}

	protected void advance() {
		current += increment;
	}

}

class GeometricProgression extends Progression {
	protected long base;

	public GeometricProgression( ) { this(2,1); }

	public GeometricProgression(long b) { this(b,1); }

	public GeometricProgression(long base1,long s) {
		super(s);
		base = base1;
	}

	protected void advance() {
		current *= base;
	}

}

class FibonacciProgression extends Progression {
	protected long prev;

	public FibonacciProgression() { this(0,1); }

	public FibonacciProgression(long first,long second) {
		super(first);
		prev = second-first;
	}

	protected void advance() {
		long temp = prev;
		prev = current;
		current += temp;
	}

}

public class ProgressionProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Arithmetic Progression" + 
						   "\n2.Geometric Progression" +
						   "\n3.Fibonacci Progression");
		int choice = sc.nextInt();
		
		if(choice==1) {
			
			System.out.println("Enter start value - ");
			int start = sc.nextInt();
			System.out.println("Enter increment value - ");
			long val = sc.nextLong();
			System.out.println("Enter number of terms - ");
			int terms = sc.nextInt();
			ArithmeticProgression ap = new ArithmeticProgression(val,start);
			ap.printProgression(terms);
			
		} else if(choice==2) {
			
			System.out.println("Enter base value - ");
			long val = sc.nextLong();
			System.out.println("Enter number of terms - ");
			int terms = sc.nextInt();
			GeometricProgression gp = new GeometricProgression(val);
			gp.printProgression(terms);
			
		} else if(choice==3) {
			
			System.out.println("Enter first number - ");
			int fnum = sc.nextInt();
			System.out.println("Enter second number - ");
			int snum = sc.nextInt();
			System.out.println("Enter number of terms - ");
			int terms = sc.nextInt();
			FibonacciProgression fp = new FibonacciProgression(snum,fnum);
			fp.printProgression(terms);
			
		}
	}

}
