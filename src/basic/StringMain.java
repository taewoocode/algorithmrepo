package basic;

public class StringMain {
    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철";

        if (strVar1 == strVar2) {
            System.out.println( "str1 str2 참조가 같음" );
        } else {
            System.out.println("참조가 다름");
        }
    }
}
