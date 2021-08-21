/*
Write a Java program to insert an element into the array list at the first position.
 */

package ArrayListExercises.ex3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(1,5,7,10,24);
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(elements);
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Elementul care se doreste introdus pe prima pozitie:");
        x = sc.nextInt();

        list.add(x);
        for (int i=list.size()-1;i>0;i--)
        {
            list.set(i,list.get(i-1));
        }
        list.set(0,x);
        System.out.println(list);

        // sau
        int y;
        System.out.println("Alt element ce se doreste a fi introdus pe prima pozitie:");
        y=sc.nextInt();
        list.add(0,y);
        System.out.println(list);
    }
}
