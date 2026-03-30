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
    public int counter;
    public int result;

    public int kthSmallest(TreeNode root, int k) {
      counter = k;
      inorder(root);
      return result;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        counter--;
        if(counter == 0) {
            result = root.val;
            return;
        }
        inorder(root.right);
    }
}
