class Solution {

    //https://leetcode.com/problems/longest-palindromic-substring/

    int start=0;
    int max=0;

    void findPalindrome(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;

        }
        if(max<j-i-1){
            start=i+1;
            max=j-i-1;
        }

    }

    public String longestPalindrome(String s) {

            if(s.length() < 2)
            return s; 

 
        for(int i = 0; i < s.length(); i++){
            // Find odd length palindrome
            findPalindrome(s, i, i); // current character as the center of the palindrome

            // Find even length palindrome
            findPalindrome(s, i, i+1); // current character and the next character as the centers of the palindrome.
        }
        
        // Return the longest palindromic substring by using the start and max indices.
        return s.substring(start, start + max);

    }
}