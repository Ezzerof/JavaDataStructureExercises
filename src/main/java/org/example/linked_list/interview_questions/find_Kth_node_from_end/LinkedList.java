package org.example.linked_list.interview_questions.find_Kth_node_from_end;

public class LinkedList {
    /**
     * Implement a method called findKthFromEnd that returns the k-th node from the end of the list.
     * If the list has fewer than k nodes, the method should return null.
     */
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

        return false;
    }

//    public Node findKthFromEnd(int k) {
//        Node temp = head;
//        int count = 1;
//
//        while (temp.next != null) {
//            temp = temp.next;
//            count++;
//        }
//
//        if (k > count)
//            return null;
//
//        k -= 1;
//        count -= k;
//        temp = head;
//
//        for (int i = 1; i < count; i++) {
//            temp = temp.next;
//        }
//
//        return temp;
//    }

    // By using slow and fast
    public Node findKthFromEnd(int k) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < k; i++) {
            if (fast == null)
                return null;
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }


}
