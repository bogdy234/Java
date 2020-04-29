/*
Big Chandan is a dire lover of Biryani, especially Old Monk's Biryani. Today, he went over to have some of it. To his surprise, the waiter turns out be to be a coding geek and refuses to serves him unless Chandu solves his two- arrays problem, stated as:

Given two non-increasing array of integers A,B i.e A[i] >= A[i+1] and B[i] >= B[i+1] and for all i, 0 ≤ i < n-1.

The monkiness of two numbers is given by: M (A[i],B[j]) = j - i , if j >=i and B[j] >= A[i], or 0 otherwise.


Find the monkiness of the two arrays, that is given by: M (A,B)= max (M(A[i],B[j])) for 0≤ i, j< n-1.

Input Format:
The first line contains an integer, tc, denoting the number of test cases. The next line contains an integer, n, denoting the size of the two arrays. The size of both the arrays will be equal. After that line, the next line contains n integers denoting the numbers in the array A, and in the next line, there will be n numbers denoting the numbers in the array B.

Output format:
Print the monkiness of the two arrays.

Constraints:
1 <= Test Cases <= 50
1 <= N <= 105
1 <= Ai, Bi <= 1012
Input:2
9
7 7 3 3 3 2 2 2 1
8 8 7 7 5 5 4 3 2
6
6 5 4 4 4 4
2 2 2 2 2 2

Output:5
0
 */

package CodeArena.e1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc, n;
        tc = sc.nextInt();
        for (int con = 0; con < tc; con++) {
            long[] A = new long[1000001];
            long[] B = new long[1000001];
            int k = 0;
            int[] M = new int[5000001];
            n = sc.nextInt();
            for (int i = 0; i < n; i++)
                A[i] = sc.nextLong();
            for (int i = 0; i < n; i++)
                B[i] = sc.nextLong();
            int max=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j >= i && B[j] >= A[i]) {
                        M[k] = j - i;
                        if (M[k]>max)
                            max= (int) M[k];
                        k++;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
