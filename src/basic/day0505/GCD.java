package basic.day0505;

public class GCD {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 18;

        //두 수중에 어떤 수가 큰지 작은지 미리 판별을 해야한다 왜냐하면 num1이 18이 될 수도 있다.

        int small;
        int big;

        if (num1 > num2) {
            big = num1;
            small = num2;

        } else {
            big = num2;
            small = num1;
        }

        //최대공약수는 항상 1부터 시작하기 때문에 1로 초기화를 한다.
        int gcd = 1;

        //i가 1씩 증가하면서 가장 마지막에 나누어진 놈이 최대 공약수가 된다.
        for (int i = 1; i < small; i++) {
            if (big % i == 0 && small % i == 0) {//i로 나누었을 때 나머지가 0
                gcd = i; // 최대공약수를 갱신 12,18일 경우에는 gcd가 6으로 갱신이 된다.
            }
        }
        System.out.println( gcd );
    }
}
