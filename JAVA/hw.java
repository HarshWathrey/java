import java.util.Scanner;
public class hw {
    public static void main(String[] args) {
//        Scanner in = new Scanner( System.in );
//        System.out.println("Enter the No.");
//        int num= in.nextInt();
//        if (num % 2 == 0) {
//
//            System.out.println("No. is even");
//        }
//        else
//            System.out.println("No. is odd");
//        int num= in.nextInt();
//         if ( num>0){
//             System.out.println("No. is positive");
//         }
//         else if(num == 0){
//             System.out.println("No. is Zero");
//         }
//         else
//             System.out.println("No.is negative");
//        System.out.println("Enter the second No.");
//        int num2=in.nextInt();
//        if(num>num2){
//            System.out.println("First No. is greater");
//        }
//        else if(num2>num){
//            System.out.println("Second No. is greater");
//        }
//        else
//            System.out.println("Both are Equal");
//    }
//        for (int i=0;i<5; i++){
//            for (int j=0; j<i; j++){
//                System.out.println("*");
//            }


                int rows = 5;

                for (int i = 1; i <= rows; i++) {

                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
    }
}
