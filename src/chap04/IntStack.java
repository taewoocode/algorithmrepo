package chap04;

public class IntStack {
    private int[] stack; //스택용 배열
    private int capacity; //스택 용량
    private int ptr; //스택 포인터

    //실행 시 예외: 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {

        }
    }

    //실행 시 예외: 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {

        }
    }

    /*
    호출하면서 값을 던지고 그 값을 받아서 메서드를 읽는다.
    생성자 호출시 maxlen에 값이 int형으로 전달되고 전달받은 maxlen은 배열의 크기를 결정한다.
     */
    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stack = new int[capacity]; //스택용 배열을 생성
        } catch (OutOfMemoryError error) { //생성할 수 없음
            capacity = 0;
        }
    }
    /*
    ptr은 stack 포인터이다. -> 스택에 쌓여 있는 데이터 수를 나타내는 필드이다.
    스택이 비어 있으면 ptr = 0 , 가득 차 있으면 capacity값과 같다.
     */

    //스택에 x를 푸시하는데 스택이 가득 차있으면
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity) {//스택이 가득참
            throw new OverflowIntStackException();
        }
        return stack[ptr++] = x;
    }

    //스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stack[--ptr];
    }


}
