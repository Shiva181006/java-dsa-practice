import java.util.*;

class Leetcode_448_FindAllDisaperingNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        // Mark visited numbers
        for (int i = 0; i < nums.length; i++) {

            // Get the correct index
            int index = Math.abs(nums[i]) - 1;

            // Mark as visited by making it negative
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Find the missing numbers
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> answer = findDisappearedNumbers(nums);

        System.out.println(answer);
    }
}