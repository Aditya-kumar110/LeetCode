class Solution {
    public int lengthOfLastWord(String s) {
        int wordcount = 0;
        for(int i = s.length()-1;i>=0;i--){
            
                if(s.charAt(i) == ' ' && wordcount>=1){
                    break;
                }
                else if (Character.isLetter(s.charAt(i))){
                    wordcount++;
                }
                
        }
        return wordcount;
    }
}