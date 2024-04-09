package chap1;

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n;

        System.out.println( "1부터 n까지의 합 구하기" );

        do {
            System.out.println( "n값: " );
            n = scanner.nextInt();
        } while (n <= 0); //n이 0보다 클 때 까지 반복

        int sum = 0; //sum 초기화

        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println( "1부터" + n + "까지의 합은" + sum + "입니다." );
    }
}
