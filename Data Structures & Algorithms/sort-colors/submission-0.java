class Solution {
    public void sortColors(int[] nums) {
        int [] colors = {0,0,0};
        for (int i = 0; i < nums.length; i++) {
            colors[nums[i]]+=1;
        }
        int colorPointer = 0;
        for (int j=0; j < colors.length; j++) {
            for (int k = 0; k < colors[j]; k++) {
                nums[colorPointer] = j;
                colorPointer++;
            }
        }

    }
}