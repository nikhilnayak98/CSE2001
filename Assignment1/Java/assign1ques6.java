import java.util.Scanner;

/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : Finding the smallest and largest numbers in an array of integers and compare that to a java method that would do the same thing.
 */
public class assign1ques6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 integers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		smallAndLarge(arr);
	}
	
	public static void smallAndLarge(int arr[]) {
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}

}
