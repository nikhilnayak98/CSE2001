/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Array elements count
 */

public class ArrayCount {

	public static void main(String[] args) {
		Integer A[] = {1,2,3,4,5};
		Double B[] = {10.1,56.1,45.6,12.9};
		String C[] = {"string1","string2","string3","string4"};

		System.out.println(count(A,1));
		System.out.println(count(B,10.1));
		System.out.println(count(C,"string1"));

	}

	public static <T> int count(T[] array, T item) {
		int ctr = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;i<array.length;i++) {
				if(array[i]==array[j])
					ctr++;
			}
		}
		return ctr;
	}

}
