import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        // Solid Rectangle
//        for (int i=0; i<4; i++){
//            for (int j=0; j<5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // For Hollow Rectangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        System.out.println("Enter the value of M");
        int m = sc.nextInt();
//        for (int i=1; i<=n; i++){
//            for(int j=1; j<=m; j++){
//                if (i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();

//        }
        // For half Triangle
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
        // For reverse half triangle
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
