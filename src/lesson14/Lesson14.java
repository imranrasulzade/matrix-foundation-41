package lesson14;

import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        boolean running = true;
        while (running) {
            System.out.println("""
                ======MENU======
                1. Bütün tələbələri ekrana çıxarmaq
                2. Yeni tələbə əlavə etmək
                3. Tələbə silmək
                4. Verilmiş tələbənin siyahıda olub-olmadığını yoxlamaq
                5. Tələbələrin ümumi sayını göstərmək
                0. Exit
                ================
                """);

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    service.showAll();
                    break;
                case 2:
                    service.addNew();
                    break;
                case 3:
                     service.delete();
                    break;
                case 4:
                     service.isExists();
                    break;
                case 5:
                    service.showCount();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }






    }
}
