package LeetCode;

class LastWordLength {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        while (i>=0 && s.substring(i,i+1).equals(" ")){
            i--;
        }
        
        int wordLen=0;
        while (i>=0 && !s.substring(i,i+1).equals(" ")){
            i--;
            wordLen++;
        }
        return wordLen;
    }
}
