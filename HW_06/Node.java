/**
 * Node helper class for LinkedList.
 * @author jcochran66
 * @version 1
 * @param <T> generic
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    /**
     * Constructor for Node.
     * @param data generic
     * @param next Node
     */
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Getter for data.
     * @return data
     */
    public T getData() {
        return data;
    }

    /**
     * Getter for next.
     * @return next
     */
    public Node<T> getNext() {
        return next;
    }


     /**
     * setter for data.
     * @param data T
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Setter for next.
     * @param next Node
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }


}
