/**
 * Node class containing a string value to be stored in a stack
 *
 * @author Alex Thorrold
 */
public class Node {

    // The string value of the node
    private String string;
    // The next node in the stack
    private Node next;

    /**
     * Constructs a new Node assigning a string value and setting
     * the next node to be null
     * @param string String value to be given to this node
     */
    public Node(String string) {
        this.string = string;
        this.next = null;
    }

    /**
     * Gets the string value of the node
     * @return String value of the node
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the string value of the node
     * @param string String value to give to node
     */
    public void setString(String string) {
        this.string = string;
    }

    /**
     * Gets the next node in the stack
     * @return Next node in the stack
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next node in the stack
     * @param next Node that will be below current node in the stack
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
