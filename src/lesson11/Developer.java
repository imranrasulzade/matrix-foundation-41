package lesson11;

public class Developer extends Employer{

    public Developer() {
        System.out.println("Developer constructor");
    }


    @Override
    public void work() {
        System.out.println("Developer works");
    }
}
