class Solution {
    private HashSet<List<Integer>> result;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        result = new HashSet<>();
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>());
        return new ArrayList<>(result);
    }

    public void backtrack(int[] nums, int i, List<Integer> sub) {
        result.add(new ArrayList<>(sub));
        if(i >= nums.length || i < 0) {
            return;
        }

        sub.add(nums[i]);
        backtrack(nums,i+1,sub);
        sub.remove(sub.size() -1);
        backtrack(nums,i+1,sub);
        return;
    }
}
