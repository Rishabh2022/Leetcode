class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {

        // ---------------------------------this is mine one but it is failing at one of
        // the below test case

        // int res=0;

        // for(int i=0;i<nums1.length;i++){
        // for(int j=0;j<nums2.length;j++){
        // for(int k=0;k<nums2.length && k!=j;k++){
        // if((nums1[i]*nums1[i])==nums2[j]*nums2[k]) res++;
        // }
        // }
        // }

        // for(int i=0;i<nums2.length;i++){
        // for(int j=0;j<nums1.length;j++){
        // for(int k=0;k<nums1.length && k!=j;k++){
        // if((nums2[i]*nums2[i])==nums1[j]*nums1[k]) res++;
        // }
        // }
        // }

        // return res;

        // ======================================other
        return calculate(nums1, nums2) + calculate(nums2, nums1);

    }

    public int calculate(int[] num1, int[] num2) {
        HashMap<Long, Integer> map = new HashMap<>();
        long n = num1.length, m = num2.length, ans = 0;
        for (int i = 0; i < n; i++)
            map.put((long) num1[i] * num1[i], map.getOrDefault((long) num1[i] * num1[i], 0) + 1);
        for (int j = 0; j < m; j++)
            for (int k = j + 1; k < m; k++)
                ans += (long) map.getOrDefault((long) num2[j] * num2[k], 0);
        return (int) ans;
    }

}