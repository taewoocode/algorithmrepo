package chap2;

public class IntArrayInit {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}; //배열 초기화에 의해 생성
        for (int i = 0; i < a.length; i++) {
            System.out.println( a[i] );
        }
    }
}
