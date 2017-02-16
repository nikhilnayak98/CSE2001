/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Partitioning an array using recursion
 */

import java.util.Scanner;

public class ArrayPartition {

	static int i = 0,j; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;

		System.out.println("Enter size of array - ");
		int A[] = new int[sc.nextInt()];

		System.out.println("Enter the elements of array");
		for(int j=0;j<A.length;j++) {
			A[j] = sc.nextInt();
		}

		System.out.println("Array before partition - ");
		for(int j=0;j<A.length;j++) {
			System.out.print(A[j] + " ");
		}

		System.out.println("\nEnter value of k - ");
		k = sc.nextInt();
		j = A.length-1;

		partitionArray(A,k);

		System.out.println("Array after partition - ");
		for(int j=0;j<A.length;j++) {
			System.out.print(A[j] + " ");
		}

	}

	public static void partitionArray(int A[],int k) {
		if((A[i]<=k)&&(i<j))
			i++;
		if((A[j]>k)&&(i<j))
			j--;
		if(i<j) {
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			if(A[i]<=k)
				i++;
			if(A[j]>k)
				j--;
			partitionArray(A,k);
		}
	}

}
