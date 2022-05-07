/**
 * Stack class which stores strings that can be accessed only in FIFO order
 *
 * @author Alex Thorrold
 */
public class Stack {

    // Head node in the stack
    private Node head;

    /**
     * Constructs a new Stack with no nodes
     */
    public Stack() {
        head = null;
    }

    /**
     * Pushes a string on to the top of the stack
     * @param x String to be added to the stack
     */
    public void push(String x) {
        if (x == null) {
            return;
        }

        Node n = new Node(x);
        n.setNext(head);
        head = n;
    }

    /**
     * Pops the top string on the stack
     * @return The popped string
     */
    public String pop() {
        if (head == null) {
            return null;
        }

        Node n = head;
        head = head.getNext();
        return n.getString();
    }

    /**
     * Gets the top string on the stack without removing it
     * @return The top string on the stack
     */
    public String peek() {
        if (head == null) {
            return null;
        }

        return head.getString();
    }

    /**
     * Checks whether the stack is empty or not
     * @return Whether the stack is empty or not
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Gets the length of the stack
     * @return The length of the stack
     */
    public int length() {
        return rLength(head);
    }

    /**
     * Counts the passed node in the stack and recursively calls
     * itself to count all nodes below in the stack
     * @param n The current node being counted
     * @return The length of the stack from the current node down
     */
    private int rLength(Node n) {
        // Returns 0 if the bottom of the stack has been reached
        if (n == null) {
            return 0;
        }

        return 1 + rLength(n.getNext());
    }

    /**
     * Writes all strings in the stack to console
     */
    public void dump() {
        rDump(head);
    }

    /**
     * Writes the passed node's string to console then recursively calls
     * itself to write all strings below in the stack to console
     * @param n The current node having string written to console
     */
    private void rDump(Node n) {
        // Returns if the bottom of the stack has been reached
        if (n == null) {
            return;
        }

        System.out.println(n.getString());
        rDump(n.getNext());
    }
}
