import java.util.Arrays;

public class Leetcode268_MissingNumber {


    public static int missingNumber(int[] nums) {

        int sz = nums.length;

        Arrays.sort(nums);


        for(int i = 0; i < sz; i++){

            if(i != nums[i]){
                return i;
            }

        }


        return sz;
    }


    public static void main(String[] args) {


        int[] nums = {3, 0, 1};


        int ans = missingNumber(nums);


        System.out.println("Missing Number = " + ans);

    }
}