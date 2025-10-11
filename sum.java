public class sum {
    public static void main(String[] args) {
        int a = 345; // you can change this number
        int res = 0;

        while (a > 0) {
            int dig = a % 10;
            res = res + dig;
            a = a / 10;
        }

        System.out.println("Sum of digits: " + res);
    }
}
