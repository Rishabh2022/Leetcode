class Solution {
    public int removeDuplicates(int[] nums) {
        //https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
        int i=1;
        int count=1;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]!=nums[j+1]) {
                    nums[i]=nums[j+1]; 
                    i++;
                    count++;
            }
        }
        return count;
    }
}