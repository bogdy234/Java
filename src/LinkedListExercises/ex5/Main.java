/*
Write a Java program to insert the specified element at the specified position in the linked list.
 */

package LinkedListExercises.ex5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List elements = Arrays.asList("red","pink","blue");
        LinkedList<String> list = new LinkedList<>(elements);

        int position;
        String element;
        Scanner sc = new Scanner(System.in);

        System.out.println("Position:");
        position=sc.nextInt();
        System.out.println("Element:");
        element=sc.next();

        System.out.println("List before insert:"+list);
        list.add(position,element);
        System.out.println("List after insert:"+list);
    }
}
