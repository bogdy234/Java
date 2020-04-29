package Shattered_Cake;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w,n,wi,li,Area=0;
        w=sc.nextInt();
        n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            wi=sc.nextInt();
            li=sc.nextInt();
            Area = Area + wi*li;
        }
        int l;
        l=Area / w;
        System.out.println(l);
    }
}
