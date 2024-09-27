class Solution {
    public void rotate(int[] nums, int k) {

        //https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150

       //---------------------------- Approach 1
        // k = k % nums.length;
        // int[] temp = new int[nums.length - k];
        // int l = 0;
        // for (int i = 0; i < nums.length - k; i++) {
        //     temp[l++] = nums[i];
        // }
        // for (int i = nums.length - k; i < nums.length; i++) {
        //     nums[i - (nums.length - k)] = nums[i];
        // }
        // l = 0;
        // for (int i = k; i < nums.length; i++) {
        //     nums[i] = temp[l++];
        // }


        //---------------------------Approach 2
        k = k % nums.length; // if we have let's say 101 to rotate, then we only rotate it 1 time not 101 times
        if(k < 0){ // if we get -ve value, then -ve is just equals to it's -ve + array.length
            k += nums.length;
        }
        // part 1 reverse
        reverse(nums, 0, nums.length - k - 1);
        // part 2 reverse
        reverse(nums, nums.length - k, nums.length - 1);
        // complete reverse
        reverse(nums, 0, nums.length - 1);



        
    }

    public void reverse(int nums[],int i,int j){
        int leftindex=i;
        int rightindex=j;
        
        while(leftindex<rightindex){
            int temp=nums[leftindex];
            nums[leftindex]=nums[rightindex];
            nums[rightindex]=temp;

            leftindex++;
            rightindex--;

        }
    }
}