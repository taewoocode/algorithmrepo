package basic.day0505;

public class Factorial {
    public static void main(String[] args) {

        int inputNum = 5; //사용자로부터 입력을 5만큼 받았다.
        int accNum = 1; //factorial이 지금까지 계산된 변수를 저장하는 값

        //오름차순
        //i가 inputNum까지 1씩 증가하게 된다.
        //accNum의 역할은 i가 증가할 때 마다 accNum과 i를 곱한 것을 저장하게 된다.
        for (int i = 1; i <= inputNum; i++) {
            accNum *= i; // accNum = accNum * i //계산된 결과값
        }
        System.out.println(accNum);

        //내림차순
        accNum = 1; //acc를 초기화를 해줘야 한다. 다시
        for (int i = inputNum; i >= 1; i--) {
            accNum *= i;
        }
        System.out.println(accNum);
    }
}
