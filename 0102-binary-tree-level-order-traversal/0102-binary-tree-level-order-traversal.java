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
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;

        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            if(ans.size() == level){
                ans.add(new ArrayList<>());
            }

            for(int i = 0;i < levelSize;i++){
                TreeNode temp = queue.poll();

                ans.get(level).add(temp.val);

                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            level++;
        }
        return ans;
    }
}