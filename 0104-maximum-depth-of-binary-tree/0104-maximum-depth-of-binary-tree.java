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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));

     /* if(root == null) return 0;

      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      int depth = 0;

      while(!queue.isEmpty()){
        depth++;
        int levelSize = queue.size();
        for(int i = 0; i < levelSize;i++){

            TreeNode temp = queue.poll();

            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
      }
      return depth;
      */
     /*
      if(root == null) return 0;

      Stack<Pair<TreeNode,Integer>> stack = new Stack<>();

      stack.push(new Pair<>(root, 1));
      int maxDepth = 0;

      while (!stack.isEmpty()) {

        Pair<TreeNode,Integer> curr = stack.pop();
        TreeNode node = curr.getKey();
        int depth = curr.getValue();

        if(node != null){
            maxDepth = Math.max(maxDepth,depth);
            stack.push(new Pair<>(node.left,depth+1));
            stack.push(new Pair<>(node.right,depth+1));
        }
      }
      return maxDepth; */
    }
}