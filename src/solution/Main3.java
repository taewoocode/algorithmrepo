package solution;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * String은 불변객체, StringBuilder는 가변객체이다.
 * StringBuilder는 객체를 한번 만들고 나면 동적으로 계속 변화시킬 수 있다.
 */

public class Main3 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder( x ).reverse().toString(); //StringBuilder는 가변객체
            answer.add(tmp); //arrayList에 추가 -> 뒤집어진 문자열들을 추가

        }

        return answer;
    }


    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt(); // 단어의 갯수를 읽어서 n에 저
        String[] str = new String[n]; //String배열을 동적으로 만든다 n이 5라면 길이가 5인 배열이다.
        for (int i = 0; i < n; i++) { //배열을 순회한다. n이 5라면 0부터 4까지 순회한다. 0,1,2,3,4
            str[i] = scanner.next(); //배열을 순회하면서 입력받은 값을 각 요소에 대입한다.
        }
        for (String x : T.solution( n, str )) {
            System.out.println(x);
        }

    }
}
