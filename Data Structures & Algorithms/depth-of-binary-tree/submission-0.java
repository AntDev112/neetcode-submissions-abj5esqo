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
    private Integer maxHeight;

    public int maxDepth(TreeNode root) {
        maxHeight = 0;
        max(root, 0);
        return maxHeight;
    }

    public void max(TreeNode root, int currHeight) {
        if(root == null) {
            maxHeight = Math.max(currHeight, maxHeight);
            return;
        }

        max(root.left, currHeight+1);
        max(root.right, currHeight + 1);
    }
}
