package chap2;

import java.security.spec.RSAOtherPrimeInfo;

public class PrimeNumber3 {

    public static void main(String[] args) {

        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2; //prime배열의 인덱스 0에 2가 저장되고 다음 배열의 인덱스 1로 넘어가서 저장하게끔 하는 역할을 한다.

        for (int n = 3; n < 1000; n += 2) { //조사 대상은 홀수만
            int i;
            for (i = 1; i < ptr; i++) {
                counter++;
                if (n % prime[i] == 0) { //나누어 떨어지면 0이 아니다.
                    break;
                }

            }
            if (ptr == i) { //나누어 떨이지지 않으면
                prime[ptr++] = n;
            }
        }
        for (int i = 0; i < ptr; i++) {
            System.out.println( prime[i] );
        }
        System.out.println( counter );
    }
}
