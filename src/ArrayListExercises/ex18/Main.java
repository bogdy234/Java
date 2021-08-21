/*
Write a Java program to test an array list is empty or not.
 */

package ArrayListExercises.ex18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","blue");
        list.addAll(elements);

        System.out.println(list.isEmpty() ? "List empty":"List not empty");
        list.removeAll(list);
        System.out.println(list.isEmpty() ? "List empty":"List not empty");
    }
}
