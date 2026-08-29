package lesson12;

public interface Flyable {

    int age = 10;

    void fly();

    static void staticMethod() {
        System.out.println("test");
    }

    default void defMethod() {
        System.out.println("default testtt");
    }

    private void privMethod() {
        System.out.println("test");
    }

}
