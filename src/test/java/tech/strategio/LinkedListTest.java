package tech.strategio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    void returnsSameItem () {
        int[] arrInput = { 1 };
        LinkedList ll = new LinkedList(arrInput);
        int noDupes = ll.countUniqueItems();
        assertEquals(noDupes, 1);
    }

    @Test
    void returnsSameItem2 () {
        int[] arrInput = { 1, 2 };
        LinkedList ll = new LinkedList(arrInput);
        int noDupes = ll.countUniqueItems();
        assertEquals(noDupes, 2);
    }

    @Test
    void return2Items1 () {
        int[] arrInput = { 1, 2, 1 };
        LinkedList ll = new LinkedList(arrInput);
        int noDupes = ll.countUniqueItems();
        assertEquals(noDupes, 2);
    }

    @Test
    void returns2Items2 () {
        int[] arrInput = { 2, 1, 2, 1 };
        LinkedList ll = new LinkedList(arrInput);
        int noDupes = ll.countUniqueItems();
        assertEquals(noDupes, 2);
    }

    @Test
    void returnsUniqueItemsOnLargeArray () {
        int[] arrInput = { 32, 16, 90, 13, 0, 80, 20, 92, 77, 77, 25, 9, 73, 100, 63, 55, 34, 17, 17, 74, 83, 59, 39, 9, 53, 52, 84, 63, 34, 46, 25, 85, 7, 43, 18, 94, 34, 53, 61, 7, 76, 33, 95, 65, 30, 90, 84, 72, 0, 88, 17, 95, 58, 81, 100, 72, 66, 87, 43, 24, 6, 5, 82, 62, 93, 86, 54, 88, 59, 61, 2, 92, 40, 83, 82, 25, 60, 38, 58, 21, 62, 12, 13, 98, 48, 56, 100, 78, 83, 61, 81, 66, 72, 39, 75, 45, 26, 81, 59, 91 };
        LinkedList ll = new LinkedList(arrInput);
        int noDupes = ll.countUniqueItems();
        assertEquals(noDupes, 64);
    }
}
