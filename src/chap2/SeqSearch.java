package chap2;

import java.util.Scanner;

public class SeqSearch {

    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n) {
                return -1;
            }
            if (a[i] == key) {
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num]; //배열의 길이가 num인 x배열 선언

        for (int i = 0; i < num; i++){
            System.out.println( "x[" + i + "]: " );
            x[i] = scanner.nextInt();

        }

        System.out.println("검색할 값: ");
        int key = scanner.nextInt();
        int idx = seqSearch( x, num, key );

        if (idx == -1) {
            System.out.println( "요소가 없다." );
        } else {
            System.out.println( "그 값은 x[" + idx + "]에 있습니다." );
        }
    }
}
