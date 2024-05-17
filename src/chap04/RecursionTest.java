package chap04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    @DisplayName( "문자열테스트" )
    public void test() {
        String str = "Hello world"; //문자열을 str에 담기
        char[] chars = str.toCharArray(); //한글자식 분리해서 chars에 담기
        System.out.println( "length: " + chars.length + " " + Arrays.toString( chars ) );
    }

    @Test
    @DisplayName( "StringTest" )
    public void stringTest() {
        String str = "Hello world";
        List<String> list = new ArrayList<>();
        for (String s : str.split( "" )) {
            list.add( s );
        }
        System.out.println( list );
    }

}