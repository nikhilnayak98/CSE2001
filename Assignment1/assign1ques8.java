import java.util.Scanner;

/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : Take two arrays a and b of length n storing int values, and returns the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1.
 */
public class assign1ques8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20],b[] = new int[20],c[]= new int[20],n;
		System.out.println("Enter length n");
		n=sc.nextInt();
		System.out.println("Enter elements of first array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter elements of second array");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			c[i]=a[i]*b[i];
		}
		
		System.out.println("Array after multiplication");
		for(int i=0;i<n;i++) {
			System.out.println(c[i]);
		}

	}

}
