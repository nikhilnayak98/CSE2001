import java.util.Scanner;

/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : Odd even without division and modulus operator
 */
public class assign1ques5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=sc.nextInt();
		boolean status = isOdd(num);
		if(status==true)
			System.out.println("Odd");
		else
			System.out.println("Even");
	}
	
	public static boolean isOdd(int i) {
		while(i>=1) {
			i-=2;
		}
		if(i==0)
			return false;
		else
			return true;
	}

}
