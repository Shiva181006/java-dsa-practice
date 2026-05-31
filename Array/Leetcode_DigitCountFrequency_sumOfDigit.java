public class Leetcode_DigitCountFrequency_sumOfDigit {

    public static void main(String[] args) {

        int n = 122;
        int score = 0;

        while (n > 0) {
            score += n % 10;
            n /= 10;
        }

        System.out.println(score);
    }
}