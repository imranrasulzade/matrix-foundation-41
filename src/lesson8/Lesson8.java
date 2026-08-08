package lesson8;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Lesson8 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Student st = new Student();
        Student.COUNT++;
        st.name = "Minaye";
        st.surname = "Abbaszade";
        st.age = 20;
        st.gender = true;
        st.university = "BDU";


        Student lm = new Student();
        Student.COUNT++;
        lm.name = "Aydan";
        lm.surname = "Tahirli";
        lm.age = 20;
        lm.gender = true;
        lm.university = "ADNSU";

        st.print();
        Student.printCount();

        lm.print();





    }

}
