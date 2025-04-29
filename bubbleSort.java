import java.util.Scanner;
public class bubbleSort {

    public static void main(int[] arr){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of Array");
        System.out.println("Enter size of arr");
        int n = sc.nextInt();
        arr[] = sc.newInt[n];
        System.out.println("Enter value of arr");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for (int i: arr){
            System.out.println();
        }
    }
}
