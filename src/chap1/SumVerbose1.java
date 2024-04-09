package chap1;

import java.util.Scanner;

public class SumVerbose1 {

    /*
    반복과정에서 조건 판단하기
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n;
        System.out.println("1부터 n까지의 합을 구한다.");

        do {
            System.out.println( "n값: " );
            n = scanner.nextInt();
        } while (n <= 0);

        int sum = 0; //합 초기화
        for (int i = 0; i < n; i++) {
            if (i < n) {
                System.out.print(i + " + ");
            }else{ // i가 n 보다 큰 경우.
                System.out.print( i + " = " );
                sum += i;
            }
            System.out.println( sum );

        }
    }
}
