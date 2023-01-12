//The code below was taken from the Queue class from MyCourses with changes made for this specific program
public class Queue {
	
	listNode head;
	listNode tail; 
	
	public void enqueue(String arg) {	// Enqueues string on queue. 
		listNode node = new listNode(); // Creates a new node at the tail
		node.data = arg;				// Input data
		node.next = null;				// Pointer is toward null
		if (tail!=null)					// If the queue is not equal to null (empty)
			tail.next = node; 			// Attach a new node to the tail
		else 							// Otherwise
			head = node;				// Let head point to the new node.
		tail = node; 					// Tail should point to new node. 
		
	}
	// The code below was taken from the Queue class from MyCourses with changes made for this specific program
	public String dequeue() {			// Dequeues string from queue. 
		if (head!= null) {				// If the queue is not equal to null (empty)
			listNode temp = head;		// Set temp to head
			String j = head.data;		// Set tail to null.
			head=head.next; 			// Unload data from head
			temp.next = null;			// Set next temp to null
			return j;						
		}								
		else							// If queue is equal to null (if it is empty), return null. 
			return null; 
	}
	
	// The code below was taken from Katrina in the tutorial
	public String toString() {				// Returns a string in which is the concatenation of all tokens in the queue separated by one space. 
		String result = "";
		listNode curr = head;
		while (curr!=null) {
			String data = curr.data; 	// dequeue a node 
			result = result + data + " "; 		// add it to output string
			curr = curr.next;
		}
		return result;
	}
}