class Solution {
    public int maxSubArray(int[] nums) {
        int n =nums.length;
        int sum=0;
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            sum+=nums[i];

            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}


// BETTER SOLUTION
//         int maxi=Integer.MIN_VALUE;

//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=nums[j];
            
//             maxi=Math.max(sum,maxi);
//             }
//         }
//         return maxi;
//     }
// }

        //BRUTE FORCE
//         int maxi=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){
//                     sum+=nums[k];
//                 }
//                     maxi=Math.max(sum,maxi);
                
//             }
//         }
//         return maxi;
        
//     }
// }

