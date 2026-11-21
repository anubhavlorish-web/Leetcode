class Solution {
    private void swapIfGreater(int[] nums1, int[] nums2, int ind1, int ind2) {
        if (nums1[ind1] > nums2[ind2]) {
            int temp = nums1[ind1];
            nums1[ind1] = nums2[ind2];
            nums2[ind2] = temp;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //OPTIMAL SOLUTION -> 2
        int len =(m+n);
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left = 0;
            int right = left + gap;
            
        
        
        while (right < len) {
                // nums1 and nums2
                if (left < m && right >= m) {
                    swapIfGreater(nums1, nums2, left, right - m);
                }else if (left >= m) {
                    swapIfGreater(nums2, nums2, left - m, right - m);
                }else {
                    swapIfGreater(nums1, nums1, left, right);
                }
                left++;
                right++;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }
}

        //OPTIMAL SOLUTION -> 1
//         int left=m-1;
//         int right=0;
//         while(left>=0 && right<n){
//             if(nums1[left]> nums2[right]){
//                 int temp = nums1[left];
//                 nums1[left] = nums2[right];
//                 nums2[right] = temp;
//                 left--;
//                 right++;
//             }else{
//                 break;
//             }
//         }
//         Arrays.sort(nums1,0,m);
//         Arrays.sort(nums2);
//         for (int i = 0; i < n; i++) {
//             nums1[m + i] = nums2[i];
//         }
//     }
// }

        //BRUTE FORCE
    //     int[] temp= new int[m];
    //     for(int i=0;i<m;i++){
    //         temp[i]=nums1[i];
    //     }
    //     int i=0;
    //     int j=0;
    //     int k=0;
    //     while (i<n && j<m){
    //         if(nums2[i]< temp[j]){
    //             nums1[k] =nums2[i];
    //             i++;
    //             k++;
    //         }else{
    //             nums1[k] =temp[j];
    //             j++;
    //             k++;
    //             }
    //     }
    //     while(i<n){
    //         nums1[k] = nums2[i];
    //         i++;
    //         k++;
    //     }
    //     while(j<m){
    //         nums1[k] = temp[j];
    //         j++;
    //         k++;
    //       }
    //     }
    // }