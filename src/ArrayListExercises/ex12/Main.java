/*
Write a Java program to extract a portion of a array list.
 */

package ArrayListExercises.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List elements = Arrays.asList("black","blue","indigo","red");
        list.addAll(elements);

        Scanner sc = new Scanner(System.in);
        int firstIndex,secondIndex;
        System.out.println("First index:");
        firstIndex=sc.nextInt();
        System.out.println("Second index:");
        secondIndex=sc.nextInt();
        List<String> sub_List;
        sub_List = list.subList(firstIndex,secondIndex);
        System.out.println("Sublist:"+sub_List);
    }
}
