package org.example.linked_list.interview_questions.find_middle_node;

public class Main {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList(1);

        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        LinkedList.Node middleNode = myList.findMiddleNode();
        System.out.println(middleNode.value); // Output: 3

        myList.append(6);
        middleNode = myList.findMiddleNode();
        System.out.println(middleNode.value); // Output: 4

    }

}
