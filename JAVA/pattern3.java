import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        //         For half Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
//        System.out.println("Enter the value of M");
//        int m = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
