package solution;

import java.util.Scanner;

public class Main2 {

    /**
     *
     * 인덱스 0: "it"
     * 인덱스 1: "is"
     * 인덱스 2: "time"
     * 인덱스 3: "to"
     * 인덱스 4: "study"
     * hello, world라면 index0에는 hello가 저장이 되고, index1에는 world가 저장이 된다.
     */

    public String solution(String str) {
        String answer = " "; //가장 긴 단어를 answer에 저장한다.
        int max = Integer.MIN_VALUE, pos; //가장 작은 값으로 우선 초기화를 해준다.
        while ((pos = str.indexOf( ' ' )) != -1) {
            String tmp = str.substring( 0, pos ); //it
            int len = tmp.length();
            if(len>max){
                max = len;
                answer = tmp;
            }
            str = str.substring( pos + 1 );
        }





        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner scanner = new Scanner( System.in );
        String str = scanner.nextLine();
        System.out.println(T.solution( str ));
    }
}
