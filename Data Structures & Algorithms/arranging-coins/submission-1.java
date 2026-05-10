class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int level = 1;
        
        if( n == 1) {
            return 1;
        }

        while (n > 0) {
            n = n - level;

            if (n > 0) {
                count++;
            }

            level++;
        }

        return count;
    }
}