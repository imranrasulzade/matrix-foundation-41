package lesson9;

import lesson8.Student;

import java.util.Scanner;

public class Lesson9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st = new Student();
//        st.name = "Minaye";
//        st.surname = "Abbaszade";
//        st.age = 20;
//        st.gender = true;
//        st.university = "BDU";


        Student lm = new Student();
//        lm.name = "Aydan";
//        lm.surname = "Tahirli";
//        lm.age = 20;
//        lm.gender = true;
//        lm.university = "ADNSU";

//        st.print();
//        Student.printCount();
//
//        lm.print();

        Student st3 = new Student("Imran", "Rasulzada");
        st3.print();
//        st3.university = "BMU";


        Student st4 = new Student("Ali", "Valiyev", 20, false, "ADNSU");
        st4.print();

        String surname = st4.getSurname();
        System.out.println(surname);

        st4.setUniversity("BDU");
        st4.print();

        Student.printCount();

//        Student[] students = new Student[3];
//        students[0] = st;
//        students[1] = lm;
//        students[2] = st3;

    }

}
