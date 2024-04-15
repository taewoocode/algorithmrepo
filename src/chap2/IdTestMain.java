package chap2;

public class IdTestMain {
    public static void main(String[] args) {

        Id id1 = new Id(); //1
        Id id2 = new Id(); //2

        System.out.println( id1.getId() ); //1
        System.out.println( id2.getId() ); //2

        System.out.println( id1.getCounter() ); //2
        System.out.println( id2.getCounter() ); //2
    }
}
