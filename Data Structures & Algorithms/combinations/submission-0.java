class Solution {
    private int n;
    private int k;
    private List<List<Integer>> result;
    private List<Integer> curr;
    public List<List<Integer>> combine(int n, int k) {
        this.result = new ArrayList<>();
        this.curr = new ArrayList<>();
        this.n = n;
        this.k = k;
        backtrack(1);
        return result;
    }

    public void backtrack(int i) {
        
        if(i > n && curr.size() == k) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if(i > n || curr.size() > k) return;

        if(curr.size() == k) {
            result.add(new ArrayList<>(curr));
            return;
        }

        curr.add(i);
        backtrack(i+1);
        curr.remove(curr.size()-1);
        backtrack(i+1);
    }
}