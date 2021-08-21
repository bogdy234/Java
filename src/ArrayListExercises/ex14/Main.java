/*
Write a Java program of swap two elements in an array list.
 */

package ArrayListExercises.ex14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","blue","green") ;
        list.addAll(elements);

        int firstIndex,secondIndex;
        Scanner sc = new Scanner(System.in);
        System.out.println("First index:");
        firstIndex=sc.nextInt();
        System.out.println("Second index:");
        secondIndex=sc.nextInt();

        System.out.println("List:"+list);

        String aux=list.get(firstIndex);
        list.set(firstIndex,list.get(secondIndex));
        list.set(secondIndex,aux);
        // sau Collections.swap(list,firstIndex,secondIndex);

        System.out.println("Now list look like:"+list);
    }
}
