/*
Write a Java program to iterate a linked list in reverse order.
 */

package LinkedListExercises.ex4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List elements = Arrays.asList("red","pink","blue");
        LinkedList<String> list = new LinkedList<>(elements);

        for (int i=list.size()-1;i>=0;i--)
            System.out.println(list.get(i));

        //sau
       /* Iterator it = list.descendingIterator();
        while (it.hasNext())
            System.out.println(it.next());*/
    }
}
