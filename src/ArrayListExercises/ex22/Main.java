/*
Write a Java program to print all the elements of a ArrayList using the position of the elements.
 */

package ArrayListExercises.ex22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","blue");
        list.addAll(elements);

        for (int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
}
