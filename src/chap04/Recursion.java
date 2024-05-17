package chap04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    /**
     * 자기 자신 호출함수
     */
    static int factorial(int n) {
        //기본 케이스
        if (n == 1) {
            return 1;
        } else {
            return n * factorial( n - 1 );
        }
    }

    static int sumNaturalNumber(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumNaturalNumber( n - 1 );
        }
    }

    public static void main(String[] args) {
        int factorial = factorial( 5 );
        System.out.println( factorial );

        int sumNaturalNumber = sumNaturalNumber( 5 );
        System.out.println( sumNaturalNumber );

        // 5 * 4 * 3 * 2 * 1 = 20 60 120
    }
}
