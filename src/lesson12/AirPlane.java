package lesson12;

public class AirPlane implements Flyable, Testable{
    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }

    @Override
    public void defMethod() {
        System.out.println();

    }
}
