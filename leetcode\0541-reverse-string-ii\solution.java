class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for(int start = 0; start < s.length(); start += 2 * k){
            int end = Math.min(start + k - 1, s.length() - 1);

            int left = start, right = end;
            while (left < right){
                char temp = chars[left]; 
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
