//OPTIMAL SOLUTION(BINARY SEARCH)
class Solution {
    public int singleNonDuplicate(int[] nums){
        int n = nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low=1;
        int high=n-2;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!= nums[mid-1]) return nums[mid];
            if((mid%2==1 && nums[mid-1]==nums[mid])||(mid % 2 == 0 && nums[mid + 1] == nums[mid])){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
// BETTER SOLUTION
// class Solution {
//     public int singleNonDuplicate(int[] nums){
//         int n = nums.length;
//         if (n == 1) return nums[0];
        
//         for(int i =0;i<n;i++){
//             if(i==0){
//                 if(nums[i]!=nums[i+1]) return nums[i];
//             }else if(i==n-1){
//                 if(nums[i]!=nums[i-1]) return nums[i];
//             }else{
//                 if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]) return nums[i];
//             }
//         }
//         return -1;
//     }
// }

// BRUTE FORCE
// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         int n = nums.length;
//         for(int i=0;i < n - 1; i += 2){
//             if(nums[i]!=nums[i+1]){
//                 return nums[i];
//             }
//         }
//         return nums[n-1];
//     }
// }