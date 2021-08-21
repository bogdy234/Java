/*
Write a Java program to insert elements into the linked list at the first and last position.
 */

package LinkedListExercises.ex6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List elements = Arrays.asList("red","pink","blue");
        LinkedList<String> list = new LinkedList<>(elements);

        String head,tail;
        Scanner sc = new Scanner(System.in);

        System.out.println("Element to be inserted on the head:");
        head=sc.next();
        System.out.println("Element to be inserted on the tail:");
        tail=sc.next();

        System.out.println("List before insertion:"+list);

        list.addFirst(head);
        list.addLast(tail);

        System.out.println("List after insertion:"+list);
    }
}
