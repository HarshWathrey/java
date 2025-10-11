import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
//         Solid Rectangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        System.out.println("Enter the value of M");
        int m = sc.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
