package Kattis.Help_a_PhD_candidate_out;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N; // numarul de cazuri
        int a = 0,b = 0; // numerele
        int j; // contorul
        String str; // sirul citit de la tastatura(linia)
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            str = sc.next();
            if (str.charAt(0) == 'P')
                System.out.println("skipped");
            else {
                j=0;
                while(str.charAt(j)!='+') // cat timp caracterul citit e diferit de +
                {
                    a = a*10+Integer.parseInt(String.valueOf(str.charAt(j))); // construieste numarul
                    j++; // incrementeaza contorul
                }
                j++; // incrementeaza contorul ca sa sara peste +
                for (int k = j;k<str.length();k++) // de la caracterul curent pana la lungimea randului citit
                {
                    b = b*10+Integer.parseInt(String.valueOf(str.charAt(k))); // construieste al doilea numar
                }
                System.out.println(a+b); // afiseaza suma
                a=0; // reinitializeaza
                b=0; // reinitializeaza
            }
        }
    }
}
