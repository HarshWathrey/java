public class arr {
    public static void main(String[] args) {
        int[] arr1 ={1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] sum= new int [arr1.length];
        for (int i=0; i<arr1.length; i++){
            sum[i] = arr1[i] + arr2[i];

        }
        System.out.println("sum array: ");
        for (int val : sum){
            System.out.print(val + " ");
        }
    }
}
