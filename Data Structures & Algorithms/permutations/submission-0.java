class Solution {
    private List<Integer> sub;
    private List<List<Integer>> result;
    private boolean [] used;
    public List<List<Integer>> permute(int[] nums) {
        used = new boolean [nums.length];
        sub =  new ArrayList<>();
        result = new ArrayList<>();
        backtrack(nums,used,sub);
        return result;
    }

    public void backtrack(int [] nums, boolean [] used, List<Integer> sub) {
        if(sub.size() == nums.length) {
            result.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                sub.add(nums[i]);
                used[i] = true;
                backtrack(nums,used,sub);
                sub.remove(sub.size() - 1);
                used[i] = false;
            }
        }
    }
}
