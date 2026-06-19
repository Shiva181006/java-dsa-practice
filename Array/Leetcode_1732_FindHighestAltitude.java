import java.util.Arrays;

public class Leetcode_1732_FindHighestAltitude {

    public static int largestAltitude(int[] gain) {

        int current = 0;
        int max = 0;

        for(int i = 0; i < gain.length; i++){

            current += gain[i];

            max = Math.max(max, current);
        }

        return max;
    }


    public static void main(String[] args) {

        int[] gain = {-5,1,5,0,-7};

        System.out.println("Highest Altitude: " 
                            + largestAltitude(gain));
    }
}