public class Lesson7 {


    static void printAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println( sum / array.length);
    }

    static double findAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    static void sayHello() {
        System.out.println("Salam");
    }

    static int topla(int a, int b) {
        return a + b;
    }

    static int topla(int a, int b, int c) {
        int cem = topla(a, b) + c;
        return cem;
    }

    static void print(int a) {
        System.out.println(a);
    }


    static void print(String a) {
        System.out.println(a);
    }





    public static void main(String[] args) {
        int h = topla(5, 3);
        int k = topla(5, 3, 4);

//        int[] array = {8, 9, 12, 6, 4, 7, 45, 46};
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 3 == 0) {
//                continue;
//            }
//            System.out.println(array[i]);
//
//        }


        int[] array1 = {8, 9, 6, 4, 2, 6, 7, 3};
        printAverage(array1);


        int[] array2 = {7, 41, 2, 3, 41, 6, 22};
        printAverage(array2);

        double av = findAverage(array1);



        sayHello();

        String a = "Hello";


    }


}
