import java.util.Scanner;

/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : The number of times one must repeatedly divide this number by 2 before getting a value less than 2.
 */
public class assign1ques2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,i=0;
		System.out.println("Enter a number greater than 2");
		num=sc.nextInt();
		if(num>2) {
			while(num>2) {
				num/=2;
				i++;
			}
		}
		else
			System.out.println("Enter a number greater than 2");

		System.out.println("total number of times the number should be divided by 2 is " + i);
	}

}
