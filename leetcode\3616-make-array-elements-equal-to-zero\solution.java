class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0; 
        
        for (int i = 0; i < n; i++){
            if (nums[i] == 0){
                if (simulate(nums, i, -1)) count++;
                if (simulate(nums, i, 1))  count++;
            }
        }
        return count;
    }    

    private boolean simulate(int[] nums, int start, int direction){
        int[] arr = nums.clone();
        int n = arr.length;
        int curr = start; 

        while (curr >= 0 && curr < n){
            if (arr[curr] == 0){
                curr += direction;
            } else {
                arr[curr] -= 1;
                direction = -direction;
                curr += direction;
            }
        }

        for (int num : arr){
            if(num != 0) return false; 
        }
        return true;
    }
}
