//?

package Kattis.Prozor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int R, S, K;
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        S = sc.nextInt();
        K = sc.nextInt();
        char[][] picture = new char[R][S];
        String s;
        sc.nextLine();
        for (int i = 0; i < R; i++) {
                s=sc.next();
                s.getChars(0,S,picture[i],0);
        }

    }
}
