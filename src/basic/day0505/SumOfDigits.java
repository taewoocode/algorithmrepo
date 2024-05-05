package basic.day0505;

public class SumOfDigits {
    public static void main(String[] args) {

        int inputNum = 1232;
        int accSum = 0;

        // 1232
        // 1의 자리를 구한다.  -> 2 --> 10으로 나눴을 때 나머지의 값이라고도 생각할 수 있다.
        // 10의 자리를 구한다. -> 3
        // 100의            -> 2
        // 1000             -> 1
//------------------------------------
        //                  8

        while (inputNum > 0) {
            accSum += inputNum % 10; //inputNum을 10으로 나눈다면 ? 나머지는 2가 될 것이고 accSum에 들어가게 된다.
            inputNum /= 10; // inputNum을 10으로 나눈 몫 자체를 inputNum에다가 다시 대입한다 -> 123이 된다.
        }
        System.out.println( accSum );
    }
}
