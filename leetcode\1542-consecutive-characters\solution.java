class Solution {
    public int maxPower(String s) {
        int max = 1;                 // at least 1 because s is non-empty
        int curr = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;              // extend the run
            } else {
                curr = 1;            // reset for new character
            }
            if (curr > max) max = curr;
        }
        return max;
    }
}
