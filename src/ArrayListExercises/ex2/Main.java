/*
Write a Java program to iterate through all elements in a array list.
 */

package ArrayListExercises.ex2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> otherlist = Arrays.asList(2,4,6,7,8,10);
        list.addAll(otherlist);
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
