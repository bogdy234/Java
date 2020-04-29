package Soda_Slurper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e,f,c,rez,sum=0,rest;
        e = sc.nextInt();
        f = sc.nextInt();
        c = sc.nextInt();

        rez = e + f;

        while (rez >= c)
        {
            rest = rez % c;
            rez = rez / c;
            sum=sum+rez;
            rez = rez+rest;
        }
        System.out.println(sum);
        sc.close();
    }

}