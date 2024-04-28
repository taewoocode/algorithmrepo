package cond;

import java.util.Locale;
import java.util.Scanner;

class Main {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase( t );
        //System.out.println(str + " " + t);

        //인덱스로 접근
        /*for (int i = 0; i < str.length(); i++) {*/
        /*    if(str.charAt( i ) == t) answer++;*/
        /*}*/

        //항상된 for문으로도 가능
        for (char x : str.toCharArray()) { //문자배열 객체 반환해서 x에 대응
            if(x==t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner scanner = new Scanner( System.in );
        String str = scanner.next(); //문자열을 하나 읽는다.
        char c = scanner.next().charAt(0); //문자열에서 문자하나를 가지고 와라
        System.out.println(t.solution(str, c));
    }
}
