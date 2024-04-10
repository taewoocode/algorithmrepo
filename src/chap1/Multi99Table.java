package chap1;

public class Multi99Table {
    public static void main(String[] args) {
        System.out.println( "------99단 출력------" );

        /*
        i가 1일 때 j는 1~9까지 반복되고 줄바꿈을 한다.
        i가 2일 때 j는 1~9까지 반복되고 줄바꿈을 한다.
         */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf( "%3d", i * j );
            }
            System.out.println();

        }


    }
}
