/*
Write a Java program to create a new array list, add some colors (string) and print
out the collection.
 */

package ArrayListExercises.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors= new ArrayList<String>();
        colors.add("red");
        colors.add("black");colors.add("yellow");
        System.out.println(colors);
    }
}
