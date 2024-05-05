package basic;

import java.util.Scanner;

public class DecimalRef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int input = scanner.nextInt();
        boolean isPrimeNumber = true;

        while (true) {
            if (input == 0) {
                System.out.println( "프로그램을 종료합니다." );
                break;
            }
            if (input <= 1) { //입력값이 1보다 작으면
                isPrimeNumber = false;
            } else { //입력값이 1보다 크면 즉 2부터 시작한다면?
                for (int i = 2; i < input; i++) { //2부터 입력값까지
                    if (input % i == 0) {
                        System.out.println( "소수가 아닙니다." );
                        isPrimeNumber = false;
                        break;
                    }
                }
            }
            if (isPrimeNumber) {
                System.out.println( input + "은 소수입니다." );
                break;
            }
            break;
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
       /* int num = 13;
        boolean isPrimeNumber = true;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
            }
            if (isPrimeNumber) {
                System.out.println( num + "은 소수입니다." );
            } else {
                System.out.println( num + "은 소수가 아닙니다." );
            }
        }
    }*/


