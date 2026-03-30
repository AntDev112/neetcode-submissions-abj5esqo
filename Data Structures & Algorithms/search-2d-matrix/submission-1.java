class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        for(int i=0; i < matrix.length;i++) {
            int left = 0;
            int right = matrix[0].length-1;
            while (left <= right) {
                int middle = (left+right)/2;
                if (target < matrix[i][middle]) {
                    right = middle - 1;
                } else if(target > matrix[i][middle]) {
                    left = middle+1;
                } else {
                    return true;
                }
            }
        }

        return false;
       
    }
}
