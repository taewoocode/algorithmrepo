package chap3;

import java.util.Scanner;

public class SeqSearch {
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == 0) {
                return -1;
            }
            if (i == key) {
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "요솟수: " );
        int num = scanner.nextInt(); // 입력받은 값을 n에 저장한 이후에
        int[] x = new int[num]; // x라는 배열에 저장한다.

        for (int i = 0; i < num; i++) {
            System.out.println( "x[" + i + "]: " );
            x[i] = scanner.nextInt();
        }
        System.out.println("검색할 값: ");
        int key = scanner.nextInt();
        int idx = seqSearch( x, num, key );
        if (idx == -1) {
            System.out.println( "그 값의 요소가 아닙니다." );
        } else {
            System.out.println( "그 값은 " + idx + "에 있습니다." );
        }
    }
}
