/**
 * <h2>Node object</h2>
 * <p>Creating nodes for the list</p>
 * @author antoinephan
 */
public class listNode
{
    String data;
    listNode next;

    listNode(String data) //constructing a node with a given data String
    {
        this.data = data;
        this.next = null;
    }
}
