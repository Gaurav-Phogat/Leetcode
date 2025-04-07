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

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);

    public int kthSmallest(TreeNode root, int k) {
        dfs(root,0,k);
        return maxHeap.poll();
    }
    public void dfs(TreeNode node,int level,int target){
        if(node == null) return;
        
        maxHeap.offer(node.val);

        if(maxHeap.size() > target){
            maxHeap.poll();
        }
        dfs(node.left,level+1,target);
        dfs(node.right,level+1,target);
    }
}