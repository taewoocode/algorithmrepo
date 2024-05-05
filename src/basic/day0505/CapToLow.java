package basic.day0505;


//대문자는 소문자로 소문자는 대문자로
public class CapToLow {
    public static void main(String[] args) {

        //사용자에게 문자열을 받을 때 자바는 String객체로 받게된다.
        String input = "helloWorlD"; //사용자에게 받은 입력

        char[] arr = input.toCharArray();
        System.out.println( arr );
        //index를 돌아다니기 위한 index변수 i

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') { //arr 배열의 i번째 요소가 소문자 인지를 판별하는 조건문 (소문자라면 조건문 실행)
                arr[i] = (char)(arr[i] + 'A' - 'a' ); //'a' 'b' ~ 'z' 'A' 'B' 'C' ex) 아스키코드내에서 a랑 A가 30만큼 차이나면 b랑 B도 30만큼 차이가 난다.
            }
            else if (arr[i] >= 'A' && arr[i] <= 'Z') { //arr 배열의 i번째 요소가 대문자 인지를 판별 (대문자라면 조건문 실행)
                arr[i] = (char)(arr[i] - ('A' - 'a') ); //arr[i]가 대문자임을 가정 대문자 - 간격 = 소문자
            }
        }
        System.out.println(arr);
    }
}
