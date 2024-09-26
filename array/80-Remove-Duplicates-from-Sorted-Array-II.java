class Solution {
    public int removeDuplicates(int[] nums) {

        //https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150

        int j=1;
        for(int i=1;i<nums.length;i++){
            if(j==1 || nums[i]!=nums[j-2]){
                nums[j++]=nums[i];
            }
        }

        return j;

        
    }
}