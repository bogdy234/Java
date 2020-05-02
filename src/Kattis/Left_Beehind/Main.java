package Kattis.Left_Beehind;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            if (x==0 && y==0)
                break;
            if (x+y==13)
                System.out.println("Never speak again.");
            else if (x>y)
                System.out.println("To the convention.");
            else if (x<y)
                System.out.println("Left beehind.");
            else System.out.println("Undecided.");
        }
    }
}
