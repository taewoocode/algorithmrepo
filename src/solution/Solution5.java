package solution;

import java.io.*;

public class Solution5 {
    public static void main(String[] args) throws IOException {

        //입력 및 초기화
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

        String str = br.readLine().toUpperCase(); //입력받고 바로 대문자로 바꿔줌

        //1.알파벳 별 counting
        int[] count = new int[26]; //a ~ z 알파벳 26개 저장

        //카운팅 하면서 최대값 및 알파벳 기록
        int maxValue = 0;
        char maxChar = '?';
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt( i ) - 'A';//i번째를 꺼내와서 'A'를 빼준다, String의 index값을 저장하고 있다.
            ++count[idx];

            if (maxValue < count[idx]) {
                maxValue = count[idx];
                maxChar = str.charAt( i );
            }
            //예외처리 로직
            else if (maxValue == count[idx])
                maxChar = '?';
        }
        bw.write( maxChar );
        bw.close();
        br.close();
    }
}
