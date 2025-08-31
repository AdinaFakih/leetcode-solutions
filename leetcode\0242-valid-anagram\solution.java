class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        // int[] counts = new int[26]; // for 26 lowercase letters
        // for (char c : s.toCharArray()) {
        //     counts[c - 'a']++; // increment for s
        // }
        // for (char c : t.toCharArray()) {
        //     counts[c - 'a']--; // decrement for t
        // }
        // for (int count : counts) {
        //     if (count != 0) return false; // mismatch found
        // }
        // return true;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}
