class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] arrExpanded = new int[n*2];
        for (int i = 0; i < arrExpanded.length; i++) {
            arrExpanded[i] = nums[i%n];
        }
        return arrExpanded;
    }
}