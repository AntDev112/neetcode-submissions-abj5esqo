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
    public TreeMap<Integer,List<int[]>> positions;
    public List<List<Integer>> verticalOrder(TreeNode root) {
      positions = new TreeMap<>();
      dfs(root,0,0);

      return createList(positions);

    }

public void dfs(TreeNode root, int position, int height) {
    if(root == null) return;
    
    int[] toAdd = {root.val, height};
    
    if(!positions.containsKey(position)) {
        List<int[]> newList = new ArrayList<>();
        newList.add(toAdd);
        positions.put(position, newList);
    } else {
        positions.get(position).add(toAdd);
    }
    
    dfs(root.left, position - 1, height + 1);
    dfs(root.right, position + 1, height + 1);
}

public List<List<Integer>> createList(TreeMap<Integer, List<int[]>> positions) {
    List<List<Integer>> result = new ArrayList<>();
    for(List<int[]> position : positions.values()) {
        Collections.sort(position, (a, b) -> a[1] - b[1]);
        List<Integer> toAdd = position.stream()
            .map(pair -> pair[0])
            .collect(Collectors.toList());
        result.add(toAdd);
    }
    return result;
}

}