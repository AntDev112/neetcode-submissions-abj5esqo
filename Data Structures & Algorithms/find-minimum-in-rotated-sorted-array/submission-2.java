class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int min = Integer.MAX_VALUE;
        
        while (l <= r) {
            if (nums[l] < nums[r]) {
                min = Math.min(min, nums[l]);
                break;
            }
            
            int mid = (l + r) / 2;
            min = Math.min(min, nums[mid]);
            
            if (nums[mid] >= nums[r]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        
        return min;
    }
}