public class MyLinkedListTest {
    public static void main(String[] args) {
        // Create a new linked list
        MyLinkedList linkedList = new MyLinkedList();

        // Add elements to the linked list
        linkedList.addAtHead(5);
        linkedList.addAtHead(10);
        linkedList.addAtTail(20);
        linkedList.addAtIndex(2, 15);

        // Print the values of the nodes in the linked list
        System.out.println("Linked List: " + linkedList.toString());

        // Get the value of the node at index 2
        int value = linkedList.get(2);
        System.out.println("Value at index 2: " + value);

        // Delete the node at index 1
        linkedList.deleteAtIndex(1);

        // Print the updated linked list
        System.out.println("Updated Linked List: " + linkedList.toString());
    }
}