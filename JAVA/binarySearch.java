public class binarySearch {
    public static int BinaraySearch() {
        int target = 2;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0;
        int endPoint;
        endPoint = arr.length - 1;

        while (start <= endPoint) {
            int midPoint = (start + endPoint) / 2;

            if (arr[midPoint] == target) {
                return midPoint;
            } else if (arr[midPoint] > target) {
                endPoint = midPoint - 1;
            } else {
                start = midPoint + 1;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        System.out.println(BinaraySearch());
    }

}
