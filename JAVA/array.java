import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        int a = 50;
        System.out.println(a);
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
        System.out.println("Enter size of arr");
        int n = in.nextInt();
        arr = new int[n];
        System.out.println("Enter value of arr");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " " );
        }
    }
}
