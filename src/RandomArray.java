import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the array length: ");

        final int arr_len =SCANNER.nextInt();

        RandomInArrayAndPrint(arr_len);
    }

    static void RandomInArrayAndPrint(int arr_length) {

        Random rand = new Random();
        int upperBound = 100;
        int[] arr = new int[arr_length];
        for (int i = 0; i < arr_length ; i++) {
            arr[i] = rand.nextInt(upperBound);
        }
        System.out.println(Arrays.toString(arr));
    }
}