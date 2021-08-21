/*
Write a Java program to empty an array list.
 */

package ArrayListExercises.ex17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","blue");
        list.addAll(elements);
        System.out.println("List before remove:"+list);
        list.removeAll(list);
        System.out.println("List after remove:"+list);
    }
}
