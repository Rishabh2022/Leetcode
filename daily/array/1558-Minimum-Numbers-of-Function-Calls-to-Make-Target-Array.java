class Solution {
    public int minOperations(int[] nums) {
        int res=0;
        boolean allZeros=false;

        while(!allZeros){
            allZeros=true;
            for(int j=0;j<nums.length;j++){
                int mod=nums[j]%2;
                res+=mod;
                nums[j]/=2;
                if(nums[j]!=0) allZeros=false;
            }

            res++;
        }
        return res-1;


        
    }
}