class Solution {
    public int minOperations(int[] nums) {
//---------------------------------not able to understand this solution
        // int res=0;
        // boolean allZeros=false;

        // while(!allZeros){
        //     allZeros=true;
        //     for(int j=0;j<nums.length;j++){
        //         int mod=nums[j]%2;
        //         res+=mod;
        //         nums[j]/=2;
        //         if(nums[j]!=0) allZeros=false;
        //     }

        //     res++;
        // }
        // return res-1;

        //----------------------------other sol
	int ops = 0;

	for (int bit = 0; bit < 32; bit++) {
		boolean nonzero = false;

		for (int i = 0; i < nums.length; i++) {
			ops += nums[i] % 2;
			nums[i] /= 2;
			nonzero |= nums[i] > 0;
		}

		if (nonzero) ops++; else break;
	}

	return ops;

        
    }
}