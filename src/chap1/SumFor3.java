package chap1;

import java.util.Scanner;

public class SumFor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("a의 값: ");
        int a = scanner.nextInt();

        int b;
        while (true) {
            System.out.println("b의 값: ");
            b = scanner.nextInt();
            if(b > a) break; //입력받은 b의 값이 a보다 크다면 무한루프를 종료하고 다음 코드로 이동한다.
            System.out.println("a보다 큰 값을 입력해 주세요");
        }
        System.out.println( "b - a는 " + (b - a) + "입니다." );


    }
}
