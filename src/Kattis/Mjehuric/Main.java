package Kattis.Mjehuric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] pieces = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
            pieces[i] = sc.nextInt();
       while (!isSorted(pieces,pieces.length)) {
           for (int i = 0; i < pieces.length - 1; i++) {
               if (pieces[i] > pieces[i + 1]) {
                   int aux = pieces[i];
                   pieces[i] = pieces[i + 1];
                   pieces[i + 1] = aux;
                   for (int j = 0; j < pieces.length; j++)
                       System.out.print(pieces[j] + " ");
                   System.out.println();
               }
           }
       }
    } //end main

    public static boolean isSorted(int[] a,int n) {
        for (int i=0;i<n-1;i++)
            if (a[i]>a[i+1])
                return false;
            return true;
    }
} //end class
