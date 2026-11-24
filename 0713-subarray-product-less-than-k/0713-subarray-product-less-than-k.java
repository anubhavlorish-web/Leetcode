class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if(k<=1) return 0;
        int count=0;
        int j=0;
        int p=1;

        for(int i=0;i<n;i++){
            p *= nums[i];
            while(p>=k){
                p/=nums[j];
                j++;
            }
            count+=(i-j+1);
        }
        return count;
    }
}
        