/*
Write a Java program to join two array lists.
 */

package ArrayListExercises.ex15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> secondList = new ArrayList<>();

        List elements1 = Arrays.asList("red","pink","blue");
        List elements2 = Arrays.asList("yellow","green","indigo");

        list.addAll(elements1);
        secondList.addAll(elements2);

        List<String> result = new ArrayList<>();
        result.addAll(list);
        result.addAll(secondList);
        System.out.println("First list:"+list);
        System.out.println("Second list:"+secondList);
        System.out.println("Merged list:"+result);
    }
}
