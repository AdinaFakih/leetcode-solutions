class Solution {
    public String reverseWords(String s) {

        String word[] = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for(int i = word.length - 1; i >= 0; i--){
            reversed.append(word[i]);
            if(i!=0) {
                reversed.append(" ");
            }   
        }
        return reversed.toString();       
    }
}
