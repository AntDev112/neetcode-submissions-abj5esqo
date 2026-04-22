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
    Integer count;
    Integer maxCount;

    public int largestBSTSubtree(TreeNode root) {
        maxCount = 0;
        dfs(root);
        return maxCount;
    }

    public int [] dfs(TreeNode root) {
        if(root == null) {
            return new int [] {0, Integer.MAX_VALUE,Integer.MIN_VALUE};
        }

        int [] left = dfs(root.left);
        int [] right = dfs(root.right);


        if(left[0] == -1 || right[0] == -1) {
            return new int[] {-1, Math.min(root.val,left[2]) , Math.max(root.val,right[1])};
        }

        if (root.val > left[2] && root.val  < right[1]) {
            maxCount = Math.max(maxCount, left[0] + right[0] + 1);
            return new int[] {left[0] + right[0] + 1, Math.min(root.val,left[1]) , Math.max(root.val,right[2])};
        } else {
            return new int[] {-1, Math.min(root.val,left[1]) , Math.max(root.val,right[2])};
        }

    }
}
