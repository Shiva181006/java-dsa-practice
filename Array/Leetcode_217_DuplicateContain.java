import java.util.*;

public class Leetcode_217_DuplicateContain {

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        // store frequency
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // check duplicate
        for (int num : nums) {
            if (hm.get(num) >= 2) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean ans = containsDuplicate(nums);

        System.out.println(ans);

        sc.close();
    }
}