package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student( "손오공", "2134" );
        Student st2 = new Student( "사오정", "1932" );
        Student st3 = new Student( "저팔계", "4322" );

        //Generic으로 감싼다.
        ArrayList<Student> list = new ArrayList<Student>();

        list.add( st1 );
        list.add( st2 );
        list.add( st3 );

        //forEach구문으로 각 데이터 값을 순회한다. -> 값이 잘 들어갔는지 확인하기 위함이다.
        //stu가 list에 있는 애들을 반복할 때 마다 첫번째,두번째,세번쨰 가르키게 된다.
        for (Student stu : list) {
            System.out.println(stu.getName() );
            System.out.println(stu.getNo() );
        }

        Scanner scanner = new Scanner( System.in );

        while (true) {
            System.out.println("계속 검색을 하고 싶다면 y, 종료하고 싶다면 n");
            String input = scanner.next(); //문자열을 입력 받는다.

            //학생의 이름을 찾으려면 arrayList에 값을 다 뒤져야함
            //내가 입력한 값의 이름이 list에 있는 이름과 같은지 다른지 비교를 해야한다.


            if (input.equals( "y" )) {
                System.out.println("검색을 시작합니다.");
                String name = scanner.next();
                boolean flag = false;

                for (Student stu : list) {
                    //arrayList가 들고있는 getName과 클라이언트가 입력한 name이 같을경우
                    if (stu.getName().equals( name )) {
                        System.out.println("해당하는 학생의 학번은: " + stu.getNo());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("해당하는 학생 이름이 없습니다.");

                }
            } else if (input.equals( "n" )) {
                break;

            }
        }
        System.out.println("프로그램이 종료가 되었습니다.");
    }
}
