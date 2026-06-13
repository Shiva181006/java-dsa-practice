import java.util.Arrays;

public class Main {

    public static int[] searchRange(int[] nums, int target) {

        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);

        return new int[]{first, last};
    }

    public static int findPosition(int[] nums, int target, boolean findFirst) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {

                ans = mid;

                if (findFirst) {
                    end = mid - 1;     // find first occurrence
                } else {
                    start = mid + 1;   // find last occurrence
                }

            } else if (nums[mid] < target) {

                start = mid + 1;

            } else {

                end = mid - 1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);

        System.out.println(Arrays.toString(result));
    }
}