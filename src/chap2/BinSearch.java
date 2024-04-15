package chap2;

import java.util.Scanner;

public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0; //검색 범위의 첫 인덱스
        int pr = n - 1; //검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2; //중앙요소의 인덱스
            if (a[pc] == key) {
                return pc; //검색 성공
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl < pr);
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");
        System.out.println( "x[0]: " );
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.println( "x[" + i + "]: " );
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]);
        }
        System.out.println( "검색할 값: " );
        int key = scanner.nextInt();
        int idx = binSearch( x, num, key );
        if (idx == 1) {
            System.out.println( "그 값의 요소가 없다." );
        }else {
            System.out.println( "그 값은 x[" + idx + "]에 있다." );
        }
    }
}
