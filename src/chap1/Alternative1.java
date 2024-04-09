package chap1;

import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n; // 이렇게 for문 밖에서 초기화하면 n은 밖에서도 사용을 할 수 있게 된다.

        System.out.println("+, -를 번갈아가며 출력");

        do {
            System.out.println( "n의 값:" );
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            }else {
                System.out.print( "-" );
            }
        }
    }
}
