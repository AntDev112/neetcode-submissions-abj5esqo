class Solution {
    private String word;
    private Set<Character> path;
    private char [][] board;
    private boolean [][] visited;
    public boolean exist(char[][] board, String word) {
        this.word = word;
        this.board = board;
        path = new HashSet<>();
        visited = new boolean[board.length][board[0].length];
        for(int i=0; i < board.length;i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(searchWord(0,i,j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchWord(int i, int j, int k) {
        if (i == word.length()) {
            return true;
        }
        if(j < 0 || k < 0 || j >= board.length || k >= board[0].length || i > word.length() || word.charAt(i) != board[j][k] || visited[j][k]) {
            return false;
        }
        visited[j][k] = true;
        boolean result = searchWord(i+1,j+1,k) || searchWord(i+1,j,k+1) || searchWord(i+1,j-1,k)
        || searchWord(i+1,j,k-1);
        visited[j][k] = false;
        return result;
    }
}
