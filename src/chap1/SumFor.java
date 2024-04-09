package chap1;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "1부터 n까지의 합 구하기" );
        System.out.println( "n값 :" );
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println( "1부터" + n + "까지의 합은 " + sum + "입니다." );
    }
}
