package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz1062 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        Solution4 solution4 = new Solution4();

        try {
            String userInput = bufferedReader.readLine();
            String result = solution4.solution(userInput);//인수? Solution 함수의 매개변수에 무엇을 전달할 것인가?
            System.out.println( "입력 : " +  userInput + " 출력: " +  result );
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
