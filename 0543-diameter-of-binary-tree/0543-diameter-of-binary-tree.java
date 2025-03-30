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
    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDepthAndDiameter(root);
        return ans;
    }

    private int calculateDepthAndDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = calculateDepthAndDiameter(root.left);
        int rightDepth = calculateDepthAndDiameter(root.right);

        // Update the diameter at the current node
        ans = Math.max(ans, leftDepth + rightDepth);

        // Return the depth of the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}