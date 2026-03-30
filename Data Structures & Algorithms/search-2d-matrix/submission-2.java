class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int columns = matrix[0].length;
        int leftRow = 0;
        int rightRow = row-1;

        while(leftRow <= rightRow) {
            int midRow = (leftRow+rightRow) / 2;
            if(target > matrix[midRow][columns-1]) {
                leftRow = midRow+1;
            } else if(target < matrix[midRow][0]) {
                rightRow = midRow-1;
            } else {
                break;
            }
        }

        if (leftRow > rightRow) {
            return false;
        }

        int leftColumn = 0;
        int rightColumn = columns-1;
        int midRow = (leftRow + rightRow) / 2;
        while(leftColumn <= rightColumn) {
            int middle = (leftColumn + rightColumn) / 2;
            if(target < matrix[midRow][middle]) {
                rightColumn = middle-1;
            } else if(target > matrix[midRow][middle]) {
                leftColumn = middle+1;
            } else {
                return true;
            }
        }

        return false;
    }
}
