// The code below was taken from the Stack class from MyCourses with changes made for this specific program
public class Stack {

	listNode top; 
	
	public void push(String arg) {			// Pushes string onto stack
		//new ListNode
		listNode node = new listNode();		// creates a new node					
		node.data = arg;					// fill data
		node.next = top;					// link to rest of the stack
		top = node;							// pointer should now be toward the new node
		 
	}
	
	public String pop() {					// Pops string from the satck 
		//String popped = top.data
		if (top==null) return null;			// check if stack=null (if it is empty)
		String data = top.data;				// in other scenario, get at top
		top=top.next;						// top becomes next item
		return data;						// returns our data
	}
}