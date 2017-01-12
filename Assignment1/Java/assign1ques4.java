import java.util.Scanner;

/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Desc : Reversing the lines
 */
public class assign1ques4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line[]=new String[30];
		int i,k,ctr=0;
		System.out.println("Enter the number of lines");
		i=sc.nextInt();
		for(k=0;k<i;k++) {
			line[k]=sc.next();
			ctr++;
		}

		for(k=ctr-1;k>=0;k--) {
			System.out.println(line[k]);
		}
	}

}
