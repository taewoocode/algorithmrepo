package chap2;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수
        for (int n = 2; n <= 1000; n++) { //n이 2부터 1000까지 1씩 증가한다.
            int i;
            for ( i = 2; i < n; i++) { //i는 2부터 n이 증가할 때 까지 i도 1씩 증가한다.
                counter++; //나눗셈의 횟수가 증가한다.
                if (n % i == 0) {
                    break;
                }
                if (n == i) {
                    System.out.println( n );
                }
            }
        }
        System.out.println( "나눗셈을 수행한 횟수 :" + counter );
    }
}
