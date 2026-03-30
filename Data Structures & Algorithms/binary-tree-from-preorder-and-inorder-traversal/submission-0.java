class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        // root value is preorder[0]
        int mid = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                mid = i;
                break;
            }
        }

        TreeNode root = new TreeNode(preorder[0]);

        // left subtree using the next 'mid' nodes in preorder and the first 'mid' in inorder
        TreeNode left = buildTree(
                java.util.Arrays.copyOfRange(preorder, 1, mid + 1),
                java.util.Arrays.copyOfRange(inorder, 0, mid)
        );

        // right subtree
        TreeNode right = buildTree(
                java.util.Arrays.copyOfRange(preorder, mid + 1, preorder.length),
                java.util.Arrays.copyOfRange(inorder, mid + 1, inorder.length)
        );

        root.left = left;
        root.right = right;
        return root;
    }
}
