/*
Write a Java program to update specific array element by given element.
 */

package ArrayListExercises.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red", "pink", "blue", "yellow");
        list.addAll(elements);
        Scanner sc = new Scanner(System.in);
        String s;
        int index;
        System.out.println("Index you want to change:");
        index = sc.nextInt();
        System.out.println("Element:");
        s=sc.next();
        list.set(index,s);
        System.out.println(list);
    }
}
