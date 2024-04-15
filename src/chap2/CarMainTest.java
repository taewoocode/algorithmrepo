package chap2;

public class CarMainTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println( "car1.getDoor() = " + car1.getDoor() ); //4
        System.out.println( "car2.getDoor() = " + car2.getDoor() ); //4

    }
}
