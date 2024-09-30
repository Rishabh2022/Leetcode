class Solution {
    public int lengthOfLongestSubstring(String s) {

        //https://leetcode.com/problems/longest-substring-without-repeating-characters/
        int hash[] = new int[254];
        int len;
        Arrays.fill(hash, -1);
        int n = s.length();
        int l = 0, r = 0, maxlen = 0;
        while (r < s.length()) {
            if (hash[s.charAt(r)] != -1) {
                if (hash[s.charAt(r)] >= l) {
                    l = hash[s.charAt(r)] + 1;
                }
            }
            len = r - l + 1;
            maxlen = Integer.max(len, maxlen);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxlen;

    }
}