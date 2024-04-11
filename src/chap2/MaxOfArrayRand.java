package chap2;

import java.util.Random;
import java.util.Scanner;

/*

 */

public class MaxOfArrayRand {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner( System.in );

        System.out.println( "사람의 키를 구한다." );
        System.out.println( "사람 수: " );
        int num = scanner.nextInt(); //배열의 길이 입력받음

        int[] height = new int[num]; //배열의 길이가 num인 배열을 생성해서 height에 할당

        System.out.println( "키 값은 아래와 같다." );
        for (int i = 0; i < num; i++) {
            height[i] = 100 + random.nextInt( 90 );
            System.out.println( "height[" + i + "]: " + height[i] );
        }

        System.out.println( "최댓값은" + maxOf( height ) + "입니다." );

    }


    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
