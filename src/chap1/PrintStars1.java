package chap1;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n, w;

        do {
            System.out.println( "n값: " );
            n = scanner.nextInt();
        } while (n <= 0);
        System.out.println("w값: ");
        w = scanner.nextInt();
        while (w <= 0 || w > n);//논리연산자 or 둘중에 조건 하나만 만족하면 된다.

        for (int i = 0; i < n; i++) {
            System.out.print( "*" );
            if (i % w == w - 1) { //w가 0이거나 음수일 때는 if가 실행되지 않는다.
                System.out.println();
            }
            if (n % w != 0) {
                System.out.println();
            }
        }
    }
}
