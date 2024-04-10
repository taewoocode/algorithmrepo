package chap2;

import java.util.Scanner;

public class MaxOfArray {

    /*
    요솟수: 배열의 길이
    요소값: 배열을 구성하는 내용물
    배열의 요솟수는 컴파일 때가 아닌 런타임 떄 구성하도록 설정함
    배열의 요솟수를 humanNum을 통해서 입력받고
    요솟수가 humanNum인 배열을 생성함
     */

    //배열a의 최댓값을 구하여 반환
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "키의 최댓값을 구한다." );
        System.out.println( "사람 수: " );

        int humanNum = scanner.nextInt(); //배열의 요솟수를 입력받는다.
        int[] height = new int[humanNum]; // 요솟수가 humanNum인 배열을 생성
        for (int i = 0; i < humanNum; i++) {
            System.out.println( "height[" + i + "]: " );
            height[i] = scanner.nextInt();
        }

        System.out.println( "최댓값은 " + maxOf( height ) + "입니다." );



    }
}
