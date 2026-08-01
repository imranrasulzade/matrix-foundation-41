import java.util.Scanner;

public class Lesson4 {

    public static void main(String[] args) {

//        int a = 5;
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
////        System.out.println(a + b);
////
////        String n = input.next();
//        char c = input.next().charAt(0);
//        System.out.println(c);
//        System.out.println(n);
//        System.out.println(a);
//        System.out.println("b-ni daxil et:");
//        int b = input.nextInt();
//        System.out.println(a + b);
//        System.out.println(b);


//        for (int i = 0 ; i < 20; i+=2) {
//                System.out.println(i + ".Salam");
//        }

//        System.out.println("Proqram bitdi");

        // vurma cedveli
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(j + " x " + i + " = " + (i * j) + "\t\t");
//            }
//            System.out.println();
//        }


//        int i = 0;
//        while(i < 10) {
//            System.out.println("Salam");
//            i++;
//        }


//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int sum = 0;
//        while (number > 0) {
//            int digit = number % 10;
//            sum += digit;
//            number /= 10;
//        }
//        System.out.println(sum);
//        int a = 5;
//        while (a == 4) {
//            System.out.println("Salam");
//        }


//        Scanner sc = new Scanner(System.in);
//        int number = 0;
//        int sum = 0;
//        do {
//            number = sc.nextInt();
//            sum += number;
//
//        }while (number != 0);
//        System.out.println(sum);


        //              1 2 3
        // 0 1 1 2 3 5 8 13 21 34 55
//                 1 2 3
//        int birinci  = 0;
//        int ikinci = 1;
//        for(int i = 0; i < 11; i++) {
//            System.out.print(birinci + " ");
//            int ucuncu = birinci + ikinci;
//            birinci = ikinci;
//            ikinci = ucuncu;
//        }


        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("""
                    1. Topla
                    2. Cix
                    3. Vur
                    4. Bol
                    5. Exit
                    """);
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println(a + b);
                    break;
                case 2:
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println(c - d);
                    break;
                case 3:
                    int e = sc.nextInt();
                    int f = sc.nextInt();
                    System.out.println(e * f);
                    break;
                case 4:
                    int g = sc.nextInt();
                    int h = sc.nextInt();
                    System.out.println(g / h);
                    break;
                case 5:
                    running = false;
//                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid menu");

            }
        }

        System.out.println("Salam");


    }


}
