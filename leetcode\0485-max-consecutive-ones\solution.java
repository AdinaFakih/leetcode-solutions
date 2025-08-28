class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxcount = 0;

        for (int n : nums){
            if (n == 1){
                count++;
                maxcount = Math.max(maxcount, count);
            } else {
                count = 0;
            }
        }
        return maxcount;
    }
}
