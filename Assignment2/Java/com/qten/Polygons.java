package com.qten;
/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Date:
 * Brief Desc:
 */

import java.util.Scanner;

interface Polygon {
	void area();
	void perimeter();
}

class Triangle implements Polygon {
	double s1,s2,s3;
	
	Triangle(double s1,double s2,double s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	public void area() {}
	
	public void perimeter() {
		System.out.println("Perimeter - " + (s1+s2+s3));
	}
}

class Pentagon implements Polygon {
	
	double s1,s2,s3,s4,s5,area,perimeter;
	
	Pentagon(double s1) {
		this.s1 = s1;
		this.s2 = s1;
		this.s3 = s1;
		this.s4 = s1;
		this.s5 = s1;
	}

	public void area() {
		area = (5*s1*s1)/(4.0*Math.tan(Math.PI/5));
		System.out.println("Area - " + area);
	}

	public void perimeter() {
		System.out.println("Perimeter - " + (s1*5));
	}
}

class Hexagon implements Polygon {
	double s1,s2,s3,s4,s5,s6,area,perimeter;
	
	Hexagon(double s1) {
		this.s1 = s1;
		this.s2 = s1;
		this.s3 = s1;
		this.s4 = s1;
		this.s5 = s1;
		this.s6 = s1;
	}

	public void area() {
		area = (3*Math.sqrt(3.0)*s1*s1)/2;
		System.out.println("Area - " + area);
	}

	public void perimeter() {
		System.out.println("Perimeter - " + (s1*6));
	}
}

class Octagon implements Polygon {
	
	double s1,s2,s3,s4,s5,s6,s7,s8,area,perimeter;
	
	Octagon(double s1) {
		this.s1 = s1;
		this.s2 = s1;
		this.s3 = s1;
		this.s4 = s1;
		this.s5 = s1;
		this.s6 = s1;
		this.s7 = s1;
		this.s8 = s1;
	}

	public void area() {
		area = 2*(1+Math.sqrt(2.0))*s1*s1;
		System.out.println("Area - " + area);
	}

	public void perimeter() {
		System.out.println("Perimeter - " + (s1*8));
	}
}

class Quadrilateral implements Polygon {
	double s1,s2,s3,s4;
	
	Quadrilateral(double s1,double s2,double s3,double s4) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}
	
	public void area() {}
	
	public void perimeter() {
		System.out.println("Perimeter - " + (s1+s2+s3+s4));
	}
}

class EquilateralTriangle extends Triangle {

	EquilateralTriangle(double s1) {
		super(s1, s1, s1);
	}
	
	public void area() {
		double area = Math.sqrt(3.0)*s1*s1/4;
		System.out.println("Area - " + area);
	}
	
}

class IsoscelesTriangle extends Triangle {

	IsoscelesTriangle(double s1, double base) {
		super(s1, s1, base);
	}
	
	public void area() {
		double area = (1/2)*s3*Math.sqrt(((s1*s1)-((s3*s3)/4)));
		System.out.println("Area - " + area);
	}
	
}

class Rectangle extends Quadrilateral {

	Rectangle(double s1, double s2) {
		super(s1, s2, s1, s2);
	}
	
	public void area() {
		double area = s1*s2;
		System.out.println("Area - " + area);
	}
	
}

class Square extends Quadrilateral {

	Square(double s1) {
		super(s1,s1,s1,s1);
	}
	
	public void area() {
		double area = s1*s1;
		System.out.println("Area - " + area);
	}
	
}

public class Polygons {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Triangle" + 
						"\n2.Quadrilateral" +
						"\n3.Pentagon" +
						"\n4.Hexagon" +
						"\n5.Octagon");
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("i.Equilateral Triangle" +
							"\nii.Isoceles Triangle");
			String c = sc.next();
			if(c.equals("i")) {
				System.out.println("Enter side - ");
				double side = sc.nextDouble();
				EquilateralTriangle equilateralTriangle = new EquilateralTriangle(side);
				equilateralTriangle.perimeter();
				equilateralTriangle.area();
			} else if(c.equals("ii")) {
				System.out.println("Enter side - ");
				double side = sc.nextDouble();
				System.out.println("Enter base - ");
				double base = sc.nextDouble();
				IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(side, base);
				isoscelesTriangle.perimeter();
				isoscelesTriangle.area();
			}
			
		} else if(choice==2) {
			System.out.println("i.Rectangle" +
							"\nii.Square");
			String c = sc.next();
			if(c.equals("i")) {
				System.out.println("Enter length -");
				double s1 = sc.nextDouble();
				System.out.println("Enter breadth -");
				double s2 = sc.nextDouble();
				Rectangle rectangle = new Rectangle(s1, s2);
				rectangle.perimeter();
				rectangle.area();
			} else if(c.equals("ii")) {
				System.out.println("Enter side -");
				double side = sc.nextDouble();
				Square square = new Square(side);
				square.perimeter();
				square.area();
			}
			
		} else if(choice==3) {
			System.out.println("Enter regular pentagon side - ");
			double s = sc.nextDouble();
			Pentagon pentagon = new Pentagon(s);
			pentagon.perimeter();
			pentagon.area();
		} else if(choice==4) {
			System.out.println("Enter regular hexagon side - ");
			double s = sc.nextDouble();
			Hexagon hexagon = new Hexagon(s);
			hexagon.perimeter();
			hexagon.area();
		} else if(choice==5) {
			System.out.println("Enter regular octagon side - ");
			double s = sc.nextDouble();
			Octagon octagon = new Octagon(s);
			octagon.perimeter();
			octagon.area();
		}
	}

}
