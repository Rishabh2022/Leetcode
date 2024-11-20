class Solution {
    public String reorderSpaces(String text) {

        int spacecount=0;
        int tc=0;

        for(int i=0;i<text.length();i++){

            if(text.charAt(i) != ' ' && (i + 1 == text.length() ||  text.charAt(i + 1) == ' '))  tc++; //count total words
            if(text.charAt(i) == ' '){
                spacecount++;
            }
        }
            int k=0;
            if(tc < 2) {
                k = spacecount; // if numWords == 1 , dividing numSpaces with 1 - 1 i.e. 0 will give error
            } else {
                k = spacecount / (tc - 1);
            }
            int i = 0;
            int spaces = 0;
        
            StringBuilder sb = new StringBuilder();
            
            while(i < text.length()) {
                while(i < text.length() && text.charAt(i) == ' ') i++;   // skip spaces from string
                while(i < text.length() && text.charAt(i) != ' ') { 
                    sb.append(text.charAt(i));  // add word chararacters to string builder
                    i++;
                }
                while(sb.length() < text.length()  && spaces < k) {    // append avg number of spaces after each word
                    sb.append(' ');
                    spaces++;
                }

                i++; // move to next character
                spaces = 0; //make spaces zero again for next word in string builder


               }
                while(sb.length() < text.length()) sb.append(' '); // append any remaining spaces to sb in the end of sb string

        
                return sb.toString();

}
}