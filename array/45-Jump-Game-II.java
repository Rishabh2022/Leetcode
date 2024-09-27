class Solution {
    public int jump(int[] nums) {

        //https://leetcode.com/problems/jump-game-ii/submissions/1403808825/?envType=study-plan-v2&envId=top-interview-150

        int jumps=0,l=0,r=0;
        while(r<nums.length-1){
            int farthest=0;
            for(int i=l;i<=r;i++){
                farthest=Integer.max(i+nums[i],farthest);

            }

            l=r+1;
            r=farthest;


            jumps=jumps+1;

        }
        return jumps;


        // int jumps = 0; // Number of jumps taken
        // int curMaxReach = 0; // Farthest reachable index with current number of jumps
        // int nextMaxReach = 0; // Farthest reachable index with one more jump
        
        // for (int i = 0; i < nums.length - 1; ++i) {
        //     nextMaxReach = Math.max(nextMaxReach, i + nums[i]);

        //     // If we finish the current jump range, move on to the next one
        //     if (i == curMaxReach) {
        //         jumps++;
        //         curMaxReach = nextMaxReach;
        //     }
        // }
        
        // return jumps;
    }

}