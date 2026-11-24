class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int j=0;
        int max=0;

        for(int i =0;i<n;i++){
            if(nums[i]==0){
                    k--;
                }
            while(k<0){
                if(nums[j]==0){
                    k++;
                }
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }   
}