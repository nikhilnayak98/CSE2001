/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Different types of array
 */

public class ArrayTypes {

	public static void main(String[] args) {
		Integer A[] = {1,2,3,4,5};
		Double B[] = {10.1,56.1,45.6,12.9};
		String C[] = {"string1","string2","string3","string4"};

		printArray(A);
		printArray(B);
		printArray(C);
	}
	
	public static <E> void printArray(E[] inputArray) {
		System.out.println("Array Elements - ");
		for(int i=0;i<inputArray.length;i++) {
			System.out.println(inputArray[i]);
		}
	}

}
