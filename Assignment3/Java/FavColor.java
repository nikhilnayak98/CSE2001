/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Fav Color
 */

public class FavColor {

	public static void main(String[] args) throws Exception {
		String color[] = {"red","blue","green"};
		try {
			if(color.length==0)
				throw new NullPointerException();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch(NullPointerException e) {
			System.out.println(e);
		}

	}

}
