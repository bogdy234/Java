/*
Write a Java program to sort a given array list.
 */

package ArrayListExercises.ex8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","black","blue");
        list.addAll(elements);

        Collections.sort(list);
        System.out.println("Sorted list:"+list);
    }
}
