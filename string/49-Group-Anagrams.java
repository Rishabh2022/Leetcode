class Solution {

    //https://leetcode.com/problems/group-anagrams/

    private String getFrequencyString(String str){
        //freq buckets
        int [] freq=new int[26];

        //iterate over each character
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder sb=new StringBuilder();
        char m='a';
        for(int c:freq){
            sb.append(m);
            sb.append(c);
            m++;
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs==null || strs.length==0) return new ArrayList<>();

        Map<String,List<String>> hashmap=new HashMap<>();

        for(String str: strs){

            String frequencyString=getFrequencyString(str);

            //if the frequency string is present then add the string to the list
            hashmap.computeIfAbsent(frequencyString,k->new ArrayList<>()).add(str);

        }
        return new ArrayList<>(hashmap.values());


    }
}