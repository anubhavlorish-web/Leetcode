class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp= new int[m];
        for(int i=0;i<m;i++){
            temp[i]=nums1[i];
        }
        int i=0;
        int j=0;
        int k=0;
        while (i<n && j<m){
            if(nums2[i]< temp[j]){
                nums1[k] =nums2[i];
                i++;
                k++;
            }else{
                nums1[k] =temp[j];
                j++;
                k++;
                }
        }
        while(i<n){
            nums1[k] = nums2[i];
            i++;
            k++;
        }
        while(j<m){
            nums1[k] = temp[j];
            j++;
            k++;
          }
        }
    }
