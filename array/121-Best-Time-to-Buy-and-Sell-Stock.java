class Solution {
    public int maxProfit(int[] prices) {


      // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
    //     int maxprofit=0;
    //    int min=prices[0];
    //    for(int i:prices){
    //         int cost=i-min;
    //         maxprofit=Integer.max(cost,maxprofit);
    //         if(min>i) min=i;
    //    }
    //    return maxprofit;
        


        int mp=Integer.MIN_VALUE;
        int minv=Integer.MAX_VALUE;
        for(int i:prices){
            int k=i-minv;
            if(mp<k) mp=k;
            if(i<minv) minv=i;

        }
        if(mp<0) return 0;
       return mp;

        
    }
}