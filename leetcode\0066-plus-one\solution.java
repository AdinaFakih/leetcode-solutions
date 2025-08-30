class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >=0 ; i--){
            if(digits[i] != 9) {
                digits[i]++;  // just add 1 and return
                return digits;
            } 
            digits[i] = 0;  // set current digit to 0, carry 1 to next loop iteration
        }
        // if we reach here, all digits were 9 
        int[] result = new int[digits.length + 1]; 
        result[0] = 1; // e.g. 999 + 1 = 1000 
        return result; 
    }
}
