package tech.strategio;

public class Main {
    public static void main(String[] args) {
        int[] arrInput = { 2, 1, 2, 1 };
        LinkedList ll = new LinkedList(arrInput);
        ll.display();
        int noDupes = ll.countUniqueItems();
        System.out.println("unique items: " + noDupes);
    }
}