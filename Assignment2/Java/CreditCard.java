/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Credit Card
 */

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

	public boolean charge(double price) {
		if((balance+price)>limit)
			return false;
		balance+=price;
		return true;
	}

	public static void printSummary(CreditCard card) {
		System.out.println("\nSummary" +
						   "\nCustomer - " + card.customer +
						   "\nBank - " + card.bank +
						   "\nAccount - " + card.account +
						   "\nLimit - " + card.limit +
						   "\nBalance - " + card.balance);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char cr;
		int n;
		System.out.println("Enter number of cards ");
		n=sc.nextInt();
		
		CreditCard wallet[] = new CreditCard[n];

		for(int i=0;i<n;i++) {
			System.out.println("Enter details for card - " + (i+1) +
					"\nIn the format Customer,Bank,Account,Limit,Balance");
			wallet[i] = new CreditCard(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
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

		for(int i=0;i<n;i++) {
			System.out.println("\nWallet " + (i+1));
			CreditCard.printSummary(wallet[i]);
		}
	}

}
