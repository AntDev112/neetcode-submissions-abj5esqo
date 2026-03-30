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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        inorder(inorderList,root);
        return inorderList;
    }

    public void inorder(List<Integer> inorderList, TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(inorderList,root.left);
        inorderList.add(root.val);
        inorder(inorderList,root.right);
    }
}