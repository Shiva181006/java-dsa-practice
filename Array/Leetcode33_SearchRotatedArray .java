class Leetcode33_SearchRotatedArray {

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;


        while(left <= right){

            int mid = (left + right) / 2;


            // target found
            if(nums[mid] == target){
                return mid;
            }


            // left part sorted
            if(nums[left] <= nums[mid]){


                // target present in left part
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }

            }


            // right part sorted
            else{


                // target present in right part
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }

            }

        }


        return -1;
    }


    public static void main(String[] args) {

        int nums[] = {4,5,6,7,0,1,2};

        int target = 0;


        int ans = search(nums, target);


        System.out.println("Index = " + ans);
    }
}