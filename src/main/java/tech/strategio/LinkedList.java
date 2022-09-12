package tech.strategio;

/**
 * NOTE: we are very purposely not using java.util.LinkedList.
 */
public class LinkedList {
    int size;
    Node head;
    Node tail;

    public LinkedList() {
        size = 0;
        // Init the list with a 'dummy' node which makes removing a node from the beginning of list easier
        // for remove().
        head = new Node(-1);
        tail = head;
    }

    /**
     * Use Constructor overloading so that we can also create a Linked List from an array;
     * It'll go through each array and then insert the element at the head.
     * @param inputArray - an array of ints that will be converted to a list
     */
    public LinkedList(int[] inputArray) {
        this(); // Run lines 12-16 first.
        for (int i : inputArray){
            insertEnd(i);
        }
    }

    /**
     * Inserts a value at the END (the tail) of the linked list.
     * @param val - the value of the new linked list node
     */
    public void insertEnd(int val) {
        tail.next = new Node(val);
        size = size + 1;
        tail = tail.next;
    }

    /**
     * Display all nodes of the LinkedList, starting
     * at the head and then going to the tail.
     */
    public void display() {
        Node curr = head.next;
        while (curr != null) {
            System.out.print(curr.value);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    /**
     * Removes the nth index of the linked list.
     * For example, remove(0) on 1 -> 2 -> 3 would make the linked list 2 -> 3.
     * @param index: the index of the linked list to remove
     */
    public void remove(int index) {
        int i = 0;
        Node curr = head;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }

        // Remove the node ahead of curr
        if (curr != null) {
            curr.next = curr.next.next;
        }
    }

    /**
     * Find the number of non-repeating linked list items
     * @return an int of non-repeating numbers in a linked list
     */
    public int countUniqueItems() {
        // FIX ME!
        return -1;
    }
}
