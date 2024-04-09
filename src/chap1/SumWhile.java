package chap1;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "1부터 n까지의 합을 구합니다." );
        int n = scanner.nextInt();

        //초기화
        int sum = 0; //합은 0으로
        int i = 1; //count는 1로

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println( "1부터" + n + "까지의 합은 " + sum + "입니다." );
    }
}
