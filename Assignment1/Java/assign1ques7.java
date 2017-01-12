import java.util.Scanner;

/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : An array of int values and determines if there is a pair of distinct elements of the array whose product is odd.
 */
public class assign1ques7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 integers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		oddProduct(arr);
	}

	public static void oddProduct(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					if((arr[i]*arr[j])%2!=0)
						System.out.println("Elements found - " + arr[i] + ", " + arr[j]);
				}
			}

		}
	}

}
