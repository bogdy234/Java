/*
Write a Java program to replace the second element of a ArrayList with the specified element.
 */

package ArrayListExercises.ex21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","blue");
        list.addAll(elements);

        Scanner sc = new Scanner(System.in);
        String specifiedElement;
        System.out.println("Enter the string:");
        specifiedElement=sc.next();
        System.out.println("List before replacement:"+list);
        list.set(1,specifiedElement);
        System.out.println("List after replacement:"+list);
    }
}
