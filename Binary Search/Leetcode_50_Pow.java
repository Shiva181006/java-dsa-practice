public class Leetcode_50_Pow {

    public static double myPow(double x, int n) {

        long power = n;   // handle Integer.MIN_VALUE case

        // if power is negative
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double ans = 1.0;

        while (power > 0) {

            // if current bit is 1
            if (power % 2 == 1) {
                ans = ans * x;
            }

            x = x * x;
            power = power / 2;
        }

        return ans;
    }


    public static void main(String[] args) {

        double x = 2.0;
        int n = 10;

        double result = myPow(x, n);

        System.out.println(result);
    }
}