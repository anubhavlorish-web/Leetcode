class Solution {
    public int lowerBound(int[] nums, int x) {
       int n = nums.length;
       int low=0;
       int high=n-1;
       int ans=n;

       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>=x){
            ans = mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return ans;
     }
     public int upperBound(int[] nums, int x) {
        int n =nums.length;
        int low=0;
        int high= n-1;
        int ans=n;

        while(low<=high){
            int mid = (low+ high)/2;
            if(nums[mid]>x){
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target){
        int n = nums.length;
        int lb=lowerBound(nums,target);
        if(lb==n || nums[lb]!= target){
            return new int[]{-1,-1};
        }else{
            return new int[]{lb, upperBound(nums, target) - 1};
        }
        
    }
}

// BRUTE FORCE (LINEAR SERCH)
// class Solution {
//     public int[] searchRange(int[] nums, int target){
//         int n = nums.length;
//         int first=-1;
//         int last=-1;

//         for(int i=0;i<n;i++){
//             if(nums[i]== target){
//                 if(first==-1){
//                     first=i;
//                 }
//                 last=i;
//             }
//         }
//         return new int[]{first,last};
//     }
// }


// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//          int l = 0 ;
//         int  r = nums.length-1;     
//         int first = -1;
//         while(l <= r ){
//             int mid  = l + (r - l ) / 2;

//             if(target == nums[mid] ){
//                 first= mid;
//                 r = mid -  1;
//             }
//             else if(nums[mid] < target ){
//                 l = mid+1;
//             }
//             else{
//                 r = mid-1;
//             }
//         }
//          l = 0 ;
//          r = nums.length-1;     
//          int last = -1;
//         while(l <= r ){
//             int mid  = l + (r - l ) / 2;

//             if(target == nums[mid] ){
//                 last = mid;
//                 l = mid +1 ;
//             }
//             else if(nums[mid] < target ){
//                 l = mid+1;
//             }
//             else{
//                 r = mid-1;
//             }
//         }

//         return new int[]{first , last};

//     }
// }