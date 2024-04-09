package chap1;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "세 정수의 최대값 구하기" );
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        System.out.println( max );
    }
}
