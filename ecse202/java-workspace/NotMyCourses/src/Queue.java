/**
 * <h2>Queue class</h2>
 * <p>Required to export the following methods: </p>
 * <ul><code>public void enqueue(String arg)</code></ul>
 * <ul><code>public String dequeue()</code></ul>
 * <ul><code>public String toString()</code></ul>
 * @author antoinephan
 */
public class Queue //a String queue!!
{
    listNode head;
    listNode tail;
    int size;

    /**
     * <p>THE CONSTRUCTOR</p>
     */
    Queue()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * <p>
     *     Enqueue a String on to a queue.
     * </p>
     * <p>
     *     UPDATE 220310: Change the head & tail for the logic of a <b>normal</b> queue.
     *     Previous implementation was flipped.
     * </p>
     * @param arg the String that needs to be enqueued (data)
     */
    public void enqueue(String arg)
    {
        listNode newNode = new listNode(arg);
        if(this.size == 0)
        {
            this.head = newNode;
            this.tail = newNode;
        }
        else
        {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    /**
     * <p>
     *     Dequeues data (a String) from the queue
     * </p>
     * @return data as String
     */
    public String dequeue()
    {
        listNode temp = this.head; //using a temporary listNode; temp points at what <del>tail</del> head is pointing
        if(this.size == 0) //if the Queue is empty
            return null;

        else if(this.size == 1) //if there is only 1 entry in the queue (head == tail : same address)
        {
            this.head = null; //update head
            this.tail = null; //update tail
        }
        else
        {
            this.head = this.head.next;
            temp.next = null;
        }
        this.size--;
        return temp.data;
    }

    /**
     * <p>
     *     For this method, I will use a listNode pointer called "current"
     * 	   that iterates the queue and get the data to be concatenated to the
     *     output string on the screen. In this way, the current queue
     *     will not be affected whenever.
     * </p>
     * @return output value when printing Queue is called, giving the queue instead of its address
     */
    @Override
    public String toString() //Overriding Object.toString()
    {
        String output = "";
        listNode current = this.head;
        while (current!=null)
        {
            output += current.data + (" ");
            current = current.next;
        }
        return output;
    }
}
