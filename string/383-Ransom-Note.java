class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int n[]=new int[256];
        for(int i=0;i<magazine.length();i++){
            n[magazine.charAt(i)-0]++;
        }

        for(int i=0;i<ransomNote.length();i++){
            n[ransomNote.charAt(i)-0]--;
        }

        for(int i=0;i<ransomNote.length();i++){
            if(n[ransomNote.charAt(i)-0]<0) return false;
        }

        return true;


        
    }
}