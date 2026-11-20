class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1=0;
        int count2 =0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(count1==0 && nums[i]!= ele2){
                count1=1;
                ele1=nums[i];
            }
            else if(count2==0 && nums[i]!= ele1){
                count2=1;
                ele2=nums[i];
            }
            else if(ele1 == nums[i]){
                count1++;
            }
            else if(ele2 ==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> ls= new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0; i<n;i++){
            if(ele1==nums[i]){
                count1++;
            }
            else if(ele2 == nums[i]){
                count2++;
            }
        }
            int mini =(int)(n/3)+1;
            if(count1 >= mini){
                ls.add(ele1);
            }
            if(count2>= mini){
                ls.add(ele2);
            }
        
        Collections.sort(ls);
        return ls;
    }
}



        // BETTER SOLUTION
//         List<Integer> ls = new ArrayList<>();
//         Map<Integer, Integer> mpp = new HashMap<>();
//         int mini = (int)(n / 3) + 1;

//         for (int i = 0; i < n; i++) {
//             int count = mpp.getOrDefault(nums[i], 0) + 1;
//             mpp.put(nums[i], count);

//             if (count == mini) {
//                 ls.add(nums[i]);
//             }

//             if (ls.size() == 2) {
//                 break;
//             }
//         }

//         Collections.sort(ls);
//         return ls;
//     }
// }

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
