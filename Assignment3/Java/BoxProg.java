/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Use of Function Template
 */

class Box<T> {
	T a;
	
	void setData(T x) {
		a= x;
	}
	
	void displayData() {
		System.out.println(a);
	}
}

public class BoxProg {
	
	public static void main(String args[]) {
		Box<Integer> ob = new Box<Integer>();
		Box<Double> ob1 = new Box<Double>();
		Box<String> ob2 = new Box<String>();
		
		ob.setData(100);
		ob.displayData();
		ob1.setData(50.6);
		ob1.displayData();
		ob2.setData("Hello World");
		ob2.displayData();
	}
}
