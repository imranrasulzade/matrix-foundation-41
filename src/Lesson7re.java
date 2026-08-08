import java.util.Arrays;
import java.util.Scanner;

public class Lesson7re {


    public static boolean isValidEmail(String email) {
        boolean isValid = email.contains("@") && email.contains(".");
        return isValid;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int[] arr = {8, 2, 12, 6, 4, 45, 7, 1};
        bubbleSort(arr);
        System.out.println("Yekun");
        System.out.println(Arrays.toString(arr));


    }


}



