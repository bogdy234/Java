package Kattis.Parking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, C;
        int[] time1 = new int[101];
        int[] time2 = new int[101];
        int[] time3 = new int[101];

        for (int i = 1; i <= 100; i++) {
            time1[i] = 0;
            time2[i] = 0;
            time3[i] = 0;
        }
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        int number1, number2, number3, number4, number5, number6;
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        number4 = sc.nextInt();
        number5 = sc.nextInt();
        number6 = sc.nextInt();
        for (int i = number1; i < number2; i++) {
            time1[i]=1;
        }
        for (int i = number3; i < number4; i++) {
            time2[i]=1;
        }
        for (int i = number5; i < number6; i++) {
            time3[i]=1;
        }
        int sum=0;
        for (int i=1;i<=100;i++){
            if (time1[i]==1 && time2[i]==1 && time3[i]==1)
                sum=sum+3*C;
            if (time1[i]==1 && time2[i]==1 && time3[i]==0 || time1[i]==1 && time2[i]==0 && time3[i]==1 || time1[i]==0 && time2[i]==1 && time3[i]==1)
                sum=sum+2*B;
            if (time1[i]==1 && time2[i]==0 && time3[i]==0 || time1[i]==0 && time2[i]==1 && time3[i]==0 || time1[i]==0 && time2[i]==0 && time3[i]==1)
                sum=sum+A;
        }

        System.out.println(sum);
    }
}
