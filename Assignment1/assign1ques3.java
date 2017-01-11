/*
 * Author: Nikhil Ranjan Nayak
 * Regd.no: 1641012040
 * Branch & Sec: CSE 'F'
 * Brief Desc: Possible strings from a given set of charaters using permutations.
 */

public class assign1ques3 {

	public static void main(String[] args) {
		char arr[] = {'c','a','r','b','o','n'};
		String str = new String(arr);
		findAllWords("",str);
	}

	public static void findAllWords(String permuted, String word) {
		if (word.equalsIgnoreCase("")) {
			System.out.println(permuted + word);
		} 
		else {
			for (int i = 0;i<word.length();i++) {
				findAllWords((permuted + word.charAt(i)), (word.substring(0,i) + word.substring(i+1,word.length())));
			}
		}

	}

}
