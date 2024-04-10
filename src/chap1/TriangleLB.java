package chap1;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n;

        System.out.println( "왼쪾 아래가 직각인 이등변 삼각형을 출력합니다." );
        do {
            System.out.println( "몇 단 삼각형인가?" );
            n = scanner.nextInt();
        } while (n <= 0); //n이 0보다 작으면 반복문을 반복한다.

        /*for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print( '*' );
            }
            System.out.println();
        }*/

        triangleUB( 5 );




    }

    //왼쪽 아래가 직각인 삼각형 출력
    static void triangleLB(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println( '*' );
            }
            System.out.println();
        }
    }

    //왼쪽 위가 직각인 삼각형 출력
    static void triangleUB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print( '*' );
            }
            System.out.println();
        }
    }



}
