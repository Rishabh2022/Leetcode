class Solution {
    public boolean isAnagram(String s, String t) {
        //https://leetcode.com/problems/valid-anagram/

        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (a1.length != a2.length)
            return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i])
                return false;
        }
        return true;

        // int[] alphabet = new int[26];
        // for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        // for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        // for (int i : alphabet) if (i != 0) return false;
        // return true;


    }
}