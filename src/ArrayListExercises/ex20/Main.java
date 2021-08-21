/*
Write a Java program to increase the size of an array list.
 */
package ArrayListExercises.ex20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","blue");
        list.addAll(elements);
        System.out.println("Before increasing size:"+list);
        list.ensureCapacity(6);
        list.add("yellow");
        list.add("white");
        list.add("green");
        System.out.println("After increasing size:"+list);
    }
}
