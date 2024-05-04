package basic;

public class Fibonacci {
    public static void main(String[] args) {
        int[] arr = new int[100]; //크기가 100인 배열 선언

        /**
         * An = An-1 + An-2 n >= 3
         * a1 = 1, a2 = 1로 초기화
         */

    /*    arr[1] = 1;
        arr[2] = 1;
*/
       /* //여기서는 foreach를 쓸 수 없다.
        //이유는 foreach는 index0 즉 처음부터 끝까지 순회를 해버리기 때문에 foreach보다는 i값을 두고 범위를 지정해서 한다.
        for (int i = 3; i < 100; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 1; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        //2번째 방법 (배열을 사용하지 않고)
        //An
        //n >= 3항일 때 부터 적용이 된다.*/
        /**
         * 먼저 1번항과 2번항을 먼저 출력하고 나머지항을 반복문으로 해결한다.
         */
        int prevPrevNum = 1; //An -2항,값은 초기화
        int prevNum = 1; //An - 1항,값은 초기화
        System.out.print(prevPrevNum + " "); //1
        System.out.print(prevNum + " "); //1

        for (int i = 3; i <= 10; i++) {
            int nNum = prevNum + prevPrevNum;
            System.out.print(nNum + " ");
            //값 갱신
            prevPrevNum = prevNum; //이전의 숫자를 이전이전으로 갱신
            prevNum = nNum; //현재의 값은 이전의 숫자로 갱신

        }





    }
}
