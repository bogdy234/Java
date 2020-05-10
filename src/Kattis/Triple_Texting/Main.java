package Kattis.Triple_Texting;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s;
		String s1,s2, s3;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		s1 = s.substring(0, s.length() / 3);
		s2 = s.substring(s.length() / 3, 2 * s.length() / 3);
		s3 = s.substring(2 * s.length() / 3, s.length());
		if (s1.equals(s2))
			System.out.println(s1);
		else if (s1.equals(s3))
			System.out.println(s1);
		else if (s2.equals(s3))
			System.out.println(s2);
		sc.close();
	}
}
