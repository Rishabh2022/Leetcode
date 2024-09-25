class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // if we make this two pointer approach from starting then the array get unsorted once we replace 
        //the element but here it is not get unsorted

        if(n==0) return;
        int len1=nums1.length;
        int end_idx=len1-1;
        while(m>0 && n>0){
            if(nums1[m-1]>=nums2[n-1]){
                nums1[end_idx]=nums1[m-1];
                m--;
            }
            else{
                nums1[end_idx]=nums2[n-1];
                n--;
            }
            end_idx--;
        }
        while(n>0){
            nums1[end_idx]=nums2[n-1];
            n--;
            end_idx--;
        }

      
        
    }
}