class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int mini = (int)(n / 3) + 1;

        for (int i = 0; i < n; i++) {
            int count = mpp.getOrDefault(nums[i], 0) + 1;
            mpp.put(nums[i], count);

            if (count == mini) {
                ls.add(nums[i]);
            }

            if (ls.size() == 2) {
                break;
            }
        }

        Collections.sort(ls);
        return ls;
    }
}

        //BRUTE FORCE
//         List<Integer> ans = new ArrayList<>();

//         for(int i=0;i<n;i++){
//             if(ans.isEmpty() || !ans.contains(nums[i])){
//                 int count =0 ;
//                 for(int j=0;j<n;j++){
//                     if(nums[j]==nums[i])
//                     count++;
//                 }
//                 if(count>n/3){
//                     ans.add(nums[i]);
//                 }
                
//             }
//             // if(ans.size()==2) break;
//         }
//         return ans;
//     }
// }
