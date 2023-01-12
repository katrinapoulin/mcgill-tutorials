public class Queue {

	void enqueue(int arg) {
		listNode node = new listNode();	// Create new node at rear
		node.data=arg;					// Insert data
		node.next=null;					// Node points to null
		if (rear!=null)					// If queue not empty
			rear.next=node;				// attach new node to end
		else							// of chain, otherwise
			front=node;					// make front point to new node.
		rear=node;						// In either case, rear points
	}									// to new node.
	
	Integer dequeue() {
		if (front!=null) {				// If queue is not empty, check
			if (front==rear) rear=null;	// if this is the last nod and set
			listNode temp = front;
			Integer j = front.data;		// rear to null.  In all non empty cases, unload data from front
			front=front.next;	
			temp.next = null;
			return j;					// and move front to next node in line.
		}
		else							// If queue is empty, return null.
			return null;
	}
	
	private class listNode {			// Can define the listNode class within
		int data;						// the Queue class (nested class).
		listNode next;
	}
	
	public void remove(int value) {
		// find the node
		listNode curr = front;
		while(curr.next.data != value) {
			curr=curr.next;
		}
		// at this point, curr is the node we want to remove
		// at this point, curr is the node pointing to the node to remove
		curr.next = curr.next.next;
		
	}
	
	listNode front=null;				// Instance variables are the front
	listNode rear=null;					// and rear pointers.
}


