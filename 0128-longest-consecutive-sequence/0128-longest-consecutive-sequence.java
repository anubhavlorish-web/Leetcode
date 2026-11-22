class Solution {
    public int longestConsecutive(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        int largest=1;
        int count=0;
        int ls= Integer.MIN_VALUE;
        if (n == 0) return 0;

        for(int i=0;i<n;i++){
            if(nums[i]-1==ls){
                count++;
                ls = nums[i];
            }
            else if(nums[i]!= ls){
                count=1;
                ls=nums[i];
            }
            largest= Math.max(largest, count);
        }
        return largest;
    }
}
//BRUTE FORCE
// class Solution {
//     public boolean ls(int []nums,int x){
//         for (int num : nums) {
//             if (num == x) return true;
//         }
//         return false;
//     }
//     public int longestConsecutive(int[] nums) {
//         int n = nums.length;
//         int largest =1;
//         if (n == 0) return 0;


//         for (int i=0;i<n;i++){
//             int x=nums[i];
//             int count=1;
//             while(ls(nums,x+1)){
//                 x=x+1;
//                 count++;
//             }
//             largest=Math.max(largest,count);
//         }
//         return largest;
        
//     }
// }