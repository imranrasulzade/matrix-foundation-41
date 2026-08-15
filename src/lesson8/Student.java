package lesson8;

public class Student {

    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private String university;

    public static int COUNT;

    public Student() {
        COUNT++;
        System.out.println("Obj yaranir");
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        COUNT++;
    }

    public Student(String name, String surname, int age, boolean gender, String university) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.university = university;
        COUNT++;
    }

    public Student(int age) {
        this.age = age;
        COUNT++;
    }


    public void print() {
        System.out.println(this.name + " " + this.surname + ", " + this.age + ", " +
                (this.gender ? "Qadin" : "Kisi") + ", " + this.university);
    }

    public static void printCount() {
        System.out.println("Student obyektlerinin sayi: " + COUNT);
    }

    public String getSurname() {
        return this.surname;
    }

    public void setUniversity(String university) {
        this.university = university;
    }



}
