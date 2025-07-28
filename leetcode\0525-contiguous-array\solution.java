class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> countToIndex = new HashMap<>();
        countToIndex.put(0,-1);

        int maxLength = 0; 
        int count = 0; 

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count +=1;
            } else {
                count -= 1;
            }

            if (countToIndex.containsKey(count)) {
                int previousIndex = countToIndex.get(count);
                int currentLength = i - previousIndex;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                countToIndex.put(count, i);
            }
        }
        return maxLength; 
    }
}
