package lesson12;

public interface Testable {

    default void defMethod() {
        System.out.println("default test");
    }
}
