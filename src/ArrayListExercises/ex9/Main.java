/*
Write a Java program to copy one array list into another.
 */

package ArrayListExercises.ex9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","black","orange","blue");
        list.addAll(elements);

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("A");secondList.add("B");secondList.add("C");secondList.add("D");
        System.out.println("Before copy");
        System.out.println("First list:"+list);
        System.out.println("Second list:"+secondList);
        System.out.println("Copy list to secondList");
        Collections.copy(secondList,list);
        System.out.println("First list:"+list);
        System.out.println("Second List:"+secondList);
    }
}
