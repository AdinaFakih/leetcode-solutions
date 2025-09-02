class Solution {
    public int secondHighest(String s) {
        // Create an array of size 10 to mark digits that appear (0-9)
        boolean[] seen = new boolean[10];

        // Step 1: Mark all digits that appear in s
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                seen[c - '0'] = true; // mark that digit as seen
            }
        }

        // Step 2: Traverse from 9 to 0 to find the largest and second largest
        int count = 0;
        for (int i = 9; i >= 0; i--) {
            if (seen[i]) {
                count++;
                if (count == 2) {
                    return i; // return the second largest
                }
            }
        }

        return -1; // no second largest found
    }
}
