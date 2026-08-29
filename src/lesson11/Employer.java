package lesson11;

public class Employer {
    public int id;
    public String name;
    public double salary;
    public int age;


    public Employer() {
        System.out.println("Employer constructor");
    }

    public void work() {
        System.out.println("Employer is working.");
    }

    public final void test() {
        System.out.println("test for dev");
    }

}
