package chap04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    @DisplayName("문자열테스트")
    public void test() {
        String str = "Hello world"; //문자열을 str에 담기
        char[] chars = str.toCharArray(); //한글자식 분리해서 chars에 담기
        System.out.println( "length: " + chars.length + " " + Arrays.toString( chars ) );
    }

    @Test
    @DisplayName("StringTest")
    public void stringTest() {
        String str = "Hello world";
        List<String> list = new ArrayList<>();
        for (String s : str.split( "" )) {
            list.add( s );
        }
        System.out.println( list );
    }

    @Test
    @DisplayName("문자열 테스트 하기")
    public void StringTest2() {
        String str = "HEllO BOY";
        List<String> list = new ArrayList<>();
        for (String s : str.split( "" )) {
            list.add( s );
        }
        System.out.println( list );
    }

    @Test
    @DisplayName("문자열 뒤집기")
    public void testMain() {
        String str = "SpdECar";
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (Character.isLowerCase( c )) { //소문자면
                sb.append( Character.toUpperCase( c ) ); //대문자로 전환
            } else {
                sb.append( Character.toLowerCase( c ) ); //대문자면 소문자로 전환
            }
        }
        System.out.println( sb.toString() ); //객체가 가지고 있는 정보를 문자열로 만들어서 반환
    }

    @Test
    @DisplayName("문자열 뒤집어봐")
    public void StringAppendTest() {
        String str = "aAsSdDfF";

        //str을 char형 배열로 전환
        char[] charArray = str.toCharArray();
        //StringBUilder 객체 선언
        StringBuilder sb = new StringBuilder();
        //charArray 배열을 변수 s로 순회함
        for (char s : charArray) {
            //소문자면
            if (Character.isLowerCase( s )) {
                //대문자로
                sb.append( Character.toUpperCase( s ) );
            } else {//소문자가 아니라면 소문자로
                sb.append( Character.toLowerCase( s ) );
            }
        }
        //for문 탈출해서 sb객체 반환
        System.out.println(sb.toString());
    }
}