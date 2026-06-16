import java.util.*;

public class Leetcode_46_Permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, nums, ans);

        return ans;
    }


    void backtrack(int index, int nums[], List<List<Integer>> ans) {

        if (index == nums.length) {

            List<Integer> temp = new ArrayList<>();

            for (int x : nums) {
                temp.add(x);
            }

            ans.add(temp);
            return;
        }


        for (int i = index; i < nums.length; i++) {

            swap(nums, index, i);

            backtrack(index + 1, nums, ans);

            swap(nums, index, i);
        }
    }


    void swap(int nums[], int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {

        Leetcode_46_Permutations obj = new Leetcode_46_Permutations();

        int nums[] = {1, 2, 3};

        List<List<Integer>> result = obj.permute(nums);

        System.out.println(result);
    }
}