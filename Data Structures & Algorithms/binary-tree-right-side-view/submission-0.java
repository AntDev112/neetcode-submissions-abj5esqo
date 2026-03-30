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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        if(root == null) {
            return result;
        }
        queue.addLast(root);
        result.add(root.val);
        while(!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode curr = queue.pollFirst();
                if(curr.left != null) {
                    queue.addLast(curr.left);
                }
                if(curr.right != null) {
                    queue.addLast(curr.right);
                }
            }
            addToList(queue,result);
        }
            return result;
    }

    public void addToList(Deque<TreeNode> queue, List<Integer> result) {
            if(queue.size() == 1) {
                result.add(queue.peekFirst().val);
            } else if(queue.size() > 1) {
                result.add(queue.peekLast().val);
            }
        }
    }
