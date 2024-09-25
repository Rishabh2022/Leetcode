class Solution {
    public int removeElement(int[] nums, int val) {

        int i=0,j=nums.length-1,c=0;
        while(i<=j){
            if(nums[j]==val) {
                j--;
                c++;
            }
            else if(nums[i]==val){
                nums[i]=nums[j];
                i++;
                j--;
                c++;
            }
            else{
                i++;
               
            }
        }
        return nums.length-c;
        
    }
}