/*
Write a Java program to trim the capacity of an array list the current list size.
 */

package ArrayListExercises.ex19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","blue");
        list.addAll(elements);

        list.trimToSize();
    }
}
