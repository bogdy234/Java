package Kattis.One_Chicken_Per_Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        if (M > N) {
            int dif = M - N;
            if (dif != 1)
                System.out.println("Dr. Chaz will have " + dif + " pieces of chicken left over!");
            else
                System.out.println("Dr. Chaz will have " + dif + " piece of chicken left over!");
        }
        if (N > M) {
            int dif = N - M;
            if (dif != 1)
                System.out.println("Dr. Chaz needs " + dif + " more pieces of chicken!\n");
            else
                System.out.println("Dr. Chaz needs " + dif + " more piece of chicken!\n");

        }
    }
}
