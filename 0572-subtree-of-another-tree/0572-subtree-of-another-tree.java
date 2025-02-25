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

        if((root == null) != (subRoot == null)) return false;

        Queue<TreeNode> traversal = new LinkedList<>();
        traversal.add(root);

        while(!traversal.isEmpty()){

            int levelSize = traversal.size();

            for(int i = 0;i < levelSize ; i++){
                TreeNode temp = traversal.poll();
                if(temp == null) continue;
                if(temp.val == subRoot.val){
                    boolean contains = checkForSubTree(temp,subRoot);
                    if(contains == true) return true;
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

    public boolean checkForSubTree(TreeNode root,TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null || root.val != subRoot.val) return false;
        
        return (
            checkForSubTree(root.left,subRoot.left)
            &checkForSubTree(root.right,subRoot.right)
         );
    }
}