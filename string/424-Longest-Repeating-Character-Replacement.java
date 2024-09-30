class Solution {
    public int characterReplacement(String s, int k) {
       // https://leetcode.com/problems/longest-repeating-character-replacement/description/
        //unoptimized approach
        // int l=0,r=0,maxlen=0,maxfre=0;
        // int hash[]=new int[27];
        // while(r<s.length()){
        //     hash[s.charAt(r)-'A']++;
        //     maxfre=Integer.max(maxfre,hash[s.charAt(r)-'A']);
        //     while((r-l+1)-maxfre>k){
        //         hash[s.charAt(l)-'A']--;
        //         for(int i=0;i<=26;i++) maxfre=Integer.max(maxfre,hash[i]);
        //         l=l+1;
        //     }
        //     if(((r-l+1)-maxfre)<=k) maxlen=Integer.max(maxlen,r-l+1);
        //     r++;
        // }
        // return maxlen;

         int l=0,r=0,maxlen=0,maxfre=0;
        int hash[]=new int[27];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxfre=Integer.max(maxfre,hash[s.charAt(r)-'A']);
            if((r-l+1)-maxfre>k){
                hash[s.charAt(l)-'A']--;
               // for(int i=0;i<=26;i++) maxfre=Integer.max(maxfre,hash[i]);
                l=l+1;
            }
            if(((r-l+1)-maxfre)<=k) maxlen=Integer.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;

        
    }
}