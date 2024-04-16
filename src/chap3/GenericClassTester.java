package chap3;

public class GenericClassTester {
    static class GenericClass<T> {
        private T xyz;

        GenericClass(T t) { //생성자
            this.xyz = t;
        }

        T getXyz() { //getter
            return xyz;
        }

        public static void main(String[] args) {
            //매개변수에 String도 넘길 수 있고, Integer도 넘길 수 있다.
            GenericClass<String> s = new GenericClass<>( "ABC" );
            GenericClass<Integer> n = new GenericClass<>( 15 );

            System.out.println( s.getXyz() );
            System.out.println( n.getXyz() );

        }
    }
}
