package chap04;

import java.util.Scanner;

public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        }
        while (pl <= pr) ;
            return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int num = scanner.nextInt();
        int[] x = new int[num];
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]);
        }
        int key = scanner.nextInt();
        int idx = binSearch( x, num, key );
        if (idx == -1) {
            System.out.println( "값의 요소가 없다." );
        } else {
            System.out.println( "그 값은 " + idx + "에 있다." );
        }

    }

    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (i < n) {
            if (a[i] == key) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
