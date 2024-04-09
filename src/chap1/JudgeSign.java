package chap1;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "정수를 입력해라" );
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println( "이 수는 양수임" ); // 조건문이 참일 때 실행
        } else if (n < 0) {
            System.out.println( "이 수는 음수임" ); // 조건문이 거짓일 때 실행
        }else{
            System.out.println("이 수는 0임"); // if도 아니고, else if도 아닐 때 실행
        }
    }
}
