/*
Write a Java program to compare two array lists.
 */

package ArrayListExercises.ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List elements = Arrays.asList("red", "blue", "pink");
        list.addAll(elements);
        List<String> list2 = new ArrayList<String>();
        List elements2 = Arrays.asList("blue", "red","black");
        list2.addAll(elements2);

        List<String> result = new ArrayList<>();

        for (String s:list)
        {
            result.add(list2.contains(s) ? "Yes" : "No");
        }
        System.out.println(result);
    }
}
