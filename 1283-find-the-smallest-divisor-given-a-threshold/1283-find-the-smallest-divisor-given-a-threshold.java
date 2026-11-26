class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low=1;
        int high=0;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;

            if (getSum(nums,mid) <= threshold) {
                ans = mid;       
                high = mid - 1;
            } else {
                low = mid + 1;   
            }
        }
        return ans;
    }
private long getSum(int[] nums, int d) {
        long sum = 0;
        for (int num : nums) {
            sum += (num + d - 1) / d;
        }
        return sum;
    }
}