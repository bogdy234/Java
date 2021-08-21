/*
Write a Java program to clone an array list to another array list.
 */

package ArrayListExercises.ex16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","blue");
        list.addAll(elements);

        ArrayList<String> secondList=(ArrayList<String>)list.clone();
        System.out.println("First list:"+list);
        System.out.println("Cloned list:"+secondList);
    }
}
