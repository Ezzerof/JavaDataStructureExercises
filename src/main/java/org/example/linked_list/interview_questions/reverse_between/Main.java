package org.example.linked_list.interview_questions.reverse_between;

public class Main {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        myList.reverseBetween(1,3);
        System.out.println(myList);


    }

}
