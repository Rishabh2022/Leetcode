class Solution {

    public int countSubstrings(String s) {

        //https://leetcode.com/problems/palindromic-substrings/

        int n = s.length();
        if (n == 0 || n == 1) {
            return n;
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {

            // odd
            int j = i, k = i;
            while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                j--;
                k++;
                cnt++;

            }
            // even
            j = i;
            k = i + 1;
            while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                j--;
                k++;
                cnt++;

            }

        }
        return cnt;

    }
}