package chap2;

public class Id {
    private static int counter = 0; //클래스 변수
    private int id; //인스턴스 변수 --> 자동으로 0으로 초기화 되어있는 상태

    public Id() { //객체 초기화 역할도 있음.
        id = ++counter; //1
    }

    public int getCounter() { //클래스 메서드
        return counter;
    }

    public int getId() { //id를 반환하는 인스턴스 메서드
        return id;
    }
}
