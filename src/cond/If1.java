package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20;

        //조건에 맞으므로 실행되는 블록
        if (age >= 18) {
            System.out.println( "성인입니다." );
        }

        //조건에 맞지않아실행되지 않는 블록
        if (age < 18) {
            System.out.println( "미성년자입니다." );
        }
    }
}
