package org.example.linked_list.interview_questions.has_loop;

public class Main {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        boolean result = myList.hasLoop(); // Output: false
        System.out.println(result);

        // Manually create a loop for testing purposes
        myList.getHead().next.next.next = myList.getHead().next;

        result = myList.hasLoop(); // Output: true
        System.out.println(result);

    }

}
