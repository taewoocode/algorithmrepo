package solution;

import java.util.Scanner;

public class 디버깅오류 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int testCase = sc.nextInt();
        int answer = 0;
        int[] A = new int[100000];
        int[] S = new int[100001];
        for (int i = 0; i < 10000; i++) {
            A[i] = (int) (Math.random() * Integer.MIN_VALUE);
            S[i] = S[i - 1] + A[i];
        }
        for (int t = 1; t < testCase; t++) {
            int query = sc.nextInt();
            for (int i = 0; i < query; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                answer += S[end] - S[start - 1];
                System.out.println( testCase + " " + answer );
            }
        }
    }
}
