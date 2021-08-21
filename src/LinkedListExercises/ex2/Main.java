/*
Write a Java program to iterate through all elements in a linked list.
 */

package LinkedListExercises.ex2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List elements = Arrays.asList("red","pink","blue");
        LinkedList<String> list = new LinkedList<>(elements);

        Iterator it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
    }
}
