package lesson8;

public class Student {

    String name;
    String surname;
    int age;
    boolean gender;
    String university;
    static int COUNT;


    public void print() {
        System.out.println(this.name + " " + this.surname + ", " + this.age + ", " +
                (this.gender ? "Qadin" : "Kisi") + ", " + this.university);
    }

    public static void printCount() {
        System.out.println("Student obyektlerinin sayi: " + COUNT);
    }



}
