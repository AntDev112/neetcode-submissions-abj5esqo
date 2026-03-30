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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> pq = new LinkedList<>();
        if (root == null) {
            return result;
        }
        pq.add(root);
        while(!pq.isEmpty()) {
            List<Integer> currList = new ArrayList<>();
            int pqSize = pq.size();
            for(int i = 0; i < pqSize; i++) {
            TreeNode curr  = pq.poll();
            currList.add(curr.val);
            if(curr.left != null) {
                pq.add(curr.left);
            }
            if(curr.right != null) {
                pq.add(curr.right);
            }
        }
        result.add(currList);
    }
        return result;
    }
}
