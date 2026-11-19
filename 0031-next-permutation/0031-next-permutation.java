class Solution {
    public void nextPermutation(int[] arr) {
        int n =arr.length;
        int ind=-1;

        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind=i;
                break;
            }
        }
        if(ind == -1){
            reverse(arr,0,n-1);
            return ;
        }
        for(int i =n-1;i>ind;i--){
            if(arr[i]>arr[ind]){
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        reverse(arr, ind+1,n-1);
        
    }
private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
// class Solution {
//     public void nextPermutation(int[] arr) {
//         int ind = -1;
//         int n = arr.length;

//         // Step 1: Find the break-point
//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] < arr[i + 1]) {
//                 ind = i;
//                 break;
//             }
//         }

//         // If no break-point exists, reverse the whole array and exit
//         if (ind == -1) {
//             reverse(arr, 0, n - 1);
//             return; // Just 'return;', NOT 'return arr;'
//         }

//         // Step 2: Find the next greater element and swap it with arr[ind]
//         for (int i = n - 1; i > ind; i--) {
//             if (arr[i] > arr[ind]) {
//                 int temp = arr[i];
//                 arr[i] = arr[ind];
//                 arr[ind] = temp;
//                 break;
//             }
//         }

//         // Step 3: Reverse the right half
//         reverse(arr, ind + 1, n - 1);
//     }

//     // Make sure this helper method is included inside class Solution!
//     private void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

