package basic;

import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrimeNumber = true; //true로 초기화
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) { //num이랑 i랑 나누어 떨어졌는가?
                //한번이라도 나누어 떨어졌다면 ? -> 소수가 아니다.
                //한번이라도 나누어 떨어졌는지 표시할 무언가가 필요하다. -> flag변수 활용
                isPrimeNumber = false; //한번이라도 나누어 떨어졌기 때문에 소수가 아니다.
            }
            if (isPrimeNumber) {
                System.out.println( num + "은 소수입니다." );
            } else {
                System.out.println( num + "은 소수가 아닙니다." );
            }
        }
    }
}

