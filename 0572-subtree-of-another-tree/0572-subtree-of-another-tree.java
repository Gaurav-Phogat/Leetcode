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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;

        Queue<TreeNode> traversal = new LinkedList<>();
        traversal.add(root);

        while(!traversal.isEmpty()){
            int levelSize = traversal.size();

            for(int i = 0;i < levelSize; i++){
                TreeNode temp = traversal.poll();

                if(temp.val == subRoot.val){
                    boolean ans = checkEqual(temp,subRoot);
                    if(ans == true) return true;
                }
                if(temp.left != null){
                    traversal.add(temp.left);
                }
                if(temp.right != null){
                    traversal.add(temp.right);
                }
            }
        }
        return false;
    }
    public boolean checkEqual(TreeNode root,TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;

        if(root.val != subRoot.val) return false;

        return checkEqual(root.left,subRoot.left) && checkEqual(root.right,subRoot.right);
    }
}