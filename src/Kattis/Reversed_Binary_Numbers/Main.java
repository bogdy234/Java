package Kattis.Reversed_Binary_Numbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N, k;
		int[] binaryNumber = new int[100];
		int elements, result = 0;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		elements = decimalToBinaryReversed(N, binaryNumber);
		k = elements - 1;
		for (int i = 0; i < elements; i++) {
			result += binaryNumber[i] * Math.pow(2, k);
			k--;
		}
		System.out.println(result);
		sc.close();
	}

	public static int decimalToBinaryReversed(int n, int[] binaryNumber) {
		int i = 0;
		while (n != 0) {
			binaryNumber[i] = n % 2;
			i++;
			n = n / 2;
		}
		return i;
	}

}
