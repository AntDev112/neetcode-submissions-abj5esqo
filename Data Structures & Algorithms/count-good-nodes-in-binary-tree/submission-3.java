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
    private Integer counter;
    public int goodNodes(TreeNode root) {
        counter = 0;
        dfs(root,root.val);
        return counter;
    }

    private void dfs(TreeNode root, int max) {
        if(root == null) {
            return;
        }
        max = Math.max(max,root.val);

        if(root.val >= max) {
            counter++;
        }
        dfs(root.left,max);
        dfs(root.right,max);

    }
}
