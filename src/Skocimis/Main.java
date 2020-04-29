package Skocimis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A,B,C;
        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        System.out.println(max(C-B-1,B-A-1));
    }

    public static int max(int a, int b){
        if (a>b)
            return a;
        return b;
    }
}
