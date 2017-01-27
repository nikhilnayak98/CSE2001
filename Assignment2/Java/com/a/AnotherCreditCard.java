/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Credit card bank
 */

package com.a;

import java.util.Scanner;

class CreditCard {

	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;

	public CreditCard(String cust,String bnk,String acc,int lim,double bal) {
		customer=cust;
		bank=bnk;
		account=acc;
		limit=lim;
		balance=bal;
	}
	public CreditCard(String cust,String bnk,String acc,int lim){
		this(cust,bnk,acc,lim,0.0);
	}

	public String getCustomer() {
		return customer;
	}
	public String getbank() {
		return bank;
	}
	public String getAccount() {
		return account;
	}
	public double getBalance() {
		return balance;
	}
	public int getLimit() {
		return limit;
	}

	public void makePayment(double amount) {
		balance-=amount;
	}

	public static void printSummary(CreditCard card) {
		System.out.println("\nSummary" +
						   "\nCustomer - " + card.customer +
						   "\nBank - " + card.bank +
						   "\nAccount - " + card.account +
						   "\nLimit - " + card.limit +
						   "\nBalance - " + card.balance);
	}
}

class PredatoryCreditCard extends CreditCard {
	
	private double apr;
	
	public PredatoryCreditCard(String cust, String bnk, String acc, int lim,double bal,double apr1) {
		super(cust, bnk, acc, lim, bal);
		apr = apr1;
	}
	
	public boolean charge(double price) {
		if((balance+price)>getLimit())
			return false;
		balance+=price;
		return true;
	}
	
	public void processMonth() {
		if (balance > 0) { 
			double monthlyFactor = Math.pow(1 + apr, 1.0/12);
			balance*= monthlyFactor;
		}
	}
}

public class AnotherCreditCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PredatoryCreditCard wallet[] = new PredatoryCreditCard[3];
		char cr;
		int n;
		System.out.println("Enter number of cards ");
		n=sc.nextInt();

		for(int i=0;i<n;i++) {
			System.out.println("Enter details for card - " + (i+1) +
					"\nIn the format Customer,Bank,Account,Limit,Balance,Apr");
			wallet[i] = new PredatoryCreditCard(sc.next(),
												sc.next(),
												sc.next(),
												sc.nextInt(),
												sc.nextDouble(),
												sc.nextDouble());
		}

		System.out.println("Credit balance y/n?");
		cr = sc.next().charAt(0);
		if(cr=='y'||cr=='Y'){
			for(int i=0;i<n;i++) {
				System.out.println("\nCharge Credit Card " + (i+1));
				wallet[i].charge(sc.nextInt());
			}
		}
		
		System.out.println("Make Payment y/n?");
		cr = sc.next().charAt(0);
		if(cr=='y'||cr=='Y'){
			for(int i=0;i<n;i++) {
				System.out.println("\nPayment from Credit Card " + (i+1));
				wallet[i].makePayment(sc.nextDouble());
			}
		}
		
		System.out.println("Apr y/n?");
		cr = sc.next().charAt(0);
		if(cr=='y'||cr=='Y'){
			for(int i=0;i<n;i++) {
				System.out.println("\nCredit card " + (i+1));
				wallet[i].processMonth();
				System.out.println("New Balance in Credit card " + (i+1));
				System.out.println(wallet[i].getBalance());
			}
		}

		for(int i=0;i<n;i++) {
			System.out.println("\nWallet " + (i+1));
			CreditCard.printSummary(wallet[i]);
		}

	}

}
