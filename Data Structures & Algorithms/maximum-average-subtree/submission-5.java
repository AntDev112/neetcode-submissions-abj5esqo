/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private double maxAvg;
    public double maximumAverageSubtree(TreeNode root) {
        maxAvg = 0;
        dfs(root);
        return maxAvg;
    }

    public int [] dfs(TreeNode root) {
        if(root == null) {
            int [] toReturn = {0,0};
            return toReturn;
        }
        int [] left = dfs(root.left);
        int [] right = dfs(root.right);

        int sum = left[0] + right[0] + root.val;
        int nodeCount = left[1] + right[1] + 1;
        maxAvg = Math.max(maxAvg, (double) sum/nodeCount);

        int [] toReturn = {sum,nodeCount};
        
        return toReturn;
    }

}
