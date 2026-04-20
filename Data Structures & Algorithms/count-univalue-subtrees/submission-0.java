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
    private int counter;
    public int countUnivalSubtrees(TreeNode root) {
        counter = 0;
        dfs(root);
        return counter;
    }

    public boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean isLeftUnival = dfs(root.left);
        boolean isRightUnival = dfs(root.right);

        boolean leftOk  = (root.left == null)  || (isLeftUnival  && root.left.val  == root.val);
        boolean rightOk = (root.right == null) || (isRightUnival && root.right.val == root.val);

        boolean unival = leftOk && rightOk;

        if(leftOk && rightOk) {
            counter++;
        }

        return unival;

    }
}
