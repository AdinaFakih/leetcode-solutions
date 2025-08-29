class Solution {
    public int strStr(String haystack, String needle) {
        int x = haystack.length();
        int y = needle.length();

        if (y > x)return -1;

        for (int i = 0; i <= x - y; i++) {
            if (haystack.substring(i, i + y).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
