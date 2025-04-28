import java.util.Scanner;

public class array_reverse {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter values of array ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] reversedArr1 = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr1[i] = arr[n - 1 - i];
        }
        System.out.println("\nReversed array:");
        for (int value : reversedArr1) {
            System.out.print(value + " ");
        }
    }
}
