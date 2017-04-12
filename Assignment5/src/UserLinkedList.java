import java.util.LinkedList;

class Numbers {
	int num;
}

public class UserLinkedList {

	public static void main(String[] args) {
		Numbers ob = new Numbers();
		LinkedList linkedList = new LinkedList();
		linkedList.add(ob);
		System.out.println(linkedList.get(0));
	}

}
