class Solution {
        public List<List<Integer>> combinationSum(int[] nums, int target) {
                List<Integer> subset = new ArrayList<>();
                List<List<Integer>> result = new ArrayList<>();
                        dfs(nums,0,target,0,subset,result);
                        return result;
        }
        public void dfs(int [] nums, int i, int target, int curSum, List<Integer> subset, List<List<Integer>> result) {
                if(curSum == target) {
                   result.add(new ArrayList<>(subset)); 
                   return;    
                }
                if (i >= nums.length || curSum > target) {
                return;
        }
                subset.add(nums[i]);
                curSum+=nums[i];
                dfs(nums, i, target, curSum, subset, result);
                curSum-=nums[i];
                subset.remove(subset.size()-1);
                dfs(nums,i+1,target,curSum,subset,result);

        }
}
                                                                                                                                                