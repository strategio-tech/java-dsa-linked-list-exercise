# DSA Linked List Exercise

> :warning: This is a GitHub Classroom assignment! You need to use the invite URL that was provided to you to get a customized repo. 


This exercise is written in Java, and tested with Gradle/JUnit.

Take a look at the `Main`, `Node`, and `LinkedList` classes. You will see that we've built an implementation of a Linked List that holds numbers but did NOT use `java.util.LinkedList`. 

You'll note the LinkedList has a default constructor, but also allows an input of an array that will convert it into a linked list:

```java
int[] arrInput = { 1, 2, 3 };
LinkedList ll = new LinkedList(arrInput);
ll.display();  // 1 -> 2 -> 3
```

Additionally, the LinkedList has some fields:
- `head`: A pointer to the head of the LinkedList
- `tail`: A pointer to the tail of the LinkedList
- `size`: an int of the number of items in the LinkedList

The LinkedList has some methods as well:

- `insertEnd(val)`: inserts a node with a value `val` at the end of the list (the tail)
- `display()`: displays all the nodes from head to tail as a string
- `remove(n)`: removes the nth index of the Linked List with n as an integer.
- ~~`countUniqueItems()`: returns an integer containing the # of the unique items in the LinkedList~~

Your assignment is to complete `counteUniqueItems()` such that the method returns an integer containing the number of unique items in the LinkedList and the tests pass:

```java
int[] arrInput = { 23, 71, 23, 71 };
LinkedList ll = new LinkedList(arrInput);
System.out.println(ll.countUniqueItems()); // 2
ll.display(); // 23 -> 71 -> 23 -> 71
```

## To submit the assignment

Submit a Pull Request which should trigger the autograding process.

## Notes

- You can run your unit tests in a Java IDE or via command line (`gradle test`) 