
/**
 * Data structure to store strings using an array list.
 * @author kpoulin
 *
 */
public class TinyArrayList {

	listNode head = null;
	int size = 0;
	
	/**
	 * Adds a node with string data in the TinyArrayList.
	 * @param in String to add
	 */
	public void add (String in) {
		listNode node = new listNode();
		node.data = in;
		node.next = null;
		
		if(head == null) {
			head = node;
		} else {
			listNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		size++;
	}
	
	/**
	 * Unboxes the nodes in the linked list and stores
	 * them into an array.
	 * @return Data in array form
	 */
	public String[] toArray() {
		String[] result = new String[size];
		listNode temp = head;
		
		for (int i = 0; i < size; i++) {
			result[i] = temp.data;
			temp = temp.next;
		}
		return result;
	}
	
	class listNode {
		String data;
		listNode next;
	}
}
