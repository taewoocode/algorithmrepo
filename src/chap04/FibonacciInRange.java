package chap04;

public class FibonacciInRange {

    public static void main(String[] args) {
        long a = 12345678999L;
        long b = 99987654321L;

        // 초기값 설정
        long fib1 = 1;
        long fib2 = 2;
        long sum = 0;

        // 주어진 범위 내에 있는 피보나치 수 찾기 및 더하기
        while (fib2 <= b) {
            if (fib2 >= a) {
                sum += fib2;
            }
            long temp = fib2; //fib2를 temp에 저장
            fib2 += fib1;
            fib1 = temp; //temp에 fib1에 저장
        }

        // 결과 출력
        System.out.println("주어진 범위 내의 피보나치 수의 총 합: " + sum);
    }
}



