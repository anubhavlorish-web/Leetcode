class Solution {
    public int binary(int[] nums, int h){
        int n = nums.length;
        int totalhrs=0;
        for(int i =0; i<n;i++){
            totalhrs += Math.ceil((double)nums[i]/h);
        }
        return totalhrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low =1;
        int high=0;
        int ans=Integer.MAX_VALUE;

        for(int pile: piles){
            high = Math.max(pile,high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalhrs= binary(piles,mid);
            if(totalhrs<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}