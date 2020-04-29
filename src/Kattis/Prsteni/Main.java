package Kattis.Prsteni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] radius = new int[101];
        for (int con = 0; con < N; con++) {
            radius[con] = sc.nextInt();
        }

        for (int i=1;i<N;i++)
        {
            int cmmdc = cmmdc(radius[i],radius[0]);
            System.out.println(radius[0]/cmmdc+"/"+radius[i]/cmmdc);
        }
    }

    public static int cmmdc(int a,int b)
    {
        if (a==0)
            return b;
        while (b!=0)
        {
            if (a>b) a-=b;
            else b-=a;
        }
        return a;
    }
}
