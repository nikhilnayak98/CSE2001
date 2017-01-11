import java.util.Scanner;

/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : Point class
 */

class Point {
	Scanner sc = new Scanner(System.in);
	double x,y;
	void setPoint() {
		System.out.println("Enter x coordinate");
		x=sc.nextDouble();
		System.out.println("Enter y coordinate");
		y=sc.nextDouble();
	}
}
public class assign1ques11 {

	public static void main(String[] args) {
		Point ob = new Point();
		Point ob1 = new Point();
		ob.setPoint();
		ob1.setPoint();
		double dist = findDistance(ob,ob1);
		System.out.println("Distance - " + dist);
	}
	
	public static double findDistance(Point ob,Point ob1) {
		double distance = Math.sqrt(((ob.x-ob1.x)*(ob1.x-ob.x))-((ob1.y-ob.y)*(ob1.y-ob.y)));
		return distance;
	}

}
