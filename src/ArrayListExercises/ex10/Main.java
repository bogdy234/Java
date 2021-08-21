/*
Write a Java program to shuffle elements in a array list.
 */

package ArrayListExercises.ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List elements = Arrays.asList("red","yellow","orange","blue","black");
        list.addAll(elements);

        Collections.shuffle(list);
        System.out.println("Shuffled list:"+list);
    }
}
