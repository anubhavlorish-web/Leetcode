class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return true;

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }

            if (nums[mid] <= nums[high]) {
                if (target <= nums[high] && target >= nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            else {
                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}

//BRUTE FORCE(LINEAR SEARCH)
// class Solution {
//     public boolean search(int[] nums, int target) {
//         int n = nums.length;

//         for(int i =0;i<n;i++){
//             if(nums[i]==target)
//             return true;
//         }
//         return false;
//     }
// }