class Solution{
    public static int bs(int[] nums, int low, int high, int target){
        if(low> high){
            return -1;
        }
        int mid=(low+high)/2;

        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]< target){
            return bs(nums, mid+1, high,target);
        }
        else{
            return bs(nums,low,mid-1,target);
        }
    }
    public int search(int[] nums,int target){
        int n = nums.length;
        return bs(nums, 0, n-1, target);
    }
}

//ITERATIVE CODE
// class Solution{
//     public int search(int[] nums, int target){
//         int n = nums.length;
//         int low=0;
//         int high =n-1;
        

//         while(low<=high){
//             int mid= (low + high)/2;
//             if(nums[mid]== target){
//                 return mid;
//             }else if(nums[mid]>target){
//                 high=mid-1;
//             }else{
//                 low=mid+1;
//             }
//         }
//         return -1;
//     }
// }