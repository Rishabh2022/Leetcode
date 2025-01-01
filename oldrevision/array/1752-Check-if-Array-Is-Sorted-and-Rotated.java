class Solution {
    public boolean check(int[] nums) {
        //https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/submissions/1494271295/
        
        int k=0;

        for(int i=0;i<nums.length;i++){
            if(nums[(i%nums.length)]>nums[(i+1)%nums.length])  k++;
        }

        if(k>1) return false;
        else return true;

        

        
    }
}