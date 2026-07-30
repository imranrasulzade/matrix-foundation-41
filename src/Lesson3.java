import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {

//        int bolunen = 10;
//        int bolen = 4;
//        double b = (double) bolunen;
//        System.out.println((double) bolunen / bolen);
//        System.out.println((double) 10 / 4);

//        System.out.println(Math.pow(2, 10));

//        int a = 2;
////        int b = ++a + a++ + a;
////        int b = --a;
////        System.out.println(a);
//        System.out.println(b);

//        int n = 5;
//        n += 5;
//        n *= 5;
//        n /= 5;
//        n -= 5;
//        System.out.println(n);


//        int grade = 64;

//        if (grade <= 100 && grade >= 0) {
//            if (grade > 90) {
//                System.out.println("A");
//            } else if (grade > 80) {
//                System.out.println("B");
//            } else if (grade > 70) {
//                System.out.println("C");
//            } else if (grade > 60) {
//                System.out.println("D");
//            } else if (grade > 50) {
//                System.out.println("E");
//            } else {
//                System.out.println("Other");
//            }
//        } else {
//            System.out.println("Sehv bal daxil olunub");
//        }

//        int a = 15;
//        if (a > 10) {
//            System.out.println("A 10dan boyukdur");
//        }
//        if (a > 5) {
//            System.out.println("a 5den boyukdur");
//        }

//        int day = 3;
//        if (day == 1) {
//            System.out.println("Monday");
//        } else if (day == 2) {
//            System.out.println("Tuesday");
//        } else if (day == 3) {
//            System.out.println("Wednesday");
//        } else if (day == 4) {
//            System.out.println("Thursday");
//        } else if (day == 5) {
//            System.out.println("Friday");
//        } else {
//            System.out.println("Weekend");
//        }

//        int day = 3;
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            default -> System.out.println("Weekend");
//        }

//        int day = 3;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            default:
//                System.out.println("Weekend");
//                break;
//        }


//        int day = 3;
//        String result = switch (day) {
//            case 1 -> {
//                System.out.println("Monday");
//                yield "Monday";
//            }
//            case 2 -> {
//                System.out.println("Tuesday");
//                yield "Tuesday";
//            }
//            case 3 -> {
//                System.out.println("Wednesday");
//                yield "Wednesday";
//            }
//            case 4 -> {
//                System.out.println("Thursday");
//                yield "Thursday";
//            }
//            case 5 -> {
//                System.out.println("Friday");
//                yield "Friday";
//            }
//            default -> {
//                System.out.println("Weekend");
//               yield "Weekend";
//            }
//        };

//        int day = 3;
//        String result = switch (day) {
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            default -> "Weekend";
//        };
//        System.out.println(result.equals("Monday"));

//        int a = 1;
//        String cavab = a == 1 ? "Bir" : "Diger"; // ternary
//
//        System.out.println("proqram bitdi");


        /*
         • Giriş: amount (double), from və to (String, məsələn: “AZN”, “USD”, “EUR”).
 • Şərt: Yalnız bu 3 valyuta dəstəklənsin. Dəstəklənməyən kod daxil olarsa, xəta mesajı verin.
 • Məzənnələr (sabit verin; məsələn):
 • 1 AZN = 0.59 USD, 1 AZN = 0.54 EUR
 • 1 USD = 1.70 AZN, 1 EUR = 1.85 AZN

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Amount daxil et:");
        double amount = sc.nextDouble();
        System.out.println("From daxil et:");
        String from = sc.next();
        System.out.println("To daxil et:");
        String to = sc.next();
        double result = 0;
        double usdToAzn = 1.7;
        double aznToUsd = 0.59;
        double eurToAzn = 1.85;
        double aznToEur = 0.54;

        if ((from.equals("AZN") || from.equals("USD") || from.equals("EUR"))
        && (to.equals("AZN") || to.equals("USD") || to.equals("EUR"))) {
            if (from.equals("USD") && to.equals("AZN")) {
                result = amount * usdToAzn;
            } else if (from.equals("EUR") && to.equals("AZN")) {
                result = amount * eurToAzn;
            } else if (from.equals("AZN") && to.equals("USD")) {
                result = amount * aznToUsd;
            } else if (from.equals("AZN") && to.equals("EUR")) {
                result = amount * aznToEur;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Desteklenmeyen mezenne");
        }



    }
}
