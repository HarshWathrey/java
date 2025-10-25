import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        //         For reverse half triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
//        System.out.println("Enter the value of M");
//        int m = sc.nextInt();
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
