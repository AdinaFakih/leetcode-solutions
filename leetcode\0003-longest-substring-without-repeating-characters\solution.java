class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();

        int maxLength = 0;
        int left = 0; //left pointer of the sliding window 

        //Right pointer moves throught the string 
        for(int right = 0; right < s.length(); right++){
            char currChar = s.charAt(right);

            // If we see a duplicate, shrink sliding window from the left
            while(seen.contains(currChar)){
                seen.remove(s.charAt(left));
                left++;
            }

            //Add current character to the set and update max
            seen.add(currChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
