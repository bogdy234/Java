/*
Write a Java program to append the specified element to the end of a linked list.
 */

package LinkedListExercises.ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List elements = Arrays.asList("red","pink","blue");
        LinkedList<String> list = new LinkedList<>(elements);
        Scanner sc = new Scanner(System.in);
        System.out.println("List before insert:"+list);
        System.out.println("Element to be inserted:");
        list.add(sc.next());
        System.out.println("List after insert:"+list);

    }
}
