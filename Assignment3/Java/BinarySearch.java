/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Binary Search using recursion
 */

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5],elem;
		System.out.println("Enter elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nEnter number to be searched - ");
		elem = sc.nextInt();

		int index = bSearch(arr,0,arr.length-1,elem);
		if(index==-1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Element found at index - " + (index+1));
		}
	}

	public static int bSearch(int A[],int lb,int ub,int num) {
		int mid;

		if(lb>ub)
			return -1;

		mid = (lb+ub)/2;

		if(A[mid]==num)
			return mid;
		else if(A[mid]>num)
			return bSearch(A,lb,mid-1,num);
		else if(A[mid]<num)
			return bSearch(A,mid+1,ub,num);
		return 0;
	}

}
