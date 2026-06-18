public class Leetcode_263_UglyNumbers {

    public static boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        // Remove factor 2
        while (n % 2 == 0) {
            n = n / 2;
        }

        // Remove factor 3
        while (n % 3 == 0) {
            n = n / 3;
        }

        // Remove factor 5
        while (n % 5 == 0) {
            n = n / 5;
        }

        return n == 1;
    }


    public static void main(String[] args) {

        int n = 30;

        boolean result = isUgly(n);

        System.out.println(result);
    }
}