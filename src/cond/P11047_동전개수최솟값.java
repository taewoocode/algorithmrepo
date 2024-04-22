package cond;

import java.util.Scanner;

public class P11047_동전개수최솟값 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        //총동전갯수 N
        int N = scanner.nextInt();
        //동전의총합 K
        int K = scanner.nextInt();
        //배열 저장하기
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] <= K) {
                count += (K / A[i]);
                K = K % A[i];
            }
        }
        System.out.println(count);
    }
}
