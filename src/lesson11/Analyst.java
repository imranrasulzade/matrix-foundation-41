package lesson11;

public class Analyst extends Employer{

    @Override
    public void work() {
        System.out.println("Analyst works");
    }

    public void analyse() {
        System.out.println("Analyst analyses");
    }
}
