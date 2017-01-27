/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Point Calculate
 */

import java.util.Scanner;

class PointType {
	double x,y;
	
	void setXPoint(double x1) {
		x = x1;
	}
	
	void setYPoint(double y1) {
		y = y1;
	}
	
	double getXPoint() {
		return x;
	}
	
	double getYPoint() {
		return y;
	}
}

class CircleType extends PointType {
	double radius;
	
	void setRadius(double r) {
		radius = r;
	}
	
	void displayRadius() {
		System.out.println("Radius - " + radius);
	}
	
	void calArea() {
		double area = Math.PI*radius*radius;
		System.out.println("Area - " + area);
	}
	
	void calCircum() {
		double circum = 2*Math.PI*radius;
		System.out.println("Circumference - " + circum);
	}
	
	
}


public class PointCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircleType ob = new CircleType();
		System.out.println("Enter x coordinate - ");
		ob.setXPoint(sc.nextDouble());
		System.out.println("Enter y coordinate - ");
		ob.setYPoint(sc.nextDouble());
		System.out.println("Enter radius - ");
		ob.setRadius(sc.nextDouble());
		ob.calArea();
		ob.calCircum();
	}

}
