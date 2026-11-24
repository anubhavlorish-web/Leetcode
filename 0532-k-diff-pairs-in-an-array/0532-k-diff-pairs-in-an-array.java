class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int count=0;
        int left=0; 
        int right=1;
        while (left < n && right < n) {
            if (left == right || nums[right] - nums[left] < k) {
                right++;
            } else if (nums[right] - nums[left] > k) {
                left++;
            } else {
                count++;
                left++;
                right++;
                
                while (left < n && nums[left] == nums[left - 1]) {
                    left++;
                }
            }
        }
        return count;
    }
}
