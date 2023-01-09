import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Iterator helper class for LinkedList.
 * @author jcochran66
 * @version 1
 * @param <E> generic
 */
public class LinkedListIterator<E> implements Iterator<E> {
    public int currentIndex;
    private Node<E> firstNode;
    public Node<E> currentNode;
    private Node<E> next;


    /**
     * Constructor for LinkedListIterator.
     * @param linkedList list that is linked
     */
    public LinkedListIterator(LinkedList<E> linkedList) {
        if (linkedList.head != null) {
            firstNode = linkedList.head;
            currentNode = firstNode;
            currentIndex = 0;
        }
    }

    @Override
    public boolean hasNext() {
        return currentNode.getNext() == null ? false : true;
    }

    @Override
    public E next() {
        if (currentNode.getNext() == null) {
            currentNode = firstNode;
            currentIndex = 0;
            NoSuchElementException e1 = new NoSuchElementException("\nRan out of elements, looped back to head.");
            throw e1;
        } else {
            currentNode = currentNode.getNext();
            currentIndex++;
            return currentNode.getData();
        }
    }

    /**
     * Setter for index.
     * @param index int
     */
    public void setIndex(int index) throws IndexOutOfBoundsException {
        currentIndex = 0;
        currentNode = firstNode;
        while (currentIndex < index) {
            if (currentNode.hasNext() == true && index >= 0) {
                IndexOutOfBoundsException e1 = new IndexOutOfBoundsException();
                throw e1;
            }
            next();
        }
    }

    /**
     * Getter for current index.
     * @return currentIndex
     */
    public Node<E> getCurrent() {
        return currentNode;
    }


    /**
     * Getter for current index.
     * @return int
     */
    public int getCurrentIndex() {
        return currentIndex;
    }


}