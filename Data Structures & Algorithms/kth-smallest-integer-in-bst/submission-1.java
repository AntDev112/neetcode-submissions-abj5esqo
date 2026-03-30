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

    public int kthSmallest(TreeNode root, int k) {
        counter = k;
        return (int) findSmallest(root);
    }

    public Integer findSmallest(TreeNode root) {
        if(root == null) {
            return null;
        }

        Integer left = findSmallest(root.left);
        if(left != null) {
            return left;
        }
        counter--;
        if(counter == 0) {
            return root.val;
        }
        return findSmallest(root.right);
    } 
}
