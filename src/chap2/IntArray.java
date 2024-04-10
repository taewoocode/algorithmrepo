package chap2;

public class IntArray {
    public static void main(String[] args) {
        int[] a = new int[5]; //배열선언

        a[1] = 37; //a[1]에 37을 대입
        a[2] = 51; //a[2]에 51을 대입
        a[4] = a[1] * 2; //a[4]에 37*2를 대입

        for (int i = 0; i < a.length; i++) { //각 요소값을 출력
            System.out.println( "a[" + i + "] = " + a[i] );
        }

    }
}
