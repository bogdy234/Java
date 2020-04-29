package Quick_Brown_Fox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        char[] letters = new char[27];
        char x = 'a';
        int[] nr = new int[27];
        for (int i = 0; i < 26; i++) {
            letters[i] = x;
            x++;
        }
        String s;
        n = sc.nextInt();
        sc.nextLine();

        for (int con = 0; con < n; con++) {
            for (int i = 0; i < 26; i++)
                nr[i] = 0;
            s = sc.nextLine();
            s=s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    if (s.charAt(i)==letters[j])
                    {
                        nr[j]++;
                    }
                }
            }
            boolean ok = true;
            for (int i = 0; i < 26; i++) {
                if (nr[i] == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok==true)
                System.out.println("pangram");
            else
            {
                System.out.print("missing ");
                for (int i=0;i<26;i++)
                    if (nr[i]==0)
                        System.out.print(letters[i]);
                System.out.println();
            }
        }
    }
}
