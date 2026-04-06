class Solution {
    private List<String> result;
    private Integer n;
    public List<String> generateParenthesis(int n) {
         result = new ArrayList<>();
         this.n = n;
         backtrack("",'(');
         return result;
    }

    public void backtrack(String curr, char addedChar) {
        int openParenthesisCount = countChar(curr, '(');
        int closedParenthesisCount = countChar(curr, ')');
        
        if(closedParenthesisCount > openParenthesisCount) {
            return;
        }

        if(openParenthesisCount == n && closedParenthesisCount == n && !result.contains(curr)) {
            result.add(curr);
            return;
        }

        if(curr.length() > 2*n) {
            return;
        }

        curr+=addedChar;
        backtrack(curr,'(');
        backtrack(curr,')');
        
    }

    public int countChar(String curr, char target) {
        return (int) curr.chars().filter(c -> c == target).count();
    }
}
