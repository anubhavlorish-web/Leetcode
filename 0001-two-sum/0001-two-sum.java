class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        // BRUTE FORCE

        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                if(i==j){
                    continue;
                }
                else if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}


//     }
// }
//         int left=0;
//         int right=n-1;
//         Arrays.sort(nums);

//          while(left < right){
//             int sum =nums[left]+nums[right];
         
//             if(sum == target){
//                 return new int[]{left,right};
//             }
//             else if(sum < target){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//          }
//         return new int[]{};
//     }
        
// }





//         int[] ans = new int[2];

//         for(int i =0;i<nums.length; i++){
//             for(int j=i+1; j<nums.length;j++){
//                 if(nums[i] +nums[j] == target){
//                     ans[0] =i;
//                     ans[1] =j;
//                     return ans;
//                 }
//             }
//         }
//         return ans;

    

    
//     }
// }
