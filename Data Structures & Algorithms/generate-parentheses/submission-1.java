class Solution {
    private List<String> result;
    private Integer n;
    public List<String> generateParenthesis(int n) {
         result = new ArrayList<>();
         this.n = n;
         backtrack("", 0, 0);
         return result;
    }

public void backtrack(String curr, int openCount, int closedCount) {
    if (openCount == n && closedCount == n) {
        result.add(curr);
        return;
    }

    if (openCount < n)
        backtrack(curr + "(", openCount + 1, closedCount);
    if (closedCount < openCount)
        backtrack(curr + ")", openCount, closedCount + 1);
}
}
