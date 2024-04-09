package chap1;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int no;

        System.out.println( "2자리의 양수를 입력해라" );

        do {
            System.out.println( "n값: " );
            no = scanner.nextInt();
        } while (no < 10 || no > 99); //입력한 값이 10보다 작거나 99보다 크면 루프를 반복한다.

        System.out.println( "변수 no 값은 " + no + "이 되었습니다." );
    }
}
