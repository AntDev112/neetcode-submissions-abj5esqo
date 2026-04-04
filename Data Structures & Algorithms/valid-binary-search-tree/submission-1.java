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
    public boolean isValidBST(TreeNode root) { 
        return isValidDfs(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidDfs(TreeNode root, int lower, int upper) {
        if (root == null) {
            return true;
        }

        if(root.val <= lower || root.val >= upper) return false;

        return isValidDfs(root.left, lower,root.val) && isValidDfs(root.right,root.val,upper);

        
        
    }


}
