class Solution {
    public boolean canJump(int[] nums) {
        //https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
        int reachable = 0;
       for(int i = 0; i < nums.length; i ++) {
           if(i > reachable) return false;
           reachable = Math.max(reachable, i + nums[i]);
       } 
       return true;

        
    }
}