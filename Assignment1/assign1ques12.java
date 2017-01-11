import java.util.Scanner;

/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : Flower class
 */

class Flower {
	String name;
	int petals;
	double price;
	
	void setData(String n,int p,double pr) {
		name = n;
		petals = p;
		price = pr;
	}
	
	void displayData() {
		System.out.println("Name of flower - " + name);
		System.out.println("No of petals - " + petals);
		System.out.println("Price - " + price);
	}
}

public class assign1ques12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Flower ob = new Flower();
		String name;
		int petals;
		double price;
		System.out.println("Enter name of flower");
		name = sc.next();
		System.out.println("Enter no of petals");
		petals = sc.nextInt();
		System.out.println("Enter price");
		price = sc.nextDouble();
		ob.setData(name,petals,price);
		ob.displayData();
	}

}
