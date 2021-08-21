/*
Write a Java program to retrieve an element (at a specified index) from a given array list.
 */

package ArrayListExercises.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","blue","yellow");
        list.addAll(elements);
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Index:");
        index=sc.nextInt();
        System.out.println(list.get(index));
    }
}
