class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        
        int preSum = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            int remove = preSum - k;
            
            count += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        
        return count;
    }
}

    // BETTER SOLUTION
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int count=0;

//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=nums[j];
//                 if(sum==k){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
