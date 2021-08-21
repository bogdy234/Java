/*
Write a Java program to reverse elements in a array list.
 */

package ArrayListExercises.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("pink","blue","white","indigo");
        list.addAll(elements);

        Collections.reverse(list);
        System.out.println("Reversed list:"+list);
    }
}
