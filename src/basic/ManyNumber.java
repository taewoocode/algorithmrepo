package basic;

import java.util.Scanner;

public class ManyNumber {
    public static void main(String[] args) {


        //사용자에게 숫자를 입력받아야함
        Scanner scanner = new Scanner( System.in );
        int[] input = new int[10]; //크기가 10인 배열을 선언
        for (int i = 0; i < 10; i++) {
            input[i] = scanner.nextInt();
        }

        int[] mode = new int[10];


        for (int i = 0; i < 10; i++) {
            mode[input[i]]++;
        }
    }        //ex) mode[3] == 5 -> 3이 5번 출현했다.
    //어느 숫자가 몇번 입력 받아졌는지 저장할 수 있는 자료구조가 필요하다.
    //만약 input[1] = 7이라면, mode 배열에서 인덱스 7에 해당하는 값을 1 증가시킬 것입니다. 즉, 숫자 7이 입력된 횟수를 기록하는 것이죠.



}
