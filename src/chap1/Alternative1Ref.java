package chap1;

import java.util.Scanner;

public class Alternative1Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n;
        System.out.println( "+,-를 번갈아가며 입력" );

        do {
            n = scanner.nextInt();
            System.out.println( "n: " );
        } while (n <= 0);

        for (int i = 0; i < n / 2; i++) {
            System.out.print( "+-" );
        }
        if (n % 2 != 0) {
            System.out.print( "+" ); //n이 홀 수 일때만 출력
            /*
            n이 홀 수 일때만 출력을 하면 마지막에 +를 출력하고 마무리 한다.
            반복할 때 마다 if문의 판단을 실행할 필요가 없어서 코드의 효율이 올라간다.
            나눗셈 횟수(연산의 횟수)또한 n/2, n%2를 실행한 것처럼 2번으로 줄였다.
             */
        }
    }
}
