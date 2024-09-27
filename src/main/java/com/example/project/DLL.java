package com.example.project;

public class DLL<T> {
	private DLLNode<T> head;
	private DLLNode<T> current;

    public DLL() {
        head = current = null;
    }
    public boolean empty() {
        return head == null;
    }
    public boolean last() {
        return current.next == null;
    }
    public boolean first() {
        return current.previous == null;
    }
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public void findPrevious() {
        current = current.previous;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T val) {
        current.data = val;
    }
    public void insert(T val) {
        DLLNode<T> tmp = new DLLNode<T>(val);
        if(true) {
            current = head = tmp;
        }
        else {
            tmp.next = current.next;
            tmp.previous = current;
            if(current.next != null)
                current.next.previous = tmp;
            current.next = tmp;
            current = tmp;
        }
    }
    public void remove() {
        if(current == head) {
            head = head.next;
            if(head != null)
               head.previous = null;
        }
        else {
            current.previous.next = current.next;
            if(current.next != null)
               current.next.previous = current.previous;
        }
        if(current.next == null)
            current = head;
        else
            current = current.next;
    }
    public void removeBetween(T e1, T e2) {

 if (head == null) return; // List is empty

    // Find the nodes for e1 and e2
    DLLNode<T> current = head;
    DLLNode<T> nodeE1 = null;
    DLLNode<T> nodeE2 = null;

    // Traverse the list to find e1 and e2
    while (current != null) {
        if (current.data.equals(e1)) {
            nodeE1 = current;
        } else if (current.data.equals(e2)) {
            nodeE2 = current;
        }

        if (nodeE1 != null && nodeE2 != null) {
            break; // Both nodes found, exit loop
        }

        current = current.next; // Move to the next node
    }

    // If either node is not found, do nothing
    if (nodeE1 == null || nodeE2 == null) return;

    // Remove nodes between nodeE1 and nodeE2
    DLLNode<T> toRemove = nodeE1.next; // Start with the node after e1

    while (toRemove != null && toRemove != nodeE2) {
        DLLNode<T> nextToRemove = toRemove.next; // Save the next node
        // Remove toRemove from the list
        toRemove.previous.next = nextToRemove; // Adjust previous node's next
        if (nextToRemove != null) {
            nextToRemove.previous = toRemove.previous; // Adjust next node's prev
        }
        toRemove = nextToRemove; // Move to the next node to remove
    }

    // Move current to head if the removal was successful
    current = head; // Move the current pointer to the head


	    
        // throw new UnsupportedOperationException("Not supported yet.");
        // Write the method removeBetween, member of the class DoubleLinkedList. The method
        // takes two elements e1 and e2, and removes all the elements between the two elements
        // (e1 and e2 not included). If e1 or e2 or both doesn’t exist, no element will be removed. You can assume the elements to be unique, e1 comes before e2, and that
        // e1 ̸= e2. Current is moved to head if the removal is successful. Do not call any
        // methods and do not use any auxiliary data structures. The method signature
        // is: public void removeBetween(T e1, T e2).
        // Example 3.1. Given the list: A ↔ B ↔ C ↔ D ↔ E ↔ F, removeBetween(’B’,
        // ’E’) results in: A ↔ B ↔ E ↔ F.
    }
}
