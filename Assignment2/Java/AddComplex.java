/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Complex number addition
 */

import java.util.Scanner;

class Complex {
	private int real;
	private int img;

	public Complex(){}

	public Complex(int r,int i) {
		real=r;
		img=i;
	}
	public static Complex add(Complex c1,Complex c2) {
		Complex c3 = new Complex();
		c3.real=c1.real+c2.real;
		c3.img=c1.img+c2.img;

		return c3;
	}

	void display() {
		System.out.println(this.real + "i + " + this.img);
	}

}

public class AddComplex
{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real1");
		int r1 = sc.nextInt();
		System.out.println("Enter image1");
		int i1 = sc.nextInt();
		System.out.println("Enter real2");
		int r2 = sc.nextInt();
		System.out.println("Enter image2");
		int i2 = sc.nextInt();

		Complex c1= new Complex(r1,i1);
		Complex c2 = new Complex(r2,i2);
		Complex c4 = Complex.add(c1, c2);
		c4.display();
	}
}
