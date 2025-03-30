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

    public int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        inorderTraversal(root);
        return ans;
    }

    public void inorderTraversal(TreeNode root){
        if(root == null) return;

        inorderTraversal(root.left);
        ans = Math.max(ans,maxDepth(root.left)+maxDepth(root.right));
        inorderTraversal(root.right);
    }

    public int maxDepth(TreeNode root){
        if(root == null) return 0;

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}