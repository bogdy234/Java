/*
 Write a Java program to remove the third element from a array list.
 */

package ArrayListExercises.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","blue","yellow");
        list.addAll(elements);

        list.remove(2);
        System.out.println(list);
    }
}
