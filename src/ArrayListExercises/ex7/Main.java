/*
Write a Java program to search an element in a array list.
 */

package ArrayListExercises.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","pink","blue","yellow","pink");
        list.addAll(elements);
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter string:");
        s=sc.next();

        if (list.contains(s))
            System.out.println("Element is in the list");
        else
            System.out.println("Element is not on the list");
        boolean ok = false;
        System.out.println("Element is on positions:");
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i).equals(s)) {
                System.out.print(i+" ");
                ok=true;
            }
            }
        if (ok==false)
            System.out.print("null");
    }
}
