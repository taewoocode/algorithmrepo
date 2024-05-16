package chap04;

public class Recursion {
    /**
     * 자기 자신 호출함수
     */
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial( n - 1 );
    }

    public static void main(String[] args) {
        int factorial = factorial( 5 );
        System.out.println(factorial);

        // 5 * 4 * 3 * 2 * 1 = 20 60 120
    }

}
