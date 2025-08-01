class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;

        int uniqueIndex = 0;

        for (int currentIndex = 1; currentIndex < nums.length; currentIndex++){
            if(nums[currentIndex] != nums[uniqueIndex]){
                uniqueIndex++;
                nums[uniqueIndex] = nums[currentIndex];
            }
        }
        return uniqueIndex + 1;
    }
}
