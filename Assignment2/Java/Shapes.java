/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Shapes
 */

import java.util.Scanner;

abstract class Shape {
	abstract double calArea();
}

class Square extends Shape {
	double s;
	Square(double s1){s=s1;}
	double calArea() {
		double area = s*s;
		return area;
	}

}

class Circle extends Shape {
	double r;
	Circle(double r1){r=r1;}
	double calArea() {
		double area = Math.PI*r*r;
		return area;
	}
}

class Triangle extends Shape {
	double b,h;
	Triangle(double b1,double h1) {
		b = h1;
		h = h1;
	}
	double calArea() {
		double area = 0.5*b*h;
		return area;
	}

}
public class Shapes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter shape " + 
						  "\n1. Square " +
						  "\n2. Circle " +
						  "\n3. Triangle");
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("Enter side");
			double side = sc.nextDouble();
			Square square = new Square(side);
			double area = square.calArea();
			System.out.println("Area = " + area);
		} else if(choice==2) {
			System.out.println("Enter radius");
			double radius = sc.nextDouble();
			Circle circle = new Circle(radius);
			double area = circle.calArea();
			System.out.println("Area = " + area);
		} else if(choice==3) {
			System.out.println("Enter height");
			double height = sc.nextDouble();
			System.out.println("Enter base");
			double base = sc.nextDouble();
			Triangle triangle = new Triangle(base,height);
			double area = triangle.calArea();
			System.out.println("Area = " + area);
		}

	}

}
