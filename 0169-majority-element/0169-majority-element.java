// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=0;j<n;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count>n/2) {
//                 return nums[i];
//                 }
//             }
           
        
//         return -1;
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}
