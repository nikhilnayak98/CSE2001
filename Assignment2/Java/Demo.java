/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Commision
 */

import java.util.Scanner;

class Commision {
	private double sales;
	private double comm;

	Commision(double s){
		sales=s;
	}

	public double getCommision() {
		if(sales<0){
			comm=-1;
		} else if(sales<500) {
			comm=sales*0.02;
		} else if(sales>500 && sales<5000) {
			comm=sales*0.05;
		} else if(sales>5000) {
			comm=sales*0.08;
		}
		return comm;
	}
}
public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sales ");
		double sales = sc.nextDouble();
		Commision c = new Commision(sales);

		double comm = c.getCommision();
		if(comm==-1) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("Commision - " + comm);
		}
	}

}
