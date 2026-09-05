package lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    private List<String> students = new ArrayList<>();


    public void showAll() {
        if (students == null || students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        int orderNumber = 1;
        for (String student : students) {
            System.out.println(orderNumber + ". " + student);
            orderNumber++;
        }
    }


    public void addNew() {
        System.out.println("Enter new student name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        students.add(name);
        System.out.println("New student added!");
    }

    public void showCount() {
        if (students == null || students.isEmpty()) {
            System.out.println(0);
            return;
        }
        System.out.println("Students count: " + students.size());
    }

    public void isExists() {
        if (students == null || students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        System.out.println("Axtarmaq istediyni yaz:");
        Scanner sc = new Scanner(System.in);
        String studentName = sc.next();
        if (students.contains(studentName)) {
            System.out.println(studentName + " is found!");
        } else {
            System.out.println(studentName + " is not found!");
        }
    }

    public void delete() {
        if (students == null || students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        System.out.println("Silmek istediyini yaz:");
        Scanner sc = new Scanner(System.in);
        String studentName = sc.next();
        if (students.remove(studentName)) {
            System.out.println(studentName + " is deleted!");
        } else {
            System.out.println(studentName + " is not found!");
        }
    }


}
