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
            }else {
                sb.append( Character.toLowerCase( c ) ); //대문자면 소문자로 전환
            }
        }
        System.out.println( sb.toString() ); //객체가 가지고 있는 정보를 문자열로 만들어서 반환
    }
}