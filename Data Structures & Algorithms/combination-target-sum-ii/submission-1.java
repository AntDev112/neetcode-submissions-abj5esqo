class Solution {
    private List<List<Integer>> result;
    private List<Integer> subset;
    private int target;
    private int [] candidates;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new ArrayList<>();
        subset = new ArrayList<>();
        this.candidates = candidates;
        this.target = target;
        Arrays.sort(candidates);
        dfs(0,subset,0);
        return result;
    }

    public void dfs(int i, List<Integer> curSubset, int total) {
        if(total == target) {
            result.add(new ArrayList<>(curSubset));
            return;
        }
        if(i >= candidates.length || total > target) {
            return;
        }
        curSubset.add(candidates[i]);
        dfs(i+1,curSubset,total+candidates[i]);
        curSubset.remove(curSubset.size() - 1);
        while(i+1 < candidates.length && candidates[i+1] == candidates[i]) {
            i++;
        }
        dfs(i+1,curSubset,total);
    }

}
