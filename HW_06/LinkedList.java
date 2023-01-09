import java.util.NoSuchElementException;
import java.util.Iterator;

/**
 * Linked List Implementation.
 * @param <E> generic
 * @author jcochran66
 * @version 1
 */
public class LinkedList<E> implements List<E> {

    public int size;
    public Node<E> head;

    /**
     * Constructor for LinkedList.
     * @param array array
     */
    public LinkedList(E[] array) {
        this.size = array.length;
        for (int i = 0; i < size - 1; i++) {
            this.add(array[i]);
        }
    }

    /**
     * Constructor for LinkedList.
     */
    public LinkedList() {
        this(null);
        size = 0;
    }

    @Override
    public void add(E element) throws IllegalArgumentException {
        if (element != null) {
            if (head != null) {
                Node<E> copyHead = head;
                Node<E> newHead = new Node<>(element, copyHead);
                head = newHead;
                size++;
            } else {
                head = new Node<>(element, null);
            }
        } else {
            IllegalArgumentException e1 = new IllegalArgumentException();
            throw e1;
        }
    }

    @Override
    public void add(int index, E element) throws IllegalArgumentException, IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            if (element != null) {
                LinkedListIterator<E> iterate = new LinkedListIterator<>(this);
                iterate.setIndex(index + 1);
                Node<E> newNode = new Node<E>(element, iterate.currentNode);
                iterate.setIndex(index - 1);
                iterate.currentNode.setNext(newNode);
            } else {
                IllegalArgumentException e1 = new IllegalArgumentException();
                throw e1;
            }
        } else {
            IndexOutOfBoundsException e1 = new IndexOutOfBoundsException();
            throw e1;
        }
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            LinkedListIterator iterate = new LinkedListIterator<>(this);
            iterate.setIndex(index);
            Node<E> temp1 = (Node<E>) iterate.getCurrent();
            iterate.next();
            Node<E> temp2 = (Node<E>) iterate.getCurrent();
            iterate.setIndex(index - 1);
            iterate.currentNode.setNext(temp2);
            return temp1.getData();
        } else {
            IndexOutOfBoundsException e1 = new IndexOutOfBoundsException();
            throw e1;
        }
    }

    @Override
    public E remove(E element) throws IllegalArgumentException, NoSuchElementException {
        if (element != null) {
            int targetIndex = 0;
            LinkedListIterator iterate = new LinkedListIterator<>(this);
            if (iterate.getCurrent() != element) { //checks index 0
                while (iterate.currentIndex < size - 1) {
                    if (iterate.next() == element) {
                        targetIndex = iterate.currentIndex;
                        break;
                    }
                }
            } else {
                targetIndex = 0;
            }
            if (iterate.currentIndex == size - 1 && iterate.currentNode.getData() != element) {
                NoSuchElementException e1 = new NoSuchElementException();
                throw e1;
            }
            Node<E> temp1 = iterate.getCurrent();
            if (iterate.next() != null) {
                iterate.next();
                Node<E> temp2 = iterate.getCurrent();
                iterate.setIndex(targetIndex - 1);
                iterate.currentNode.setNext(temp2);
            }
            return temp1.getData();

        } else {
            IllegalArgumentException e1 = new IllegalArgumentException();
            throw e1;
        }
    }

    @Override
    public E remove() {
        LinkedListIterator iterate = new LinkedListIterator<>(this);
        iterate.setIndex(0);
        Node<E> removed = iterate.currentNode;
        E returnVal = removed.getData();
        iterate.next();
        head = iterate.currentNode;
        return returnVal;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            LinkedListIterator iterate = new LinkedListIterator<>(this);
            iterate.setIndex(index); //setIndex throws index out of bounds if needed
            Node<E> removed = iterate.currentNode;
            E returnVal = removed.getData();

            return returnVal;
        } else {
            IndexOutOfBoundsException e1 = new IndexOutOfBoundsException();
            throw e1;
        }
    }

    @Override
    public boolean contains(E element) throws IllegalArgumentException {
        boolean found = false;
        if (element != null) {
            LinkedListIterator iterate = new LinkedListIterator<>(this);
            if (iterate.getCurrent() != element) { //checks index 0
                while (iterate.currentIndex < size - 1) {
                    if (iterate.next() == element) {
                        found = true;
                        break;
                    }
                }
            } else {
                return true;
            }
            return found;
        } else {
            IllegalArgumentException e1 = new IllegalArgumentException();
            throw e1;
        }
    }


    @Override
    public E set(int index, E element) {
        if (element != null) {
            LinkedListIterator iterate = new LinkedListIterator<>(this);
            iterate.setIndex(index);
            Node<E> currentNode = iterate.currentNode;
            E temp = currentNode.getData();
            return currentNode.getData();

        } else {
            IllegalArgumentException e1 = new IllegalArgumentException();
            throw e1;
        }
    }

    @Override
    public void clear() {
        head.setData(null);
        head.setNext(null);
    }

    @Override
    public boolean isEmpty() {
        return (head.getData() != null || head.getNext() != null);
    }

    @Override
    public Iterator<E> iterator() {
        //Iterator<E> i1 = new LinkedListIterator<>(this);
        return new LinkedListIterator<E>(this);
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Method to remove duplicates.
     */
    public void removeDuplicates() {
        Node<E> currentNode = head; // start at the head
        LinkedListIterator iterate = new LinkedListIterator<>(this);
        if (size != 0 && currentNode != null) { // while there are nodes
            while (iterate.currentNode.getNext() != null) {
                if (iterate.currentNode.getNext().getData().equals(currentNode.getData())) { // checks if the next node is the same as the current node
                    remove(iterate.currentIndex + 1); // remove the next node
                } else {
                    iterate.next(); // move to the next node
                }
            }
            iterate.setIndex(0);
            currentNode = currentNode.getNext(); // move right, current node is not a duplicate
        }
    }


    /**
     * Turns linked list into array.
     * @return array
     */
    public E[] toArray() {
        E[] arr = (E[]) new Object[size];
        LinkedListIterator<E> iterate = new LinkedListIterator<>(this);
        for (int i = 0; i < size; ++i) {
            arr[i] = (E) iterate.currentNode.getData();
            if (i == size - 1) {
                break;
            }
            iterate.next();
        }
        return arr;
    }


}
