package basic.day0505;

public class numRec1 {
    public static void main(String[] args) {
        int n = 5; //5를 입력받았다.

        /**
         * n = 3이라면
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        //5행 5열
        //안쪽의 for문 열 바깥은 행

        int num = 1;

        for (int j = 0; j < n; j++){ //행
            for (int i = 0; i < n; i++) { //열
                System.out.printf("%4d", num );
                num++;
            }
            System.out.println();
        }
    }
}
