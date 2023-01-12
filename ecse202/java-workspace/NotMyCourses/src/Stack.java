/**
 <h2>Stack class</h2>
 <p>Required to export the following methods: </p>
 <ul><code>public void push(String arg)</code></ul>
 <ul><code>public String pop()</code></ul>
 @author antoinephan
 */
public class Stack //This is just a String stack
{
    listNode top;
    int size;

    /**
     * <p>
     *     THE CONSTRUCTOR OF STACK
     * </p>
     */
    Stack()
    {
        this.top = null;
        this.size = 0;
    }

    /**
     * <p>
     *     Push a String to the Stack
     * </p>
     * @param arg data as a String to push into the Stack
     */
    public void push(String arg)
    {
        listNode newNode = new listNode(arg);
        newNode.next = this.top;
        this.top = newNode;
        this.size++;
    }


    /**
     * <p>
     *     Pop the top element of a Stack
     * </p>
     * @return the top element data (as a String)
     */
    public String pop()
    {
        if(this.size==0) //if the Stack is empty
            return null;

        listNode temp = this.top;
        this.top = this.top.next;
        temp.next = null;

        size--;
        return temp.data;
    }
}
