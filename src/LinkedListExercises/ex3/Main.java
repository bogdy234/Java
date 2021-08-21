/*
Write a Java program to iterate through all elements in a linked list starting at the specified position.
 */

package LinkedListExercises.ex3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List elements = Arrays.asList("red","pink","blue");
        LinkedList<String> list = new LinkedList<>(elements);

        Scanner sc = new Scanner(System.in);
        System.out.println("Specify position:");
        int position = sc.nextInt();

        Iterator it = list.listIterator(position);
        while (it.hasNext())
            System.out.println(it.next());
    }
}
